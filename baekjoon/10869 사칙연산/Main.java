import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		main.solution(n1, n2);
	}

	private void solution(int n1, int n2) {
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}
}
