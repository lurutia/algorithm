import java.util.*;

/*
input
8 6
1 2 1 3 1 1 1 2

output
3
 */

public class Main {
    public int solution(int[] arr, int n, int d) {
        int answer = 0;

        int lt = 0;
        int rt = 0;
        int sum = 0;
        while (rt < n) {
            sum += arr[rt++];
            while (sum >= d) {
                if (sum == d) answer++;
                sum -= arr[lt++];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(arr, n, d));

        return ;
    }
}
