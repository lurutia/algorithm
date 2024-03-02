package loop;

import java.io.*;
import java.util.Scanner;

public class Baekjoon_2438 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solution(n);
    }

    private static void solution(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
