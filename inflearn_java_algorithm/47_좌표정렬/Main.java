import java.util.*;

/*
input
5
2 7
1 3
1 2
2 5
3 6

output
1 2
1 3
2 5
2 7
3 6
 */

public class Main {
    public Point[] solution(int n, Point[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        Point[] arr = new Point[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Point(in.nextInt(), in.nextInt());
        }

        for (Point x : T.solution(n, arr)) {
            System.out.println(x.x + " " + x.y);
        }
        
        
        return ;
    }
}

class Point implements Comparable<Point> {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}