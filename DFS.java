import java.util.ArrayList;

public class DFS {

    ArrayList<String> integers ;
    ArrayList<String> dates ;
    ArrayList<String> doubles ;
    ArrayList<String> contracts ;
    ArrayList<String> functions ;
    ArrayList<String> functions_returnType ;
    ArrayList<String> functions_inputType ;

    String concat_childs(Node v){
        String s = "";
        for( int i = 0 ; i < v.child_size() ; i ++ )
            s.concat(v.get_child(i).val) ;
        return s ;
    }

    void check_vg(Node v){
        if( v.get_child(0).name.equals("::")){
            v.type = "deceleration" ;
            v.val = v.get_child(1).val ;
        }
        else if( v.get_child(0).name.equals("(")){
            v.type = "functionCall";
            v.val = concat_childs(v) ;
        }
        else if( v.get_child(0).name.equals("=")){
            v.type = "assignment";
            v.val = v.get_child(1).val ;
        }
    }

    void check_ex(Node v){
        v.type = "ex";
        v.val = concat_childs(v) ;
    }

    void check_b(Node v){
        v.type = "ex";
        if( v.child_size() == 0){
            v.val = "" ;
        }
        else if( v.get_child(0).name.equals( "+") || v.get_child(0).name.equals("-") || v.get_child(0).name.equals( "*") || v.get_child(0).name.equals("/") )
            v.val = concat_childs(v);
    }

    void check_vc(Node v){
        v.type = "vc" ;
        if( v.get_child(1).type.equals( "ve" ))
            v.val = concat_childs(v);
        else if( v.get_child(1).type.equals( "vd" ))
            v.val = concat_childs(v) ;
        else if( v.get_child(0).name.equals( "("))
            v.val = concat_childs(v) ;
        else if( v.get_child(0).type.equals( "vf" ) )
            v.val = v.get_child(0).val ;
    }

    void check_vf(Node v){
        v.type = "vf" ;
        if( v.get_child(0).name.equals( "mkdate"))
            v.val = concat_childs(v) ;
        else if( v.get_child(0).name.equals( "then") ||  v.get_child(0).name.equals( "scale") || v.get_child(0).name.equals("truncate" ))
            v.val = concat_childs(v) ;
        else if( v.get_child(0).name.equals( "and") )
            v.val = "andFunc( " + v.get_child(2).val + v.get_child(3).val + v.get_child(4).val + v.get_child(5).val ;
        else if( v.get_child(0).name.equals( "scaleX"))
            v.val = "scale( " + v.get_child(2).val + "( T )" + v.get_child(4).val + ")" ;
        else if( v.get_child(0).name.equals( "one()" ))
            v.val = v.get_child(0).val ;
        else if( v.get_child(0).name.equals( "give" ))
            v.val = concat_childs(v) ;

    }

    void check_vd(Node v){
        v.type = "vd" ;
        if( v.child_size() == 0 )
            v.val = "" ;
        else if( v.get_child(0).val.equals( "." ))
            v.val = concat_childs(v) ;
    }

    void check_ars(Node v){
        v.type = "ars";
        v.val = concat_childs(v) ;
    }

    void check_ar(Node v){
        v.type = "ar" ;
        v.val = v.get_child(0).val ;
    }

    void check_ve(Node v){
        v.type = "ve" ;
        if( v.child_size() == 0 )
            v.val = "" ;
        else if( v.get_child(0).name.equals( "(" ))
            v.val = concat_childs(v) ;
    }

    void check_vj(Node v){
        v.type = "vj" ;
        if( v.child_size() == 0 )
            v.val = "" ;
        else if( v.child_size() == 1 )
            v.val = v.get_child(0).val ;
    }

    void check_vb(Node v){
        if( v.get_child(0).type.equals( "df" ) )
            v.type = "df" ;
        else
            v.type = "vb" ;
        v.val = v.get_child(0).val ;
    }

    void check_df(Node v){
        v.type = "df" ;
        v.val = concat_childs(v) ;
    }

