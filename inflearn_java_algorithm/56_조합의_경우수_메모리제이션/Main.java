import java.util.*;

/*
input
1
5 3

2
33 19

output
1
10

2
818809200
 */

public class Main {
    static int n, k;
    static int answer;
    static int[][] arr;

    public int DFS(int n, int k) {
        if (n == k || k == 0) return 1;
        if (arr[n][k] > 0) return arr[n][k];
        return arr[n][k] = DFS(n - 1, k - 1) + DFS(n - 1, k);
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();
        arr = new int[n+1][k+1];

        answer = T.DFS(n, k);
        System.out.print(answer);
        
        return ;
    }
}