import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int[] answer = new int[]{1, 2, 4, 7, 13, 24, 44, 81, 149, 274};
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int next = Integer.parseInt(br.readLine());
			main.solution(next);
		}
	}

	private void solution(int n) {
		System.out.println(answer[n - 1]);
	}
}