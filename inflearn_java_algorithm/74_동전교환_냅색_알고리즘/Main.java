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
    public int solution(int n, int[] coin, int k) {
        int[] dy = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            dy[i] = i;
        }

        for (int i = 1; i < n; i ++) {
            for (int j = coin[i]; j <= k; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        
        return dy[k];
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = in.nextInt();
        }

        int k = in.nextInt();

        System.out.println(T.solution(n, coin, k));

        return ;
    }
}
