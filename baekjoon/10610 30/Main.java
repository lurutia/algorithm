import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		main.solution(n);
	}

	private void solution(String n) {
		char[] temp = n.toCharArray();
		Arrays.sort(temp);
		if (temp[0] != '0') {
			System.out.println(-1);
			return;
		}

		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = n.length() - 1; i >= 0; i--) {
			sum += temp[i] - '0';
			sb.append(temp[i]);
		}

		if (sum % 3 != 0) {
			System.out.println(-1);
			return;
		}

		System.out.println(sb);
	}
}
