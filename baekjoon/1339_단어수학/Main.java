import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}

		main.solution(n, arr);
	}

	private void solution(int n, String[] arr) {
		int[] alphabet = new int[26];
		// 반복문
		for (int i = 0; i < n; i++) {
			// 알파벳을 자릿수에 맞게 증가
			char[] arr2 = arr[i].toCharArray();
			int index = arr2.length - 1;
			// 두번째 반복문
			for (int j = 0; j < arr2.length; j++) {
				// 알파벳 index 10 ^ 자리수 증가
				alphabet[arr2[j] - 'A'] += Math.pow(10, index - j);
			}
		}

		// 정렬
		Arrays.sort(alphabet);
		// 가장 높은 숫자부터 9~0까지 부여
		int current = 9;
		int sum = 0;
		for (int i = 25; i >= 0; i--) {
			sum += alphabet[i] * current;
			current--;
		}

		// 합계 출력
		System.out.println(sum);
	}
}