import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> contracts = new ArrayList<>();
    static ArrayList<String> code_lines = new ArrayList<>();
    static int T ;
    static void input(){
        String s;
        Scanner scanner = new Scanner(System.in);
        while(!(s = scanner.nextLine()).equals("END")){
            code_lines.add(s.replaceAll(" ", ""));
        }
        int n = scanner.nextInt();
        T = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            contracts.add(scanner.nextLine().concat("0"));
        }
    }
    public static void main(String[] args) throws IOException {
        input();
        Program program = new Program() ;
        String cpp_code = program.make_CPP_code(code_lines,contracts,T);
        System.out.print(cpp_code);
    }

}
