import java.util.*;

/*
input
10 3
13 15 34 23 45 65 33 11 26 42

output
143
 */

public class Main {
    public int solution(int n, int k, int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        if (set.size() < k) return -1;

        Integer[] intArr = new Integer[set.size()];
        set.toArray(intArr);

        Arrays.sort(intArr, Collections.reverseOrder());

        return intArr[k-1];
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

        System.out.println(T.solution(n, k, arr));
        
        return ;
    }
}
