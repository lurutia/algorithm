import java.util.*;

/*
input
10 3
12 15 11 20 25 10 20 19 13 15

output
56
 */

public class Main {
    public int solution(int[] arr, int n, int d) {
        int answer = 0;

        for (int i = 0; i < d; i++) {
            answer += arr[i];
        }

        int lt = 0;
        int sum = answer;
        for (int rt = d; rt < n; lt++, rt++) {
            sum = sum-arr[lt]+arr[rt];
            answer = Integer.max(answer, sum);
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
