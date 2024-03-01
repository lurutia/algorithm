package condition;

import java.util.Scanner;

public class Baekjoon_9498 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        solution(a);
    }

    private static void solution(int a) {
        String result = "";
        int[] score = new int[]{90, 80, 70, 60, 0};
        String[] grade = new String[]{"A", "B", "C", "D", "F"};
        for (int i = 0; i < score.length; i++) {
            if (a >= score[i]) {
                result = grade[i];
                break;
            }
        }

        System.out.println(result);
    }
}
