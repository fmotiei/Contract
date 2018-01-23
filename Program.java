import java.io.IOException;
import java.util.ArrayList;

public class Program {
    String make_CPP_code(ArrayList<String> contract_code,ArrayList<String> contracts, int T) throws IOException {
        String top_code = "" ;
        String main_code = "" ;
        DFS g = new DFS();
        for( int i = 0 ; i < contract_code.size() ; i ++ ){
            Node root = TreeUtil.getParseTree(contract_code.get(i)) ;
            g.dfs(root);
            if( root.type.equals("function_assignment"))
                top_code = top_code.concat(root.val);
            else
                main_code = main_code.concat("      "+root.val);

        }
        String cpp_code = "" ;
        Initial_CPP_codes cpp_codes = new Initial_CPP_codes();
        cpp_code = cpp_code.concat(cpp_codes.init()+"\n");
        cpp_code = cpp_code.concat(cpp_codes.contractClass() + "\n");
        cpp_code = cpp_code.concat(cpp_codes.initial_variable()+"\n");
        cpp_code = cpp_code.concat(top_code);
        cpp_code = cpp_code.concat(cpp_codes.mkdate());
        cpp_code = cpp_code.concat(cpp_codes.one());
        cpp_code = cpp_code.concat(cpp_codes.give());
        cpp_code = cpp_code.concat(cpp_codes.scale());
        cpp_code = cpp_code.concat(cpp_codes.truncate());
        cpp_code = cpp_code.concat(cpp_codes.andFunction());
        cpp_code = cpp_code.concat(cpp_codes.then());
        cpp_code = cpp_code.concat(cpp_codes.ValueOfContract());
        cpp_code = cpp_code.concat("int main(){\n" + cpp_codes.algorithm(main_code,contracts,T) + " return 0 ; \n }\n");
        return cpp_code ;
    }
}
