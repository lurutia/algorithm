import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		main.solution(n);
	}

	private void solution(int n) {
		int fiveMinute = 0;
		int oneMinute = 0;
		int tenSecond = 0;

		// 맞출 수 없는 경우
		if (n % 10 > 0) {
			System.out.println(-1);
			return;
		}

		// 5분
		fiveMinute = n / 300;
		n = n % 300;

		// 1분
		oneMinute = n / 60;
		n = n % 60;

		// 10초
		tenSecond = n / 10;

		System.out.println(String.format("%d %d %d", fiveMinute, oneMinute, tenSecond));
	}
}
