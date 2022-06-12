import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}

		main.solution(arr);
	}

	private void solution(int[] arr) {
		int number = arr[0] * arr[1] * arr[2];
		int[] answer = new int[10];
		Arrays.fill(answer, 0);

		while (number > 0) {
			int remain = number % 10;

			if (remain == 0) answer[0]++;
			if (remain == 1) answer[1]++;
			if (remain == 2) answer[2]++;
			if (remain == 3) answer[3]++;
			if (remain == 4) answer[4]++;
			if (remain == 5) answer[5]++;
			if (remain == 6) answer[6]++;
			if (remain == 7) answer[7]++;
			if (remain == 8) answer[8]++;
			if (remain == 9) answer[9]++;

			number = number / 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(answer[i]);
		}
	}
}