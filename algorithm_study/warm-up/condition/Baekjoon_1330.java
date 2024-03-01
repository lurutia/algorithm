package condition;

import java.util.Scanner;

public class Baekjoon_1330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        solution(a, b);
    }

    private static void solution(int a, int b) {
        String result;
        if (a > b) {
            result = ">";
        } else if (a < b) {
            result = "<";
        } else {
            result = "==";
        }

        System.out.println(result);
    }
}
