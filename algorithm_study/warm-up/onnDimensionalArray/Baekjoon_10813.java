package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Baekjoon_10813 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Integer[] number = new Integer[2];
            number[0] = s.nextInt();
            number[1] = s.nextInt();
            list.add(number);
        }

        solution(n, m, list);
    }

    private static void solution(int n, int m, List<Integer[]> list) {
        Integer[] result = new Integer[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = i;
        }

        for (Integer[] item : list) {
            int tmp = result[item[0]];
            result[item[0]] = result[item[1]];
            result[item[1]] = tmp;
        }

        System.out.println(Arrays.stream(result).skip(1).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
