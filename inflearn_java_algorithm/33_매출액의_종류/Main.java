import java.util.*;

/*
input
7 4
20 12 20 10 23 17 10

output
3 4 4 3
 */

public class Main {
    public List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        answer.add(map.size());

        for (int rt = k; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if (map.get(arr[rt-k]) == 1) map.remove(arr[rt-k]);
            else map.put(arr[rt-k], map.get(arr[rt-k]) - 1);
            answer.add(map.size());
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
        
        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }

        return ;
    }
}
