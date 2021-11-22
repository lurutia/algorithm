import java.util.*;

/*
input
9 3
1 2 3 4 5 6 7 8 9

output
17
 */

public class Main {
    public int calc(int size, int[] arr) {
        int cnt = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > size) {
                cnt++;
                sum = 0;
            }
            sum += arr[i];
        }

        return cnt;
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int lt = 1;
        int rt = sum;
        while (lt <= rt) {
            int middle = (lt + rt) / 2;
            if (calc(middle, arr) <= k) {
                answer = middle;
                rt = middle - 1;
            }
            else {
                lt = middle + 1;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(T.solution(n, k, arr));
        
        return ;
    }
}