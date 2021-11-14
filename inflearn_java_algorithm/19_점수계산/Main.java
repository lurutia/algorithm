import java.util.*;

/*
input
10
1 0 1 1 1 0 0 1 1 0

output
10
 */

public class Main {
    public int solution(int[] arr, int n) {
        int answer = 0;
        int cnt = 1;

        for (int x : arr) {
            if (x == 1) {
                answer += cnt;
                cnt++;
            }
            else {
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
       
        System.out.print(T.solution(arr, n));

        return ;
    }
}
