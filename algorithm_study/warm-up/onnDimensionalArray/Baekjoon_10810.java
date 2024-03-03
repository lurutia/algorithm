package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Baekjoon_10810 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Integer[] number = new Integer[3];
            number[0] = s.nextInt();
            number[1] = s.nextInt();
            number[2] = s.nextInt();
            list.add(number);
        }

        solution(n, m, list);
    }

    private static void solution(int n, int m, List<Integer[]> list) {
        Integer[] result = new Integer[n];
        Arrays.fill(result, 0);
        for (Integer[] item : list) {
            for (int i = item[0] - 1; i < item[1]; i++) {
                result[i] = item[2];
            }
        }
        System.out.println(Arrays.stream(result).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
