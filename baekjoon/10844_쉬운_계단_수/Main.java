import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());

		main.solution(cnt);
	}

	private void solution(int cnt) {
		BigInteger[][] dp = new BigInteger[cnt][9];
		for (int i = 0; i < 9; i++) {
			dp[0][i] = new BigInteger("1");
		}

		for (int i = 1; i < cnt; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][j + 1];
				} else if (j == 8) {
					dp[i][j] = dp[i - 1][j - 1].add(dp[i - 1][0]);
				} else {
					dp[i][j] = dp[i - 1][j - 1].add(dp[i - 1][j + 1]);
				}
			}
		}

		System.out.println(Arrays.stream(dp[cnt - 1]).reduce(new BigInteger("0"), BigInteger::add).mod(new BigInteger("1000000000")));
	}
}
