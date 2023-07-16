import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());

		main.solution(cnt);
	}

	private void solution(int cnt) {

		BigInteger[] dp = new BigInteger[cnt + 1];
		BigInteger result = new BigInteger("0");

		if (cnt == 1) {
			System.out.println(1);
			return;
		}

		dp[0] = new BigInteger("1");
		dp[1] = new BigInteger("1");

		for (int i = 1; i < cnt; i++) {
			dp[i + 1] = dp[i].add((dp[i - 1].multiply(new BigInteger("2"))));
			result = dp[i + 1];
		}

		System.out.println(result.remainder(new BigInteger("10007")));
	}
}
