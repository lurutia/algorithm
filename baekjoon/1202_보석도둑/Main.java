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
		int juel = Integer.parseInt(st.nextToken());
		int beg = Integer.parseInt(st.nextToken());

		Integer[][] juels = new Integer[juel][2];
		for (int i = 0; i < juel; i++) {
			st = new StringTokenizer(br.readLine());
			juels[i][0] = Integer.parseInt(st.nextToken());
			juels[i][1] = Integer.parseInt(st.nextToken());
		}

		int[] begs = new int[beg];
		for (int i = 0; i < beg; i++) {
			begs[i] = Integer.parseInt(br.readLine());
		}

		main.solution(juels, begs);
	}

	private void solution(Integer[][] juels, int[] begs) {
		long result = 0;
		// 가방 오름차순 정렬
		Arrays.sort(begs);
		// 보석 무게순 오름차순 정렬
		Arrays.sort(juels, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return o1[0] - o2[0];
			}
		});

		PriorityQueue<Integer[]> queue = new PriorityQueue<>(new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return o2[1] - o1[1];
			}
		});

		int j = 0;
		// 가방 반복문
		for (int i = 0; i < begs.length; i++) {
			// 가벼운 가방부터 가방에 담을 수 있는 보석 구하기
			for (; j < juels.length; j++) {
				if (juels[j][0] <= begs[i]) {
					queue.offer(juels[j]);
				} else {
					break;
				}
			}

			if (!queue.isEmpty()) {
				result += queue.poll()[1];
			}
		}

		System.out.println(result);
	}
}