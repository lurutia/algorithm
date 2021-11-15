import java.util.*;

/*
input
AbaAeCe
baeeACA

abaCC
Caaab

output
YES

NO
 */

public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (char x : map1.keySet()) {
            if (!map2.containsKey(x) || map1.get(x) != map2.get(x)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        
        System.out.print(T.solution(str1, str2));

        return ;
    }
}
