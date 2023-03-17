import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		main.solution(n);
	}

	private void solution(int n) {
		int result = 0;
		int remain = 1000 - n;

		// 500엔
		result += remain / 500;
		remain = remain % 500;

		// 100엔
		result += remain / 100;
		remain = remain % 100;

		// 50엔
		result += remain / 50;
		remain = remain % 50;

		// 10엔
		result += remain / 10;
		remain = remain % 10;

		// 5엔
		result += remain / 5;
		remain = remain % 5;

		// 1엔
		result += remain;

		System.out.println(result);
	}
}