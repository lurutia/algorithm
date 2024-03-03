package onnDimensionalArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = 9;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        solution(n, list);
    }

    private static void solution(int n, List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
