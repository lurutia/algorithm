package strings;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Baekjoon_10809 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        List<Integer> list = IntStream.rangeClosed('a', 'z').boxed().collect(Collectors.toList());
        System.out.println(list
                .stream()
                .map(str::indexOf)
                .map(String::valueOf)
                .collect(Collectors.joining(" "))
        );

    }
}
