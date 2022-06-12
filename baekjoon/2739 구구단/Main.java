import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int googoodan = sc.nextInt();

		main.solution(googoodan);
	}

	private void solution(int gooogoodan) {
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d * %d = %d\n", gooogoodan, i + 1, gooogoodan * (i + 1));
		}
	}
}