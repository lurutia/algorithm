import java.util.*;

/*
input
6 4
0 0 -1 0 0 0
0 0 1 0 -1 0
0 0 -1 0 0 0
0 0 0 0 -1 1

output
4
 */

public class Main {
    static int n, m;
    static int[][] map;
    static int[] xr = {0, -1, 0, 1};
    static int[] yr = {-1, 0, 1, 0};

    public int BFS() {
        int answer = 0;
        int L = 0;

        Queue<Position> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    queue.offer(new Position(i, j));
                }
            }
        }
        

        while (!queue.isEmpty()) {
            boolean flag  = false;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Position p = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int xn = p.x + xr[j];
                    int yn = p.y + yr[j];
                    if (xn >= 0 && yn >= 0 && xn < m && yn < n && map[xn][yn] == 0) {
                        flag = true;
                        map[xn][yn] = 1;
                        queue.offer(new Position(xn, yn));
                    }
                }
            }
            if (flag) {
                L++;
            }
        }

        answer = L;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) {
                    answer = -1;
                }
            }
        }

        return answer;
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        map = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
            }
        }
        
        System.out.print(T.BFS());
        
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