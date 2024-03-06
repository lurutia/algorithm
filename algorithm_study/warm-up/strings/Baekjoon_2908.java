package strings;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_2908 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String n1 = s.next();
        String n2 = s.next();
        solution(n1, n2);
    }

    private static void solution(String n1, String n2) {
        StringBuilder sb1 = new StringBuilder(n1).reverse();
        StringBuilder sb2 = new StringBuilder(n2).reverse();
        int number1 = Integer.parseInt(sb1.toString());
        int number2 = Integer.parseInt(sb2.toString());
        System.out.println(Math.max(number1, number2));
    }
}
