import java.util.*;

/*
input
5 9
1 2 3 2 6 2 3 5 7

output
7 5 3 2 6
 */

public class Main {
    public int[] solution(int n, int k, int[] arr) {
        int[] cashe = new int[n];

        for (int x : arr) {
            int tmp = cashe[0];
            cashe[0] = x;
            for (int i = 0; i < n-1; i++) {
                if (tmp == x || tmp == 0) break;
                else {
                    int tmp2 = cashe[i+1];
                    cashe[i+1] = tmp;
                    tmp = tmp2;
                }
            }
        }


        return cashe;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
        
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