import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Integer[][] brands = new Integer[M][2];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			brands[i][0] = Integer.parseInt(st.nextToken());
			brands[i][1] = Integer.parseInt(st.nextToken());
		}

		main.solution(N, M, brands);
	}

	private void solution(int N, int M, Integer[][] brands) {
		int result = 0;

		// N을 6으로 나눈 개수
		int packageCnt = (N / 6);

		int minPackage = Integer.MAX_VALUE;
		int minUnit = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			// 가장 싼 패키지가격, 가장 싼 유닛 가격 확인
			minPackage = Math.min(minPackage, brands[i][0]);
			minUnit = Math.min(minUnit, brands[i][1]);
		}

		// 패키지 필요한 개수 * 패키지 금액 vs 유닛으로 모두 구매했을때 가격
		result += Math.min(packageCnt * minPackage, packageCnt * 6 * minUnit);

		// 패키지 금액 vs 유닛으로 모두 구매했을때 가격
		if (N % 6 > 0) {
			result += Math.min(minPackage, N % 6 * minUnit);
		}

		System.out.println(result);
	}
}