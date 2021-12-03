import java.util.*;

/*
input
7
1 1 0 0 0 1 0
0 1 1 0 1 1 0
0 1 0 0 0 0 0
0 0 0 1 0 1 1
1 1 0 1 1 0 0
1 0 0 0 1 0 0
1 0 1 0 1 0 0

output
5
 */

public class Main {
    static int n;
    static int[][] map;
    static int[] xr = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[] yr = {-1, -1, 0, 1, 1, 1, 0, -1};

    public int solution() {
        int answer = 0;

        for (int i = 0; i < n;i ++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    DFS(i, j);
                }
            }
        }

        return answer;
    }

    public void DFS(int r, int h) {
        map[r][h] = 0;
        for (int i = 0; i < 8; i++) {
            int xn = r + xr[i];
            int yn = h + yr[i];
            if (xn >= 0 && xn < n && yn >= 0 && yn < n &&  map[xn][yn] == 1) {
                map[xn][yn] = 0;
                DFS(xn, yn);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
            }
        }
        
        System.out.print(T.solution());
        
        return ;
    }
}