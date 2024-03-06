package strings;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_2743 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        System.out.println(str.length());
    }
}
