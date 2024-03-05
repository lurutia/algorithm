package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_1546 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        solution(n, list);
    }

    private static void solution(int n, List<Integer> list) {
        int max = list.stream().mapToInt(x -> x).max().orElseThrow();
        double result = list
                .stream()
                .mapToDouble(x -> (double) x / max * 100.0)
                .average()
                .orElseThrow();
        System.out.println(result);
    }
}
