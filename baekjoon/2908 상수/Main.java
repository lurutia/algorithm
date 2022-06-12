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
		int reverseN1 = 0;
		int reverseN2 = 0;
		while (n1 > 0) {
			reverseN1 = (reverseN1 * 10) + (n1 % 10);
			n1 = n1 / 10;
		}

		while (n2 > 0) {
			reverseN2 = (reverseN2 * 10) + (n2 % 10);
			n2 = n2 / 10;
		}

		System.out.println(Math.max(reverseN1, reverseN2));
	}
}