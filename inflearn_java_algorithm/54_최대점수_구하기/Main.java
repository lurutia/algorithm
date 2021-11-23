import java.util.*;

/*
input
5 20
10 5
25 12
15 8
6 3
7 4

output
41
 */

public class Main {
    static int n, k;
    static int[] arr, arr2;
    static int answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int time) {
        if (time > k) return;
        if (L == n) {
            answer = Math.max(answer, sum);
            return;
        }
        else {
            DFS(L + 1, sum, time);
            DFS(L + 1, sum + arr[L], time + arr2[L]);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();
        
        arr = new int[n];
        arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            arr2[i] = in.nextInt();
        }

        T.DFS(0, 0, 0);
        System.out.print(answer);
        
        return ;
    }
}