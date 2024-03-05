package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Baekjoon_3052 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = 10;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(s.nextInt());
        }

        solution(n, list);
    }

    private static void solution(int n, List<Integer> list) {
        Set<Integer> set = list.stream().map(number -> number % 42).collect(Collectors.toSet());
        System.out.println(set.size());
    }
}
