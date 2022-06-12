import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		main.solution(arr);
	}

	private void solution(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int number : arr) {
			max = Math.max(max, number);
			min = Math.min(min, number);
		}

		System.out.printf("%d %d", min, max);
	}
}
