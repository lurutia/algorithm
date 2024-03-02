package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer[] number = new Integer[2];
            number[0] = s.nextInt();
            number[1] = s.nextInt();
            list.add(number);
        }

        solution(list);
    }

    private static void solution(List<Integer[]> list) {
        for (Integer[] number : list) {
            System.out.println(number[0] + number[1]);
        }
    }
}
