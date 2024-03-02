package loop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_10951 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        List<Integer[]> list = new ArrayList<>();
        while(s.hasNext()) {
            Integer[] number = new Integer[2];
            number[0] = s.nextInt();
            number[1] = s.nextInt();
            list.add(number);
        }
        solution(list);
    }

    private static void solution(List<Integer[]> list) {
        list.stream().mapToInt(number -> number[0] + number[1]).forEach(System.out::println);
    }
}
