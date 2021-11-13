import java.util.Scanner;

/*
input
3
good
Time
Big

output
doog
emiT
giB
 */

public class Main {
    public String[] solution(int n, String[] arr) {
        String answer[] = new String[n];

        // solution 1
        // for (int i = 0; i < n; i++) {
        //     answer[i] = new StringBuilder(arr[i]).reverse().toString();
        // }

        // solution 2
        for (int i = 0; i < n; i++) {
            char[] c = arr[i].toCharArray();
            int lt = 0;
            int rt = arr[i].length() - 1;
            while (lt <= rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            answer[i] = String.valueOf(c);
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        
        for (String x : T.solution(n, arr)) {
            System.out.println(x);
        }
        return ;
    }
}
