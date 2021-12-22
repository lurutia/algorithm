import java.util.*;

/*
input
5
25 3 4
4 4 6
9 2 3
16 2 5
1 5 2

output
10
 */

 public class Main {
    public int solution(int n, Top[] arr) {
        int answer = 0;
        int[] dy = new int[n];
        dy[0] = arr[0].height;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (arr[j].weigth > arr[i].weigth) {
                    max = Math.max(max, dy[j]);
                }
            }
            dy[i] = max + arr[i].height;
            answer = Math.max(answer, dy[i]);
        }
        
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Top[] arr = new Top[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Top(in.nextInt(), in.nextInt(), in.nextInt());
        }

        Arrays.sort(arr);

        System.out.println(T.solution(n, arr));

        return ;
    }
}

class Top implements Comparable<Top> {
    int width;
    int height;
    int weigth;
    public Top(int width, int heigth, int weigth) {
        this.width = width;
        this.height = heigth;
        this.weigth = weigth;
    }

    public int compareTo(Top o) {
        return o.width - this.width;
    }
}