package strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_2675 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        List<Object[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Object[] objects = new Object[2];
            objects[0] = s.nextInt();
            objects[1] = s.next();
            list.add(objects);
        }
        solution(n, list);
    }

    private static void solution(int n, List<Object[]> objects) {
        for (Object[] obj : objects) {
            int number = (int)obj[0];
            String str = (String)obj[1];
            StringBuilder result = new StringBuilder();
            for (char c : str.toCharArray()) {
                result.append(String.valueOf(c).repeat(number));
            }
            System.out.println(result);
        }
    }
}
