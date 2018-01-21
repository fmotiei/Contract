public class Initial_CPP_codes {
    String init(){
        return "#include <iostream>\n" +
                "#include <iomanip>\n" +
                "#include <algorithm>\n" +
                "\n" +
                "\n" +
                "using namespace std ;\n" +
                "\n" +
                "int T ;";
    }

    String contractClass(){
        return "class Contract{\n" +
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
}
