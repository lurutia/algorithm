import java.util.Scanner;

/*
input
found7, time: study; Yduts; emit, 7Dnuof

output
YES
 */

public class Main {
    public String solution(String str) {
        String answer = "YES";

        int lt = 0;
        int rt = str.length() - 1;
        char[] crr = str.toUpperCase().toCharArray();
        while (lt <= rt) {
            if (!Character.isAlphabetic(crr[lt])) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(crr[rt])) {
                rt--;
                continue;
            }
            if (crr[lt] != crr[rt]) {
                return "NO";
            }
            lt++;
            rt--;
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
