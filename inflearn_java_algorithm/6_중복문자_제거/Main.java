import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
input
ksekkset

output
kset
 */

public class Main {
    public String solution(String str) {
        String answer = "";

        Set<Character> set = new HashSet<>();

        for (char x : str.toCharArray()) {
            if (!set.contains(x)) {
                answer += x;
                set.add(x);
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