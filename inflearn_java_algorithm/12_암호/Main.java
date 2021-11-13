import java.util.Scanner;

/*
input
4
#****###**#####**#####**##** 

output
COOL
 */

public class Main {
    public String solution(String str, int n) {
        String answer = "";
       for (int i = 0; i < n; i++) {
           String s = str.substring(i*7, i*7+7);
           s = s.replace("#", "1");
           s = s.replace("*", "0");
           char c = (char)(int)Integer.valueOf(s, 2);
           answer += c;
       }

       return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.print(T.solution(str, n));
        

        return ;
    }
}
