import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int cnt = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < cnt; i++) {
			main.solution(sc.nextLine());
		}
	}

	private void solution(String str) {
		int count = 1;
		int sum = 0;
		for (char c : str.toCharArray()) {
			if (c == 'O') {
				sum += count;
				count++;
			} else {
				count = 1;
			}
		}

		System.out.println(sum);
	}
}