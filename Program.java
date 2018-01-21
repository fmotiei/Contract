import java.util.ArrayList;

public class Program {
    String make_CPP_code(ArrayList<String> contract_code){
        String top_code = "" ;
        String main_code = "" ;
        for( int i = 0 ; i < contract_code.size() ; i ++ ){
            Node root = new Node() ;//TODO graph root for contract_code.get(i)
            DFS g = new DFS();
            g.dfs(root);
            if( root.type.equals("function_assignment"))
                top_code = top_code.concat(root.val);
            else
                main_code = main_code.concat(root.val);

        }
        String cpp_code = "" ;
        Initial_CPP_codes cpp_codes = new Initial_CPP_codes();
        cpp_code = cpp_code.concat(cpp_codes.init()+"\n");
        cpp_code = cpp_code.concat(cpp_codes.contractClass() + "\n");
        cpp_code = cpp_code.concat(top_code);
        cpp_code = cpp_code.concat(cpp_codes.mkdate());
        cpp_code = cpp_code.concat(cpp_codes.one());
        cpp_code = cpp_code.concat(cpp_codes.give());
        cpp_code = cpp_code.concat(cpp_codes.scale());
        cpp_code = cpp_code.concat(cpp_codes.truncate());
        cpp_code = cpp_code.concat(cpp_codes.andFunction());
        cpp_code = cpp_code.concat(cpp_codes.then());
        cpp_code = cpp_code.concat("int main(){\n" + main_code + " return 0 ; \n }\n");
        //TODO write algorithm
        return cpp_code ;
    }
}