import java.util.*;

/*
input
15
BACBACCACCBDEDE

output
C
 */

public class Main {
    public String solution(int n, String str) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Character x : map.keySet()) {
            if (max < map.get(x)) {
                max = map.get(x);
                answer = x.toString();
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        System.out.print(T.solution(n, str));

        return ;
    }
}
