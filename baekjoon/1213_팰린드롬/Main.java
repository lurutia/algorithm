import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		main.solution(str);
	}

	private void solution(String str) {
		int[] arr = new int[26];

		// 반복문
		for (char c : str.toCharArray()) {
			arr[c - 'A']++;
		}

		StringBuilder sb = new StringBuilder();

		int ck = 0;
		char c = '-';
		for (int i = 0; i < 26; i++) {
			// 홀수인게 2개 이상인지 체크
			if (arr[i] % 2 ==  1) {
				ck++;
				// 마지막에 가운데에 끼워넣을 홀수개 저장
				c = (char)('A' + i);
				// 홀수면 -1 빼줘서 팰린드롬에 참여하고 남은 1개는 가운데에 끼워넣기
				arr[i]--;
				if (ck > 1) {
					System.out.println("I'm Sorry Hansoo");
					return;
				}
			}

			// 정상적인 숫자들은 +
			for (int j = 0; j < arr[i] / 2; j++) {
				sb.append((char)('A' + i));
			}
		}

		StringBuilder sb2 = new StringBuilder(sb).reverse();
		if (c != '-') {
			sb.append(c);
		}
		sb.append(sb2);

		System.out.println(sb);
	}
}