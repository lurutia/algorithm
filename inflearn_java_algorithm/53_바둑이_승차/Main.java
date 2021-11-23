import java.util.*;

/*
input
259 5
81
58
42
33
61

output
242
 */

public class Main {
    static int n, k;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum) {
        if (sum > k) return;
        if (L == n) {
            answer = Math.max(answer, sum);
            return;
        }
        else {
            DFS(L + 1, sum);
            DFS(L + 1, sum + arr[L]);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        k = in.nextInt();
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        T.DFS(0, 0);
        System.out.print(answer);
        
        return ;
    }
}