import java.util.*;

/*
input
9
120 125 152 130 135 135 143 127 160

output
3 8
 */

public class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[2];

        int[] origin = Arrays.copyOf(arr, arr.length);
        Arrays.sort(origin);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != origin[i]) {
                answer[cnt] = i+1;
                cnt++;
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

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
        
        
        return ;
    }
}