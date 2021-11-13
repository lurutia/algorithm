import java.util.Scanner;

/*
input
g0en2T0s8eSoft

output
208
 */

public class Main {
    public int solution(String str) {
        int answer = 0;

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer = answer * 10 + (x - '0');
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));

        return ;
    }
}
