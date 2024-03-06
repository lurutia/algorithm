package strings;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Baekjoon_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 6;
        List<Integer> list = new ArrayList<>();
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(input[i]));
        }
        solution(n, list);
    }

    private static void solution(int n, List<Integer> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] base = new Integer[]{1, 1, 2, 2, 2, 8};
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            answer.add(base[i] - list.get(i));
        }
        bw.write(answer
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
        bw.flush();
    }
}
