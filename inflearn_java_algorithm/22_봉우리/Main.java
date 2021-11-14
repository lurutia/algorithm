import java.util.*;

/*
input
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2

output
10
 */

public class Main {
    public int solution(int[][] arr, int n) {
        int answer = 0;

        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                if (arr[i][j-1] >= arr[i][j]) continue;
                else if (arr[i+1][j] >= arr[i][j]) continue;
                else if (arr[i][j+1] >= arr[i][j]) continue;
                else if (arr[i-1][j] >= arr[i][j]) continue;
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt()+2;
        int[][] arr = new int[n][n];
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
       
        System.out.print(T.solution(arr, n));

        return ;
    }
}
