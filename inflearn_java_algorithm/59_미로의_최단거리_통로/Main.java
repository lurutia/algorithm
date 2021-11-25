import java.util.*;

/*
input
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0

output
12
 */

public class Main {
    static int n, k;
    static int[][] map;
    static int[] xr = {0, -1, 0, 1};
    static int[] yr = {-1, 0, 1, 0};

    public int BFS(int x, int y) {
        int answer = 0;
        int L = 0;

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(x, y));

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Position p = queue.poll();
                map[p.x][p.y] = 1;
                if (p.x == n - 1 && p.y == n - 1) {
                    answer = L;
                    return answer;
                }

                for (int j = 0; j < 4; j++) {
                    int xn = p.x + xr[j];
                    int yn = p.y + yr[j];
                    if (xn >= 0 && yn >= 0 && xn < 7 && yn < 7 && map[xn][yn] == 0) {
                        queue.offer(new Position(xn, yn));
                    }
                }
            }
            L++;
        }

        return -1;
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = 7;
        map = new int[7][7];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
            }
        }

        
        System.out.print(T.BFS(0, 0));
        
        return ;
    }
}

class Position {
    int x;
    int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}