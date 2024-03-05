package onnDimensionalArray;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Baekjoon_10811 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Integer[] numbers = new Integer[2];
            numbers[0] = s.nextInt();
            numbers[1] = s.nextInt();
            list.add(numbers);
        }

        solution(n, m, list);
    }

    private static void solution(int n, int m, List<Integer[]> list) {
        int[] result = IntStream
                .rangeClosed(1, n)
                .toArray();

        for (Integer[] numbers : list) {
            int i = numbers[0] - 1;
            int j = numbers[1] - 1;
            while (i < j) {
                int tmp = result[i];
                result[i] = result[j];
                result[j] = tmp;
                i++;
                j--;
            }
        }

        System.out.println(Arrays
                .stream(result)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(" "))
        );
    }
}
