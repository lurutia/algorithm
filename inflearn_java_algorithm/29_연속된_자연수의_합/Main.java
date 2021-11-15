import java.util.*;

/*
input
15

output
3
 */

public class Main {
    public int solution(int n) {
        int answer = 0;

        int lt = 1;
        int rt = 1;

        int sum = 0;
        while (rt <= (n/2+1)) {
            sum = sum + rt;
            while (sum >= n) {
                if (sum == n) answer++;
                sum = sum - lt;
                lt++;
            }
            rt++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        System.out.print(T.solution(n));

        return ;
    }
}
