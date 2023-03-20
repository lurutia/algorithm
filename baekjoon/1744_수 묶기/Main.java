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

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		main.solution(N, arr);
	}

	private void solution(int N, int[] arr) {
		int result = 0;

		PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> queue2 = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			if (arr[i] > 0) {
				queue1.offer(arr[i]);
			} else {
				queue2.offer(arr[i]);
			}
		}

		while(!queue1.isEmpty()) {
			if (queue1.size() >= 2) {
				int a = queue1.poll();
				int b = queue1.poll();
				result += Math.max(a + b, a * b);
			} else {
				result += queue1.poll();
			}
		}

		while(!queue2.isEmpty()) {
			if (queue2.size() >= 2) {
				int a = queue2.poll();
				int b = queue2.poll();
				result += Math.max(a + b, a * b);
			} else {
				result += queue2.poll();
			}
		}

		System.out.println(result);
	}
}