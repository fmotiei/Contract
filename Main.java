import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> contracts = new ArrayList<String>();
    static ArrayList<String> code_lines = new ArrayList<String>();
    static int T ;
    static void input(){
        String s = "";
        Scanner scanner = new Scanner(System.in);
        while(!(s = scanner.nextLine()).equals("END")){
            code_lines.add(s);
        }
        int n = scanner.nextInt();
        T = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            contracts.add(scanner.nextLine());
        }
    }
    public static void main(String[] args){
        input();
        Program program = new Program() ;
        String cpp_code = program.make_CPP_code(code_lines,contracts,T);
        System.out.print(cpp_code);
    }

}
