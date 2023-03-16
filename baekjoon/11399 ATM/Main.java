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

		main.solution(n, arr);
	}

	private void solution(int n, int[] arr) {
		int answer = 0;
		int wait = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			answer += wait + arr[i];
			wait += arr[i];
		}

		System.out.println(answer);
	}
}
