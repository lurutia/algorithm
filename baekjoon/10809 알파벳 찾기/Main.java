import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		main.solution(text);
	}

	private void solution(String text) {
		for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
			System.out.printf("%d ", text.indexOf(c));
		}
	}
}
