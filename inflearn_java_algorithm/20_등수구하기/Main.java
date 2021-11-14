import java.util.*;

/*
input
5
87 89 92 100 76

output
4 3 2 1 5
 */

public class Main {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) answer[i]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
       
        for (int x : T.solution(arr, n)) {
            System.out.print(x+1 + " ");
        }

        return ;
    }
}
