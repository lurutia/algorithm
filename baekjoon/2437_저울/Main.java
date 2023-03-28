import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		main.solution(N, arr);
	}

	private void solution(int N, int[] arr) {
		int result = 0;
		int sum = 0;
		// 오름차순 정렬
		Arrays.sort(arr);

		// 현재수가 지금까지 나온 수의 합 + 1보다 클경우 실패
		for (int i = 0; i < N; i++) {
			if (arr[i] > sum + 1) {
				break;
			}

			sum += arr[i];
		}

		result = sum + 1;
		System.out.println(result);
	}
}