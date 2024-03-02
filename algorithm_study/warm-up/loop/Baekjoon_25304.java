package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Baekjoon_25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int n = s.nextInt();
        List<Integer[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer[] number = new Integer[2];
            number[0] = s.nextInt();
            number[1] = s.nextInt();
            list.add(number);
        }

        solution(total, n, list);
    }

    private static void solution(int total, int n, List<Integer[]> list) {
        String result = "No";
        if (total == list.stream().mapToInt(x -> x[0] * x[1]).sum()) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
