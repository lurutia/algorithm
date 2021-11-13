import java.util.Scanner;

/*
input
Computercooler
c

output
2
 */

public class Main {
    public int solution(String str, char c) {
        int answer = 0;
        c = Character.toUpperCase(c);

        for (char x : str.toUpperCase().toCharArray()) {
            if (x == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        System.out.println(T.solution(str, c));
        return ;
    }
}
