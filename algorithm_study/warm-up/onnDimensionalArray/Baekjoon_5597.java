package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Baekjoon_5597 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = 30;
        List<Integer> list = new ArrayList<>();
        while (s.hasNext()) {
            list.add(s.nextInt());
        }

        solution(n, list);
    }

    private static void solution(int n, List<Integer> list) {
        IntStream.rangeClosed(1, n)
                .filter(number -> !list.contains(number))
                .forEach(System.out::println);
    }
}
