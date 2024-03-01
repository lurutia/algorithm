package condition;

import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int[] arr = new int[]{a, b, c};

        solution(arr);
    }

    private static void solution(int[] arr) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 3) {
                result = 10000 + (arr[i] * 1000);
                break;
            } else if (cnt == 2) {
                result = 1000 + (arr[i] * 100);
                break;
            }
        }
        if (result == 0) {
            result = max * 100;
        }

        System.out.println(result);
    }
}
