import java.util.*;

/*
input
bacaAacba
abc

output
3
 */

public class Main {
    public int solution(String str, String key) {
        int answer = 0;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char x : key.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < key.length(); i++) {
            map1.put(str.charAt(i), map1.getOrDefault(str.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = key.length(); rt < str.length(); rt++, lt++) {
            if (map1.equals(map2)) answer++;
            map1.put(str.charAt(rt), map1.getOrDefault(str.charAt(rt), 0) + 1);
            if (map1.get(str.charAt(lt)) == 1) map1.remove(str.charAt(lt));
            else map1.put(str.charAt(lt), map1.get(str.charAt(lt)) - 1);
        }
        if (map1.equals(map2)) answer++;

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        String str = in.next();
        String key = in.next();

        System.out.println(T.solution(str, key));
        
        return ;
    }
}
