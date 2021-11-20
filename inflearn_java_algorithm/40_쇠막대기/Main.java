import java.util.*;

/*
input
1
()(((()())(())()))(())

2
(((()(()()))(())()))(()())

output
1
17

2
24
 */

public class Main {
    public int solution(String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        char last = ' ';

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            }
            else {
                stack.pop();
                if (last == '(') {
                    answer += stack.size();
                }
                else {
                    answer++;
                }
            }
            last = x;
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
