package strings;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Baekjoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        solution(text);
    }

    private static void solution(String text) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> countMap = new HashMap<>();
        for (Character c : text.toCharArray()) {
            countMap.put(String.valueOf(c).toUpperCase(), countMap.getOrDefault(String.valueOf(c).toUpperCase(), 0) + 1);
        }

        String result;
        int maxCnt = countMap
                .values()
                .stream()
                .mapToInt(i -> i)
                .max()
                .orElseThrow();
        List<Map.Entry<String, Integer>> list = countMap
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == maxCnt)
                .collect(Collectors.toList());
        if (list.size() == 1) {
            result = list.get(0).getKey();
        } else {
            result = "?";
        }

        bw.write(String.format("%s", result));
        bw.flush();
    }
}
