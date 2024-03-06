package strings;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_11654 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        System.out.println((int)str.charAt(0));
    }
}
