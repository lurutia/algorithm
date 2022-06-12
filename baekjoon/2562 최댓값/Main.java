import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		main.solution(arr);
	}

	private void solution(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sequence = 0;

		for (int i = 0; i < 9; i++) {
			if (max < arr[i]) {
				max = arr[i];
				sequence = i + 1;
			}
		}

		System.out.printf("%d\n%d%n", max, sequence);
	}
}