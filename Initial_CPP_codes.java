import java.util.ArrayList;

public class Initial_CPP_codes {
    String init(){
        return "#include <iostream>\n" +
                "#include <iomanip>\n" +
                "#include <algorithm>\n" +
                "\n" +
                "\n" +
                "using namespace std ;\n" ;
    }

    String contractClass(){
        return "struct Contract{\n" +
                "public:\n" +
                "    int date ;\n" +
                "    double val ;\n" +
                "};";
    }

    String mkdate(){
        return "\n" +
                "int mkdate(int arg1,int arg2){\n" +
                "    return arg1*24 + arg2 ;\n" +
                "}";
    }

    String andFunction(){
        return "Contract andFunc(Contract c1,Contract c2){\n" +
                "    Contract c3 ;\n" +
                "    c3.date = max(c1.date,c2.date);\n" +
                "    c3.val = c1.val + c2.val ;\n" +
                "    return c3 ;\n" +
                "}";
    }

    String one(){
        return "Contract one(){\n" +
                "    Contract c1 ;\n" +
                "    c1.date = INT32_MAX ;\n" +
                "    c1.val = 1 ;\n" +
                "    return c1 ;\n" +
                "}";
    }

    String give(){
        return "Contract give(Contract c1){\n" +
                "    c1.val = -c1.val ;\n" +
                "    return c1 ;\n" +
                "}";
    }

    String scale(){
        return "Contract scale(double d , Contract c1){\n" +
                "    c1.val = c1.val*d ;\n" +
                "    return c1 ;\n" +
                "}";
    }

    String truncate(){
        return "Contract truncate(int d,Contract c1){\n" +
                "    c1.date = d ;\n" +
                "    return c1 ;\n" +
                "}";
    }

    String then(){
        return "Contract then(Contract c1,Contract c2){\n" +
                "    if( T > c1.date )\n" +
                "        return c2 ;\n" +
                "    else\n" +
                "        return c1 ;\n" +
                "}";
    }

    String initial_variable(){
        return "\n" +
                "int T ;\n" +
                "vector<Contract> contracts ;";
    }

    String ValueOfContract(){
        return "double ValueOfContract(Contract c1){\n" +
                "    if( T <= c1.date )\n" +
                "        return c1.val ;\n" +
                "    else\n" +
                "        return c1.val ;\n" +
                "}\n";
    }

    String algorithm(String main_code, ArrayList<String> contracts, int T){
        String code = "\n" +
                "    int T = " + Integer.toString(T) +" ;\n" +
                "    double Ans = 0 ;\n" +
                "    int FirstT = T ;\n" +
                "    int Contract1 = 0 ;\n" ;
        for( int i = 0 ; i < contracts.size() ; i++ ){
            String code_contract = "Contract1 = 0 ;\n" +
                    "        for (int t = 0; t < 365 * 24; t++) {\n" +
                    "            T = FirstT + t;\n" +
                    main_code + "\n" +
                    "            int Value = ValueOfContract("+contracts.get(i)+");\n" +
                    "            Contract1 = max( Contract1,Value);\n" +
                    "        }\n" +
                    "        Ans += Contract1 ;\n";
            code = code.concat(code_contract);
        }
        code = code.concat("cout << Ans << endl ;\n");
        return code ;

    }
}
