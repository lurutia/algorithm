import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();

		main.solution(a, b);
	}

	private void solution(long a, long b) {
		int result = 0;
		while(a < b) {
			// b를 2로 나누기 또는 끝이 1인지 검사
			if (b % 2 == 0) {
				// 2로 나눌 수 있을경우 나누기
				b = b / 2;
				result++;
			} else if (b % 10 == 1) {
				// 끝이 1일경우
				b = b / 10;
				result++;
			} else {
				// 아닐경우 -1 출력
				System.out.println(-1);
				return;
			}
		}
		if (a == b) {
			System.out.println(result + 1);
		} else {
			System.out.println(-1);
		}
	}
}
