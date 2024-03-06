package strings;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_1152 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        if ("".equals(str.trim())) {
            System.out.println(0);
            return;
        }
        System.out.println(str.trim().split(" ").length);
    }
}
