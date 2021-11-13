import java.util.Scanner;

/*
input
1
KKHSSSSSSSE

2
KSTTTSEEKFKKKDJJGG

output
1
K2HS7E

2
KST3SE2KFK3DJ2G2
 */

public class Main {
    public String solution(String str) {
       String answer = "";
       str = str + " ";

       int cnt = 1;
       for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            }
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += cnt;
                cnt = 1;
            }
       }

       return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.print(T.solution(str));
        

        return ;
    }
}
