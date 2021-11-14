import java.util.*;

/*
input
4 3
3 4 1 2
4 3 2 1
3 1 4 2

output
3
 */

public class Main {
    public int solution(int[][] arr, int n, int t) {
        int answer = 0;

        int ii = 0;
        int jj = 0;
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               int cnt = 0;
               for (int k = 0; k < t; k++) {
                   for (int l = 0; l < n; l++) {
                       if (arr[k][l] == i+1) ii = l;
                       if (arr[k][l] == j+1) jj = l;
                   }
                   if (ii < jj) cnt++;
                   else break;
               }
               if (cnt == t) {
                answer++;
               }
           }
       }
       
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[][] arr = new int[t][n];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
       
        System.out.print(T.solution(arr, n, t));

        return ;
    }
}
