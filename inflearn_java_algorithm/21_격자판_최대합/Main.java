import java.util.*;

/*
input
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

output
155
 */

public class Main {
    public int solution(int[][] arr, int n) {
        int answer = 0;

        
        int d = 0;
        for (int i = 0; i < n; i++) {
            int h = 0;
            int s = 0;
            for (int j = 0; j < n; j++) {
                h += arr[i][j];
                s += arr[j][i];
            }
            answer = Math.max(answer, h);
            answer = Math.max(answer, s);
            d += arr[i][i];
        }

        answer = Math.max(answer, d);

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
       
        System.out.print(T.solution(arr, n));

        return ;
    }
}
