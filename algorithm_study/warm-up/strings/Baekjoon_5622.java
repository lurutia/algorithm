package strings;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon_5622 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        Map<String, Integer> dial = new HashMap<>();
        dial.put("A", 3);
        dial.put("B", 3);
        dial.put("C", 3);
        dial.put("D", 4);
        dial.put("E", 4);
        dial.put("F", 4);
        dial.put("G", 5);
        dial.put("H", 5);
        dial.put("I", 5);
        dial.put("J", 6);
        dial.put("K", 6);
        dial.put("L", 6);
        dial.put("M", 7);
        dial.put("N", 7);
        dial.put("O", 7);
        dial.put("P", 8);
        dial.put("Q", 8);
        dial.put("R", 8);
        dial.put("S", 8);
        dial.put("T", 9);
        dial.put("U", 9);
        dial.put("V", 9);
        dial.put("W", 10);
        dial.put("X", 10);
        dial.put("Y", 10);
        dial.put("Z", 10);

        int result = 0;
        for (char c : str.toCharArray()) {
            result += dial.get(String.valueOf(c));
        }
        System.out.println(result);
    }
}
