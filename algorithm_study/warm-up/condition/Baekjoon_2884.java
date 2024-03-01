package condition;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();

        solution(h, m);
    }

    private static void solution(int h, int m) {
        int result = 0;

        LocalDateTime t1 = LocalDateTime.of(2024, 1, 1, h, m, 0);
        LocalDateTime t2 = t1.plusMinutes(-45);

        System.out.println(t2.getHour() + " " + t2.getMinute());
    }
}
