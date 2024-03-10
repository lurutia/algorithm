package strings;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        solution(text);
    }

    private static void solution(String text) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new ArrayList<>();
        list.add("c=");
        list.add("c-");
        list.add("dz=");
        list.add("d-");
        list.add("lj");
        list.add("nj");
        list.add("s=");
        list.add("z=");
        int result = 0;
        while(!text.isBlank()) {
            result++;
            if (text.length() == 1) {
                break;
            }
            boolean flag = true;
            for (String s : list) {
                if (text.startsWith(s)) {
                    text = text.substring(s.length());
                    flag = false;
                    break;
                }
            }

            if (flag) {
                text = text.substring(1);
            }
        }


        bw.write(String.format("%d", result));
        bw.flush();
    }
}
