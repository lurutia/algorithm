package loop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Baekjoon_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        solution(n);
    }

    private static void solution(int n) {
        System.out.println(IntStream.rangeClosed(0, n).sum());
    }
}
