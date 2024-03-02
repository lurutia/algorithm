package loop;

import java.util.Scanner;

public class Baekjoon_2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        solution(a);
    }

    private static void solution(int a) {
        int result = 0;

        for (int i = 0; i < 9; i++) {
            System.out.println(String.format("%d * %d = %d", a, i + 1, a * (i + 1)));
        }
    }
}
