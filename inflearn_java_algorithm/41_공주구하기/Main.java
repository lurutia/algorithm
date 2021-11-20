import java.util.*;

/*
input
8 3

output
7
 */

public class Main {
    public int solution(int n, int k) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        answer = queue.peek();

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(T.solution(n, k));
        
        return ;
    }
}
