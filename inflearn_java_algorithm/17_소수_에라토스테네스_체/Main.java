import java.util.Scanner;

/*
input
20

output
8
 */

public class Main {
    public int solution(int n) {
        int answer = 0;
        int arr[] = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        
        for (int i = 2; i <= n/2; i++) {
            for (int j = i; j <= n; j=j+i) {
                arr[j] = 1;
            }
        }

        for (int x : arr) {
            if (x == 0) answer++;
        }

       return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
       
        System.out.println(T.solution(n));

        return ;
    }
}
