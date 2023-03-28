import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			main.solution(k, n);
		}
	}

	private void solution(int k, int n) {
		int[][] apt = new int[k + 1][n];
		for (int j = 0; j < n; j++) {
			apt[0][j] = j + 1;
		}

		for (int i = 1; i < k + 1; i++) {
			for (int j = 0; j < n; j++) {
				for (int l = 0; l <= j; l++) {
					apt[i][j] += apt[i - 1][l];
				}
			}
		}

		System.out.println(apt[k][n - 1]);
	}
}
