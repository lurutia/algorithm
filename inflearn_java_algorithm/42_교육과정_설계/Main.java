import java.util.*;

/*
input
CBA
CBDAGE

output
YES
 */

public class Main {
    public String solution(String assens, String cur) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char x : assens.toCharArray()) {
            queue.offer(x);
        }

        for (char x : cur.toCharArray()) {
            if (!queue.contains(x)) continue;
            if (queue.poll() != x) return "NO";
        }
        
        if (!queue.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String assens = in.next();
        String cur = in.next();

        System.out.println(T.solution(assens, cur));
        
        return ;
    }
}
