import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cnt; i++) {
			main.solution(sc.nextLine());
			System.out.println();
		}
	}

	private void solution(String input) {
		String[] split = input.split(" ");
		int loop = Integer.parseInt(split[0]);
		String str = split[1];

		for (char c : str.toCharArray()) {
			for (int i = 0; i < loop; i++) {
				System.out.print(c);
			}
		}
	}
}