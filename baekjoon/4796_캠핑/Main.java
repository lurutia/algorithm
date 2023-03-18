import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L;
		int P;
		int V;
		int cnt = 1;
		while (true) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			L = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			V = Integer.parseInt(st.nextToken());

			if (L == 0 && P == 0 && V == 0) return;
			main.solution(L, P, V, cnt);
			cnt++;
		}
	}

	private void solution(int L, int P, int V, int cnt) {
		int result = 0;
		// V에서 P를 나눈 몫 * L
		result += V / P * L;
		// V에서 P 나눈 나머지가 L보다 클경우 L만큼 더하기
		// 나머지가 L보다 작으면 나머지만큼 더하기
		if (V % P > L) {
			result += L;
		} else {
			result += V % P;
		}

		System.out.println(String.format("Case %d: %d", cnt, result));
	}
}