package strings;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_27866 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        int n = s.nextInt();

        solution(n, str);
    }

    private static void solution(int n, String str) {
        System.out.println(str.charAt(n - 1));
    }
}
