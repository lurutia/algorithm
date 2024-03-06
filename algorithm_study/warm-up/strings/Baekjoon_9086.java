package strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_9086 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextLine());
        }
        solution(n, list);
    }

    private static void solution(int n, List<String> list) {
        list.forEach(str -> {
            System.out.println(String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(str.length() - 1)));
        });
    }
}
