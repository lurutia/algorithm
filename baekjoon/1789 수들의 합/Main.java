import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		main.solution(n);
	}

	private void solution(long n) {
		int result = 1;

		long current = 0;
		while(current + result < n) {
			current += result;
			result++;
		}

		if (current + result > n) result--;

		System.out.println(result);
	}
}
