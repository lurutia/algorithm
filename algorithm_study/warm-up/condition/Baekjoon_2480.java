package condition;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Baekjoon_2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        Integer[] arr = new Integer[]{a, b, c};

        solution(Arrays.asList(arr));
    }

    private static void solution(List<Integer> list) {
        int result = 0;
        Map<Integer, Long> diceMap = list.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        if (diceMap.size() == 1) {
            result = 10000 + (diceMap.keySet().stream().findFirst().get() * 1000);
        } else if (diceMap.size() == 2) {
            int dice = diceMap.entrySet().stream().filter(e -> e.getValue() == 2).findFirst().get().getKey();
            result = 1000 + dice * 100;
        } else if (diceMap.size() == 3) {
            result = list.stream().mapToInt(x->x).max().orElseThrow() * 100;
        }

        System.out.println(result);
    }
}
