import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());

		main.solution(cnt);
	}

	private void solution(int cnt) {
		List<Long> dp = new ArrayList<>();
		dp.add(0L);
		dp.add(1L);
		if (cnt == 0) {
			System.out.println(cnt);
			return;
		}
		if (cnt == 1) {
			System.out.println(cnt);
			return;
		}
		for (int i = 2; i <= cnt; i++) {
			dp.add(dp.get(i - 2) + dp.get(i - 1));
		}
		System.out.println(dp.get(dp.size() - 1));
	}
}
