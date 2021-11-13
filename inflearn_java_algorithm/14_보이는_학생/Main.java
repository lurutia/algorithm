import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
input
8
130 135 148 140 145 150 150 153

output
5
 */

public class Main {
    public int solution(int[] arr, int n) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                answer++;
                max = arr[i];
            }
        }

       return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(arr, n));

        return ;
    }
}
