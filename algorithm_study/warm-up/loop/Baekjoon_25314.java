package loop;

import java.util.Scanner;

public class Baekjoon_25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        solution(n);
    }

    private static void solution(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size / 4; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb);
    }
}
