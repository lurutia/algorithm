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
		int[] arr = new int[cnt];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		main.solution(cnt, arr);
	}

	private void solution(int cnt, int[] arr) {
		int[] dp = new int[cnt];
		int result = 0;

		dp[0] = arr[0];
		result = dp[0];
		for (int i = 1; i < cnt; i++) {
			if (dp[i - 1] < 0) {
				dp[i] = arr[i];
			} else {
				dp[i] = dp[i - 1] + arr[i];
			}
			result = Math.max(result, dp[i]);
		}

		System.out.println(result);
	}
}
