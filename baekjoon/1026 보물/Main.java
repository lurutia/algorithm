import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		Integer[] arr2 = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		main.solution(n, arr, arr2);
	}

	private void solution(int n, Integer[] arr, Integer[] arr2) {
		int result = 0;

		// 1번 배열 정렬 오름차순
		Arrays.sort(arr);

		// 2번 배열 정렬 내림차순
		Arrays.sort(arr2, Collections.reverseOrder());

		// 1번 배열 + 2번 배열
		for (int i = 0; i < n; i++) {
			result += arr[i] * arr2[i];
		}

		System.out.println(result);
	}
}
