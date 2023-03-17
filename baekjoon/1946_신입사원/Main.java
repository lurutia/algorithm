import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			int nt = Integer.parseInt(br.readLine());
			int[][] arr = new int[nt][2];
			for (int j = 0; j < nt; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}

			answer[i] = main.solution(nt, arr);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(answer[i]);
		}
	}

	private int solution(int nt, int[][] arr) {
		int result = 0;
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		// 1등은 경쟁자가 없음
		int maxValue = arr[0][1];
		result++;

		for (int i = 1; i < nt; i++) {
			// 2등부터는 경쟁해야함 등수가 더 크면 안됨
			if (arr[i][1] < maxValue) {
				result++;
				maxValue = arr[i][1];
			}
		}

		return result;
	}
}
