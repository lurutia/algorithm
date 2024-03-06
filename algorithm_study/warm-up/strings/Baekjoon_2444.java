package strings;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Baekjoon_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solution(n);
    }

    private static void solution(int n) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < n; i++) {
            bw.write(" ".repeat(n - i - 1));
            bw.write("*".repeat(i * 2 + 1));
            bw.write("\n");
        }
        for (int i = 0; i < n - 1; i++) {
            bw.write(" ".repeat(i + 1));
            bw.write("*".repeat((n * 2 - 2) - (i * 2) - 1));
            bw.write("\n");
        }

        bw.flush();
    }
}
