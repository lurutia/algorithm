package strings;

import java.io.*;
import java.util.*;

public class Baekjoon_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String str = br.readLine();
        while (str != null) {
            list.add(str);
            str = br.readLine();
        }
        solution(list);
    }

    private static void solution(List<String> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String str : list) {
            bw.write(str + "\n");
        }
        bw.flush();
    }
}
