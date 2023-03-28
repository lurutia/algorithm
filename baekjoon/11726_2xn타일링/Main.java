import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		main.solution(n);
	}

	private void solution(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}

		if (n == 2) {
			System.out.println(2);
			return;
		}

		BigInteger[] arr = new BigInteger[n];
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("2");

		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1].add(arr[i - 2]);
		}

		System.out.println(arr[n - 1].remainder(new BigInteger("10007")));
	}
}
