import java.util.*;

/*
input
4 4
0 1 2 0
1 0 2 1
0 2 1 2
2 0 1 2

output
6
 */

public class Main {
    static int n, k, answer = Integer.MAX_VALUE;
    static int[][] map;
    static List<Position> pz = new ArrayList<>();
    static List<Position> hm = new ArrayList<>();
    static int[] p;

    public void combine() {
        int sum = 0;
        for (Position h : hm) {
            int min = Integer.MAX_VALUE;
            for (int ps : p) {
                min = Math.min(min, Math.abs(h.x - pz.get(ps).x) + Math.abs(h.y - pz.get(ps).y));
            }
            sum = sum + min;
        }
        
        answer = Math.min(answer, sum);
    }

    public void DFS(int L, int s) {
        if (L == k) {
            combine();
        }
        else {
            for (int i = s; i < pz.size(); i++) {
                p[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();
        map = new int[n][n];
        p = new int[k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = in.nextInt();
                map[i][j] = num;
                if (num == 1) {
                    hm.add(new Position(i, j));
                }
                else if (num == 2) {
                    pz.add(new Position(i, j));
                }
            }
        }

        
        

        T.DFS(0, 0);
        
        System.out.print(answer);
        
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