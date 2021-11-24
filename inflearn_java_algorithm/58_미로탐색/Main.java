import java.util.*;

/*
input
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0

output
8
 */

public class Main {
    static int n, k;
    static int answer = 0;
    static int[][] map;

    public void DFS(int x, int y) {
        if (x == n-1 && y == n-1) {
            answer++;
        }
        else {
            map[x][y] = 1;
            if (y > 0 && map[x][y - 1] == 0) DFS(x, y - 1);
            if (x > 0 && map[x - 1][y] == 0) DFS(x - 1, y);
            if (y < n-1 && map[x][y + 1] == 0) DFS(x, y + 1);
            if (x < n-1 && map[x+1][y] == 0) DFS(x + 1, y);
            map[x][y] = 0;
       }
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

        T.DFS(0, 0);
        System.out.print(answer);
        
        return ;
    }
}