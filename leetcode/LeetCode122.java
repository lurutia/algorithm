package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode122 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String[] numberArr = text.split(",");
        List<Integer> list = Arrays
                .stream(numberArr)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        solution(list);
    }

    private static void solution(List<Integer> list) {
        int buy = list.get(0);
        int sell = list.get(0);
        int result = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < sell) {
                result += sell - buy;
                buy = list.get(i);
                sell = list.get(i);
            } else if (list.get(i) > sell) {
                sell = list.get(i);
            }
        }
        result += sell - buy;
        System.out.println(result);
    }
}