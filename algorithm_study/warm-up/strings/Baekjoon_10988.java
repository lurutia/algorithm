package strings;

import java.io.*;

public class Baekjoon_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        solution(text);
    }

    private static void solution(String text) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(text);
        String reverseText = sb.reverse().toString();
        int result = text.equals(reverseText) ? 1 : 0;

        bw.write(String.format("%d", result));
        bw.flush();
    }
}
