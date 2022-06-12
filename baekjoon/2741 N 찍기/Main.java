import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		main.solution(n);
	}

	private void solution(int n) {
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}