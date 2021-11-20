import java.util.*;

/*
input
1
5 2
60 50 70 80 90

2
6 3
70 60 90 60 60 60

output
1
3

2
4
 */

public class Main {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Node(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (Node next : queue) {
                if (cur.point < next.point) {
                    queue.offer(cur);
                    cur = null;
                    break;
                }
            }
            
            if (cur != null) {
                answer++;
                if (cur.seq == k) break;
            }
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

        System.out.println(T.solution(n, k, arr));
        
        return ;
    }
}

class Node {
    int seq;
    int point;
    
    public Node(int seq, int point) {
        this.seq = seq;
        this.point = point;
    }
}