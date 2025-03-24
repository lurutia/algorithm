import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Solution().run();
	}
}

class Solution {
	Scanner sc = new Scanner(System.in);
	
	public void run() throws IOException {
		String line = sc.nextLine();
		String[] arr = line.split(" ");

		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);

		Queue<Integer[]> queue = new LinkedList<>();

		int[][] arrays = new int[m][n];
		for (int i = 0; i < m; i++) {
			String mStr = sc.nextLine();
			String[] mArr = mStr.split(" ");
			for (int j = 0; j < n; j++) {
				arrays[i][j] = Integer.parseInt(mArr[j]);
				if (arrays[i][j] == 1) {
					Integer[] pos = new Integer[]{i, j};
					queue.add(pos);
				}
			}
		}

		int result = 0;
		int[] yDirection = new int[]{-1, 0, 1, 0};
		int[] xDirection = new int[]{0, 1, 0, -1};
		while (!queue.isEmpty()) {
			Integer[][] list = new Integer[queue.size()][2];
			int queueSize = queue.size();
			for (int i = 0; i < queueSize; i++) {
				list[i] = queue.poll();
			}

			boolean addFlag = false;
			for (int j = 0; j < list.length; j++) {
				Integer[] pos = list[j];
				int y = pos[0];
				int x = pos[1];
				for (int i = 0; i < 4; i++) {
					int nextY = y + yDirection[i];
					int nextX = x + xDirection[i];
					if (nextY >= 0 && nextX >= 0 && nextY < m && nextX < n) {
						if (arrays[y + yDirection[i]][x + xDirection[i]] == 0) {
							arrays[y + yDirection[i]][x + xDirection[i]] = 1;
							queue.add(new Integer[]{y + yDirection[i], x + xDirection[i]});
							addFlag = true;
						}
					}
				}
			}

			if (addFlag) {
				result++;
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arrays[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}



		System.out.println(result);
	}
}