package loop;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_2439 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        for (int i = 0; i < n; i++){
            System.out.println(" ".repeat(n - i - 1) + "*".repeat(i + 1));
        }
    }
}
