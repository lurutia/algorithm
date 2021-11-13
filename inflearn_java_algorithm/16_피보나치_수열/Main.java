import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
input
10

output
1 1 2 3 5 8 13 21 34 55
 */

public class Main {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        answer.add(1);
        answer.add(1);

        for (int i = 2; i < n; i++) {
            answer.add(answer.get(i-2) + answer.get(i-1));
        }


       return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
       
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }

        return ;
    }
}
