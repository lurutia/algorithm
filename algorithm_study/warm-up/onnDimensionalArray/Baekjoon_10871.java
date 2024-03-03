package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Baekjoon_10871 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        solution(n, x, list);
    }

    private static void solution(int n, int x, List<Integer> list) {
        String result = list
                .stream()
                .filter(number -> number < x)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
