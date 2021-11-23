import java.util.*;

/*
input
3
1 2 5
15

output
3
 */

public class Main {
    static int n, k;
    static Integer[] arr;
    static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum) {
        if (sum > k || L >= answer) return;

        if (sum == k) {
            answer = Math.min(answer, L);
        }
        else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        k = in.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        T.DFS(0, 0);
        System.out.print(answer);
        
        return ;
    }
}