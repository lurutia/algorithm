import java.util.*;

/*
input
7

output
21
 */

 public class Main {
    static int answer = 0;
    public void DFS(int L, int sum, int n) {
        if (sum >= n) {
            if (sum == n) {
                answer++;
            }
        }
        else {
            DFS(L + 1, sum + 1, n);
            DFS(L + 1, sum + 2, n);
        }
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        T.DFS(0, 0, n);
        System.out.println(answer);

        return ;
    }
}