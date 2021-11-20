import java.util.*;

/*
input
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4

output
4
 */

public class Main {
    public int solution(int n, int[][] arr, int n2, int[] seq) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][seq[i]-1] > 0) {
                    int tmp = arr[j][seq[i]-1];
                    arr[j][seq[i]-1] = 0;
                    if (stack.isEmpty() || stack.peek() != tmp) {
                        stack.push(tmp);
                    }
                    else {
                        stack.pop();
                        answer = answer + 2;
                    }
                    break;
                }
            }
        }
        
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int n2 = in.nextInt();
        int[] seq = new int[n2];
        for (int i = 0; i < n2; i++) {
            seq[i] = in.nextInt();
        }

        System.out.println(T.solution(n, arr, n2, seq));
        
        return ;
    }
}
