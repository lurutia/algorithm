import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[][] arr = new int[cnt][cnt];

		// int[] arr = new int[cnt];
		// dp = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		main.solution(cnt, arr);
	}

	private void solution(int cnt, int[][] arr) {
		int[][] dp = new int[cnt][cnt];
		dp[0][0] = arr[0][0];
		int result = dp[0][0];

		for (int i = 1; i < cnt; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][j] + arr[i][j];
				} else if (j == cnt - 1) {
					dp[i][j] = dp[i - 1][j - 1] + arr[i][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j - 1] + arr[i][j], dp[i - 1][j] + arr[i][j]);
				}
				result = Math.max(result, dp[i][j]);
			}
		}

		System.out.println(result);
	}
}
