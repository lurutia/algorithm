import java.util.*;

/*
input
4 16

output
3 1 2 4
 */

public class Main {
    static int n, k;
    static int answer;
    static int[] combi;
    static int[] ch;
    static int[] arr;
    static boolean flag = false;

    public int combi(int n, int k) {
        if (n == k || k == 0) return 1;
        return combi(n - 1, k - 1) + combi(n - 1, k);
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == k) {
                flag = true;
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    arr[L] = i;
                    DFS(L + 1, sum + combi[L] * arr[L]);
                    ch[i] = 0;
                    if (flag) {
                        return;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();

        combi = new int [n];
        ch = new int[n+1];
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            combi[i] = T.combi(n-1, i);
        }

        T.DFS(0, 0);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        
        return ;
    }
}