import java.util.Scanner;

/*
input
StuDY

output
sTUdy
 */

public class Main {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (x >= 'a' && x <= 'z') {
                sb.append(Character.toUpperCase(x));
            }
            else {
                sb.append(Character.toLowerCase(x));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
        return ;
    }
}
