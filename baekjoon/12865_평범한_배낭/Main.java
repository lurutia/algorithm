import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int weight = sc.nextInt();
		int[][] array = new int[cnt][2];
		for (int i = 0; i < cnt; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}

		main.solution(cnt, weight, array);
	}

	private void solution(int cnt, int weight, int[][] array) {
		int[] dp = new int[weight + 1];
		int result = 0;
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		for (int i = 0; i < cnt; i++) {
			for (int j = weight; j >= array[i][0]; j--) {
				dp[j] = Math.max(dp[j], array[i][1] + dp[j - array[i][0]]);
				result = Math.max(result, dp[j]);
			}
		}

		System.out.println(result);
	}
}
