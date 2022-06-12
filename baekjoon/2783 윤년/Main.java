import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		main.solution(n);
	}

	private void solution(int n) {
		if (n % 4 == 0 && ((n % 100 != 0) || (n % 400 == 0))) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}