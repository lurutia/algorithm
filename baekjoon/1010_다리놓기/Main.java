import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cnt; i++) {
			int r = sc.nextInt();
			int n = sc.nextInt();
			main.solution(n, r);
		}
	}

	private void solution(int n, int r) {
		int dp[][] = new int[n + 1][r + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= r; j++) {
				if (j == 1) {
					dp[i][j] = 1 + dp[i-1][j];
				} else {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				}
			}
		}

		System.out.println(dp[n][r]);
	}
}

