import java.util.*;

/*
input
8 32
23 87 65 12 57 32 99 81

output
3
 */

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        
        int lt = 0;
        int rt = n - 1;
        while (lt <= rt) {
            int middle = (lt + rt) / 2;
            if (arr[middle] <= k) {
                answer = middle + 1;
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