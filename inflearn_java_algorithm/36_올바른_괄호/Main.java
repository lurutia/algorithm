import java.util.*;

/*
input
(()(()))(()

output
NO
 */

public class Main {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            }
            else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }
        
        if (!stack.isEmpty()) {
            answer = "NO";
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
