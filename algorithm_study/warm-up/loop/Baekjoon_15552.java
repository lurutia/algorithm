package loop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            Integer[] number = new Integer[2];
            number[0] = Integer.parseInt(st.nextToken());
            number[1] = Integer.parseInt(st.nextToken());
            list.add(number);
        }

        solution(n, list);
    }

    private static void solution(int n, List<Integer[]> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Integer[] number : list) {
            bw.write(number[0] + number[1] + "\n");
        }
        bw.flush();
    }
}
