import java.util.*;

/*
input
5 3
1 2 8 4 9

output
3
 */

public class Main {
    public int calc(int size, int[] arr) {
        int cnt = 1;
        int last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= size) {
                cnt++;
                last = arr[i];
            }
        }
        
        return cnt;
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n-1];
        while (lt <= rt) {
            int middle = (lt + rt) / 2;
            if (calc(middle, arr) >= k) {
                answer = middle;
                lt = middle + 1;
            }
            else {
                rt = middle - 1;
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