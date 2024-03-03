package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Baekjoon_10807 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        solution(n, list, s.nextInt());
    }

    private static void solution(int n, List<Integer> list, int number) {
        Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map.getOrDefault(number, 0L));
    }
}
