package condition;

import java.util.Scanner;

public class Baekjoon_2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        solution(a);
    }

    private static void solution(int a) {
        int result = 0;

        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            result = 1;
        }

        System.out.println(result);
    }
}
