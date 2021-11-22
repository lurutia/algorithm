import java.util.*;

/*
input
5 14

output
3
 */

public class Main {
    public int BFS(int n, int k) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        int[] checked = new int[10001];
        int[] posibble = {-1, 1, 5};

        queue.offer(n);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (cur == k) return answer;
                for (int x : posibble) {
                    int next = cur + x;
                    if (next >= 1 && next <= 10000 && checked[next] == 0) {
                        queue.offer(cur + x);
                        checked[next] = 1;
                    }
                }
            }
            answer++;
        }

        return answer;
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.print(T.BFS(n, k));
        
        return ;
    }
}