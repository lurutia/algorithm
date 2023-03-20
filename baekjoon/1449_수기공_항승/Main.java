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
		StringTokenizer st = new StringTokenizer(str);
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		main.solution(N, L, arr);
	}

	private void solution(int N, int L, int[] arr) {
		int result = 0;

		// 오름차순 정렬
		Arrays.sort(arr);

		// 수리해야할 위치만큼 반복문
		for (int i = 0; i < N; i++) {
			result++;

			int current = arr[i];
			// 수리할 수 있을때까지 반복
			for (int j = i + 1; j < N; j++) {
				if (arr[j] - current < L) {
					i++;
				} else {
					break;
				}
			}
		}

		System.out.println(result);
	}
}