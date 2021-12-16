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

    static int[] unf;
    public static int find(int start) {
        if (start == unf[start]) return start;
        else return unf[start] = find(unf[start]);
    }

    public static boolean union(Road x) {
        int a = x.s < x.d ? find(x.s) : find(x.d);
        int b = x.s < x.d ? find(x.d) : find(x.s);
        if (a != b) {
            unf[a] = b;
            return true;
        }
        else {
            return false;
        }
    }
  
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        List<Road> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int cost = in.nextInt();

            list.add(new Road(start, end, cost));
        }

        Collections.sort(list);

        int answer = 0;
        for (Road x : list) {
            if (union(x)) {
                answer = answer + x.cost;
            }
        }

        System.out.println(answer);

        return ;
    }
}

class Road implements Comparable<Road> {
    int s;
    int d;
    int cost;
    public Road(int s, int d, int cost) {
        this.s = s;
        this.d = d;
        this.cost = cost;
    }

    @Override
    public int compareTo(Road o) {
        return this.cost - o.cost;
    }
}