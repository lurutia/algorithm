import java.util.*;

/*
input
8
5 3 7 8 6 2 9 4

output
4
 */

 public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int[] dy = new int[n];
        dy[0] = 1;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, dy[j]);
                }
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(n, arr));

        return ;
    }
}