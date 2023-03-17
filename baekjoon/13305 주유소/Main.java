import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] arr = new Long[n - 1];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextLong();
		}

		Long[] arr2 = new Long[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextLong();
		}

		main.solution(n, arr, arr2);
	}

	private void solution(int n, Long[] arr, Long[] arr2) {
		Long result = 0L;

		// 기름을 살곳을 찾을때까지 반복문
		for (int i = 0; i < n - 1;) {
			Long expectedBuyGas = 0L;
			Long stepCnt = 0L;
			// 내가 있는곳이 마지막이면 탈출

			// 나보다 더 싼 다음 정거장이 있는지 반복문
			for (int j = i + 1; j < n; j++) {
				// 없으면 살 기름 양 체크하면서 계속찾음
				expectedBuyGas += arr2[i] * arr[j - 1];
				stepCnt++;
				if (arr2[i] > arr2[j]) {
					// 더싼데가 있으면 종료
					break;
				}
			}
			i += stepCnt;
			result += expectedBuyGas;
		}

		System.out.println(result);
	}
}
