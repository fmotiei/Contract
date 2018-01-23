import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DFS {

    private ArrayList<String> integers = new ArrayList<>();
    private ArrayList<String> dates = new ArrayList<>();
    private ArrayList<String> doubles = new ArrayList<>();
    private ArrayList<String> contracts = new ArrayList<>();
    private ArrayList<String> functions = new ArrayList<>();
    private ArrayList<String> functions_returnType = new ArrayList<>();
    private ArrayList<String> functions_inputType = new ArrayList<>();

    private String concat_children(Node v) {
        String s = "";
        for (int i = 0; i < v.child_size(); i++)
            s = s.concat(v.get_child(i).val);
        return s;
    }

    private void check_vg(Node v) {
        if (v.get_child(0).name.equals("::")) {
            v.type = "deceleration";
            v.val = v.get_child(1).val;
        } else if (v.get_child(0).name.equals("(")) {
            v.type = "functionCall";
            v.val = concat_children(v);
        } else if (v.get_child(0).name.equals("=")) {
            v.type = "assignment";
            v.val = v.get_child(1).val;
        }
    }

    private void check_ex(Node v) {
        v.type = "ex";
        v.val = concat_children(v);
    }

    private void check_b(Node v) {
        v.type = "b";
        if (v.child_size() == 0) {
            v.val = "";
        } else if (v.get_child(0).name.equals("+") || v.get_child(0).name.equals("-") || v.get_child(0).name.equals("*") || v.get_child(0).name.equals("/"))
            v.val = concat_children(v);
    }

    private void check_vc(Node v) {
        v.type = "vc";
        if (v.child_size() > 1 && v.get_child(1).type.equals("ve"))
            v.val = concat_children(v);
        else if (v.child_size() > 1 && v.get_child(1).type.equals("vd"))
            v.val = concat_children(v);
        else if (v.get_child(0).name.equals("("))
            v.val = concat_children(v);
        else if (v.get_child(0).type.equals("vf"))
            v.val = v.get_child(0).val;
    }

    private void check_vf(Node v) {
        v.type = "vf";
        if (v.get_child(0).name.equals("mkdate"))
            v.val = concat_children(v);
        else if (v.get_child(0).name.equals("then") || v.get_child(0).name.equals("scale") || v.get_child(0).name.equals("truncate"))
            v.val = concat_children(v);
        else if (v.get_child(0).name.equals("and"))
            v.val = "andFunc( " + v.get_child(2).val + v.get_child(3).val + v.get_child(4).val + v.get_child(5).val;
        else if (v.get_child(0).name.equals("scaleX"))
            v.val = "scale( " + v.get_child(2).val + "( T ) , " + v.get_child(4).val + ")";
        else if (v.get_child(0).name.equals("one()"))
            v.val = v.get_child(0).val;
        else if (v.get_child(0).name.equals("give"))
            v.val = concat_children(v);

    }

    private void check_vd(Node v) {
        v.type = "vd";
        if (v.child_size() == 0)
            v.val = "";
        else if (v.get_child(0).val.equals("."))
            v.val = concat_children(v);
    }

    private void check_ars(Node v) {
        v.type = "ars";
        v.val = concat_children(v);
    }

    private void check_ar(Node v) {
        v.type = "ar";
        v.val = v.get_child(0).val;
    }

    private void check_ve(Node v) {
        v.type = "ve";
        if (v.child_size() == 0)
            v.val = "";
        else if (v.get_child(0).name.equals("("))
            v.val = concat_children(v);
    }

    private void check_vj(Node v) {
        v.type = "vj";
        if (v.child_size() == 0)
            v.val = "";
        else if (v.child_size() == 1)
            v.val = v.get_child(0).val;
    }

    private void check_vb(Node v) {
        if (v.get_child(0).type.equals("df"))
            v.type = "df";
        else if(v.get_child(0).val.equals("(Date)->Double"))
            v.type = "df";
        else
            v.type = "vb";
        v.val = v.get_child(0).val;
    }

    private void check_df(Node v) {
        v.type = "df";
        v.val = concat_children(v);
    }

    private void check_va(Node v) {
        v.type = "va";
        if (v.child_size() == 0)
            v.val = "";
        else if (v.get_child(0).name.equals(","))
            v.val = concat_children(v);
    }

    String Standard(String s){

        if( s.replaceAll(" ", "").equals("Int") )
            return "int" ;
        if( s.replaceAll(" ", "").equals("Double"))
            return "double" ;
        if( s.replaceAll(" ", "").equals("Date"))
            return "double" ;
        return s ;
    }

    private void set_function(String type) {
        int i = 0;
        while (type.charAt(i) != '-') {
            i++;
        }
        String s = type.substring(0, i);
        s = s.replaceAll("[()]", "");
        s = s.replaceAll(" ", "");
        String splitArgs[] = s.split(",");
        String result = "(" + Standard(splitArgs[0]) + " arg" + "10";

        for (int j = 1; j < splitArgs.length; j++) {
            result += ", " + Standard(splitArgs[j]) + " arg" + (j+1) + "0";
        }
        result += ")";
//        System.out.println("!!!!!!!"+result+"!!!!!!!!!");
        functions_inputType.add(result);

        s = type.substring(i + 2, type.length());
        s = Standard(s) ;
        functions_returnType.add(s);

    }

    private void check_deceleration(Node v) {
        if (v.child_size() > 1 && v.get_child(1).get_child(1).type.equals("vb")) {
            String s = v.get_child(1).val;
            if (s.equals("Int")) {
                v.val = "int" + " " + v.get_child(0).val + ";\n";
                integers.add(v.get_child(0).val);
            }
            if (s.equals("Double")) {
                v.val = "double" + " " + v.get_child(0).val + ";\n";
                doubles.add(v.get_child(0).val);
            }
            if (s.equals("Date")) {
                v.val = "int" + " " + v.get_child(0).val + ";\n";
                dates.add(v.get_child(0).val);
            }
            if (s.equals("Contract")) {
                v.val = "Contract" + " " + v.get_child(0).val + ";\n";
                contracts.add(v.get_child(0).val);
            }
        } else if (v.child_size() > 1 && v.get_child(1).get_child(1).type.equals("df")) {
            functions.add(v.get_child(0).val);
            set_function(v.get_child(1).val);
        }
    }

    private boolean is_T(String s) {
        for (String integer : integers)
            if (integer.equals(s))
                return true;


        for (String aDouble : doubles)
            if (aDouble.equals(s))
                return true;


        for (String date : dates)
            if (date.equals(s))
                return true;


        for (String contract : contracts)
            if (contract.equals(s))
                return true;

        return false;
    }

    private int is_function(String s) {
        for (int i = 0; i < functions.size(); i++)
            if (functions.get(i).equals(s))
                return i;
        return -1;
    }

    private void check_assignment(Node v) {
        if (is_T(v.get_child(0).val))
            v.val = v.get_child(0).val + " = " + v.get_child(1).val + "; \n";

        int x = is_function(v.get_child(0).val);
        if (x != -1) {
            v.type = "function_assignment";
            v.val = functions_returnType.get(x) + " " + v.get_child(0).val + functions_inputType.get(x) + "{"
                    + "return " + v.get_child(1).val + " ; } \n ";
        }

    }

    private void check_r(Node v) {
        v.type = "r";
        if (v.get_child(0).type.equals("vf"))
            v.val = v.get_child(0).val + ";\n";
        else if (v.child_size() > 1 && v.get_child(1).type.equals("deceleration"))
            check_deceleration(v);
        else if (v.child_size() > 1 && v.get_child(1).type.equals("assignment"))
            check_assignment(v);
        else if (v.child_size() > 1 && v.get_child(1).type.equals("functionCall"))
            v.val = concat_children(v) + "; \n";
    }

    private ArrayList<String> keywords = new ArrayList<>(Arrays.asList("mkdate", "and", "then", "scaleX", "scale", "truncate", "one()", "give"));

    private boolean is_Name(String s) {
        if (s.charAt(0) < 'a' || s.charAt(0) > 'z')
            return false;
        if (keywords.contains(s))
            return false;
        return true;
    }

    private void check_constant(Node v) {
        v.val = v.name;
        v.type = "Terminal";
        if (is_Name(v.name)) {
            v.type = "Name";
            v.val = v.val.concat("0");
        }
        if(v.name.equals("TimeFunc(Date)->Double"))
            v.val = "(Date)->Double" ;
    }

    void dfs(Node v) {

        for (int i = 0; i < v.child_size(); i++)
            dfs(v.get_child(i));

        switch (v.name) {
            case "vg":
                check_vg(v);
                break;
            case "ex":
                check_ex(v);
                break;
            case "b":
                check_b(v);
                break;
            case "vc":
                check_vc(v);
                break;
            case "vf":
                check_vf(v);
                break;
            case "vd":
                check_vd(v);
                break;
            case "ars":
                check_ars(v);
                break;
            case "ar":
                check_ar(v);
                break;
            case "ve":
                check_ve(v);
                break;
            case "vj":
                check_vj(v);
                break;
            case "vb":
                check_vb(v);
                break;
            case "df":
                check_df(v);
                break;
            case "va":
                check_va(v);
                break;
            case "r":
                check_r(v);
                break;
            default:
                check_constant(v);
                break;
        }
    }


}
