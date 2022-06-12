import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		main.solution(cnt);
	}

	private void solution(int cnt) {
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}