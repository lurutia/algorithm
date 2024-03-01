package condition;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Baekjoon_2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        int cookMinute = s.nextInt();

        solution(h, m, cookMinute);
    }

    private static void solution(int h, int m, int cookMinute) {
        LocalDateTime t1 = LocalDateTime.of(2024, 1, 1, h, m, 0);
        LocalDateTime t2 = t1.plusMinutes(cookMinute);

        System.out.println(t2.getHour() + " " + t2.getMinute());
    }
}
