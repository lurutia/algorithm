package inputOutputAndArithmeticOperations;

import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        solution(a, b);
    }

    private static void solution(int a, int b) {
        int one = b % 10;
        int two = (b / 10) % 10;
        int three = (b / 100) % 10;

        System.out.println(a * one);
        System.out.println(a * two);
        System.out.println(a * three);
        System.out.println(a * b);
    }
}
