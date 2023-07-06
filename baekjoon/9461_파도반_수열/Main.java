package baekjoon;

import java.util.*;

public class Main {
	static List<Long> dp = new ArrayList<>();
	public static void main(String[] args) {
		dp.add(1L);
		dp.add(1L);
		dp.add(1L);
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		for (long i = 0; i < n; i++) {
			main.solution(Integer.parseInt(sc.nextLine()));
		}
	}

	private void solution(int number) {
		if (number <= 3) {
			System.out.println(1);
			return;
		}

		long result = 0;
		for (int i = 4; i <= number; i++) {
			if (dp.size() >= i) {
				result = dp.get(i - 1);
			} else {
				long nextNumber = dp.get(i - 4) + dp.get(i - 3);
				result = nextNumber;
				dp.add(nextNumber);
			}
		}
		System.out.println(result);
	}
}
