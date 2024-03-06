package strings;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        String str = s.nextLine();
        solution(n, str);
    }

    private static void solution(int n, String str) {
        int result = 0;
        for (char c : str.toCharArray()) {
            result += Character.getNumericValue(c);
        }
        System.out.println(result);
    }
}
