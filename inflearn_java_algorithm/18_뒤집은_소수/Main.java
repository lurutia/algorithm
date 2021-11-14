import java.util.*;

/*
input
9
32 55 62 20 250 370 200 30 100

output
23 2 73 2 3
 */

public class Main {
    public boolean isPrime(int x) {
        if (x == 1) return false;
        
        for (int i = 2; i < x/2; i++) {
            if (x%i == 0) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> solution(int[] arr, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int x : arr) {
            int param = 0;
            while(x > 0) {
                param = (param * 10) + (x % 10);
                x = x / 10;
            }
            
            if (isPrime(param)) {
                answer.add(param);
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
            System.out.print(x + " ");
        }

        return ;
    }
}
