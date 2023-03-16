import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		main.solution(n);
	}

	private void solution(int n) {
		int five = n / 5;
		int remain = n % 5;
		int three = remain / 3;
		remain = remain % 3;
		while (remain > 0) {
			five--;
			remain += 5;
			three += remain / 3;
			remain = remain % 3;
			if (five < 0) {
				System.out.println(five);
				return;
			}
		}

		System.out.println(five + three);
	}
}