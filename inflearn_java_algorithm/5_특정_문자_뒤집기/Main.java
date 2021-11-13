import java.util.Scanner;

/*
input
a#b!GE*T@S

output
S#T!EG*b@a
 */

public class Main {
    public String solution(String str) {
        String answer = "";

        char[] c = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt <= rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(c[rt])) {
                rt--;
                continue;
            }
            char tmp = c[lt];
            c[lt] = c[rt];
            c[rt] = tmp;
            lt++;
            rt--;
        }

        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));

        return ;
    }
}
