package condition;

import java.util.Scanner;

public class Baekjoon_14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        solution(x, y);
    }

    private static void solution(int x, int y) {
        int result = 0;

        if (x > 0 && y > 0) {
            result = 1;
        } else if (x < 0 && y > 0) {
            result = 2;
        } else if (x < 0 && y < 0) {
            result = 3;
        } else if (x > 0 && y < 0) {
            result = 4;
        } else {
            throw new RuntimeException("no answer");
        }

        System.out.println(result);
    }
}
