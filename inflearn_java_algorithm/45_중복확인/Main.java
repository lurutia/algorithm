import java.util.*;

/*
input
8
20 25 52 30 39 33 43 33

output
D
 */

public class Main {
    public String solution(int n, int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        if (set.size() == n) {
            return "U";
        }
        else {
            return "D";
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(T.solution(n, arr));
        
        return ;
    }
}