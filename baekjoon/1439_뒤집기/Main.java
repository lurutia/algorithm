import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		main.solution(s);
	}

	private void solution(String s) {
		int zero = 0;
		int one = 0;
		char[] arr = s.toCharArray();
		// 첫번째껀 넣어주기
		char last = arr[0];
		if (last == '0') {
			zero++;
		} else {
			one++;
		}

		// 반복문
		for (int i = 1; i < arr.length; i++) {
			// 마지막 본거랑 같으면 패스
			if (last == arr[i]) {
				continue;
			}
			else {
				// 다르면 다른숫자 + 해주기
				last = arr[i];
				if (arr[i] == '0') {
					zero++;

				} else {
					one++;
				}
			}
		}

		System.out.println(Math.min(zero, one));
	}
}
