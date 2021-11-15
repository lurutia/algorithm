import java.util.*;

/*
input
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

output
8
 */

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0;
        int cnt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
                while (cnt > k) {
                    if (arr[lt] == 0) {
                        cnt--;
                    }
                    lt++;
                }
            }
            answer = Math.max(answer, rt-lt+1);
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
