import java.util.*;

/*
input
6
1 3 5 6 7 10

output
YES
 */

public class Main {
    static int[] arr;
    static int total;
    static String answer = "NO";
    static boolean flag = false;
    public void DFS(int L, int sum, int n) {
        if (flag) return;

        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            DFS(L + 1, sum, n);
            DFS(L + 1, sum + arr[L], n);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }

        T.DFS(0, 0, n);
        System.out.print(answer);
        
        return ;
    }
}