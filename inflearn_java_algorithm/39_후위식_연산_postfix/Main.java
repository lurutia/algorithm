import java.util.*;

/*
input
352+*9-

output
12
 */

public class Main {
    public int solution(String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - '0');
            }
            else {
                int b = stack.pop();
                int a = stack.pop();
                if (x == '-') answer = a - b;
                else if (x == '+') answer = a + b;
                else if (x == '*') answer = a * b;
                else answer = a / b;
                stack.push(answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String str = in.next();

        System.out.println(T.solution(str));
        
        return ;
    }
}
