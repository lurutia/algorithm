import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		main.solution(arr);
	}

	private void solution(int[] arr) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += Math.pow(arr[i], 2);
		}

		System.out.println(sum % 10);
	}
}