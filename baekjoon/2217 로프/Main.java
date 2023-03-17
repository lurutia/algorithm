import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		main.solution(n, arr);
	}

	private void solution(int n, Integer[] arr) {
		int result = 0;

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			result = Math.max(result, arr[i] * (i + 1));
		}

		System.out.println(result);
	}
}