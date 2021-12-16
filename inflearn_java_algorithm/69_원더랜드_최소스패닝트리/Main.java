import java.util.*;

/*
input
9 12
1 2 12
1 9 25
2 3 10
2 8 17
2 9 8
3 4 18
3 7 55
4 5 44
5 6 60
5 7 38
7 8 35
8 9 15

output
196
 */

 public class Main {
    static int[] ck;
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        ck = new int[n+1];

        Map<Integer, List<Road>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<Road>());
        }
        for (int i = 0; i < k; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int cost = in.nextInt();

            map.get(start).add(new Road(end, cost));
            map.get(end).add(new Road(start, cost));
        }

        PriorityQueue<Road> queue = new PriorityQueue<>();
        queue.offer(new Road(1, 0));

        int answer = 0;
        while (!queue.isEmpty()) {
            Road r = queue.poll();
            if (ck[r.s] == 0) {
                ck[r.s] = 1;
                answer = answer + r.cost;
                for (Road x : map.get(r.s)) {
                    if (ck[x.s] == 0) {
                        queue.offer(x);
                    }
                }
            }
        }

        System.out.println(answer);

        return ;
    }
}

class Road implements Comparable<Road> {
    int s;
    int cost;
    public Road(int s, int cost) {
        this.s = s;
        this.cost = cost;
    }

    @Override
    public int compareTo(Road o) {
        return this.cost - o.cost;
    }
}