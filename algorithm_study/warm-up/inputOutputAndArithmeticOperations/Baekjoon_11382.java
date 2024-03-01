package inputOutputAndArithmeticOperations;

import java.util.Scanner;

public class Baekjoon_11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long c = s.nextLong();

        solution(a, b, c);
    }

    private static void solution(long a, long b, long c) {
        System.out.println(a + b + c);
    }
}
