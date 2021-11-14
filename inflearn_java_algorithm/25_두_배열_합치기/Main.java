import java.util.*;

/*
input
3
1 3 5
5
2 3 6 7 9

output
1 2 3 3 5 6 7 9
 */

public class Main {
    public int[] solution(int[] arr, int[] arr2) {
        int[] answer = new int[arr.length + arr2.length];

        int lt = 0;
        int rt = 0;
        int p = 0;
        while (lt < arr.length && rt < arr2.length) {
            if (arr[lt] < arr2[rt]) answer[p++] = arr[lt++];
            else answer[p++] = arr2[rt++];
        }

        while (lt < arr.length) answer[p++] = arr[lt++];
        while (rt < arr2.length) answer[p++] = arr2[rt++];

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

        n = in.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
       
        for (int x : T.solution(arr, arr2)) {
            System.out.print(x + " ");
        }

        return ;
    }
}