    void check_va(Node v){
        v.type = "va" ;
        if( v.child_size() == 0 )
            v.val = "" ;
        else if( v.get_child(0).name.equals(",") )
            v.val = concat_childs(v) ;
    }

    void set_function(String type){
        int i = 0 ;
        while (type.charAt(i) != '-'){
            i ++ ;
        }
        String s = type.substring(0,i) ;
        functions_inputType.add(s) ;
        s = type.substring(i+2,type.length());
        functions_returnType.add(s);

    }

    void check_deceleration(Node v){
        if(v.get_child(1).get_child(1).type.equals("vb") ){
            String s = v.get_child(1).name ;
            if( s.equals("Int")) {
                v.val = "int" + " " + v.get_child(0).val + ";\n";
                integers.add(v.get_child(0).val);
            }
            if( s.equals("Double")){
                v.val = "double" + " " + v.get_child(0).val + ";\n" ;
                doubles.add(v.get_child(0).val);
            }
            if( s.equals("Date")){
                v.val = "int" + " " + v.get_child(0).val + ";\n" ;
                dates.add(v.get_child(0).val);
            }
            if( s.equals("Contract")){
                v.val = "Contract" + " " + v.get_child(0).val + ";\n" ;
                contracts.add(v.get_child(0).val);
            }
        }
        else if(v.get_child(1).type.equals("vf")){
            functions.add(v.get_child(0).val);
            set_function(v.get_child(1).val);
        }
    }

    boolean is_T(String s){
        for( int i = 0 ; i < integers.size() ; i ++ )
            if( integers.get(i).equals(s) )
                return true ;


        for( int i = 0 ; i < doubles.size() ; i ++ )
            if( doubles.get(i).equals(s) )
                return true ;


        for( int i = 0 ; i < dates.size() ; i ++ )
            if( dates.get(i).equals(s) )
                return true ;


        for( int i = 0 ; i < contracts.size() ; i ++ )
            if( contracts.get(i).equals(s) )
                return true ;

        return false ;
    }

    int is_function(String s){
        for( int i = 0 ; i < functions.size() ; i ++ )
            if( functions.get(i).equals(s) )
                return i ;
        return -1 ;
    }

    void check_assignment(Node v){
        if( is_T(v.get_child(0).name))
            v.val = v.get_child(0).val + " = " + v.get_child(1).val + "; \n" ;

        int x = is_function(v.get_child(0).name);
        if( x != -1 )
            v.val = functions_returnType.get(x) + " " + v.get_child(0).val + functions_inputType.get(x) + "{"
                    + "return " + v.get_child(1).val + " ; } \n " ;

    }

    void check_r(Node v){
        v.type = "r" ;
        if( v.child_size() == 1 )
            v.val = v.get_child(0).val + ";\n" ;
        else if( v.get_child(1).type.equals("deceleration") )
            check_deceleration(v);
        else if( v.get_child(1).type.equals("assignment"))
            check_assignment(v);
    }

    void check_constant(Node v){
        v.val = v.name ;
    }

    void dfs(Node v){

        for( int i = 0 ; i < v.child_size() ; i ++ )
            dfs(v.get_child(i));

        if( v.name.equals( "vg"))
            check_vg(v);

        if( v.name.equals( "ex"))
            check_ex(v);

        if( v.name.equals( "b" ))
            check_b(v);

        if( v.name.equals( "vc" ))
            check_vc(v);

        if( v.name.equals( "vf" ))
            check_vf(v);

        if( v.name.equals( "vd" ))
            check_vd(v);

        if( v.name.equals( "ars" ))
            check_ars(v);

        if( v.name.equals( "ar" ))
            check_ar(v);

        if( v.name.equals( "ve" ))
            check_ve(v);

        if( v.name.equals( "vj" ))
            check_vj(v);

        if( v.name.equals( "vb" ))
            check_vb(v);

        if( v.name.equals( "df" ))
            check_df(v);

        if( v.name.equals( "va" ))
            check_va(v);

        if( v.name.equals("r"))
            check_r(v);
        else
            check_constant(v);
    }


}
