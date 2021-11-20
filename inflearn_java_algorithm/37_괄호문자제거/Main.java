import java.util.*;

/*
input
(A(BC)D)EF(G(H)(IJ)K)LM(N)

output
NO
 */

public class Main {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            }
            else if (x == ')') {
                stack.pop();
            }
            else {
                if (stack.isEmpty()) {
                    answer += x;
                }
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
