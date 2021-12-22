import java.util.*;

/*
input
5 20
10 5
25 12
15 8
6 3
7 4

output
41
 */

 public class Main {
    public int solution(int n, int k, Test[] arr) {
        int[] dy = new int[k + 1];

        for (int i = 0; i < n; i ++) {
            for (int j = k; j >= arr[i].time; j--) {
                dy[j] = Math.max(dy[j], dy[j - arr[i].time] + arr[i].point);
            }
        }
        
        return dy[k];
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        Test[] arr = new Test[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Test(in.nextInt(), in.nextInt());
        }

        

        System.out.println(T.solution(n, k, arr));

        return ;
    }
}

class Test {
    int point;
    int time;
    public Test(int point, int time) {
        this.point = point;
        this.time = time;
    }
}