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
		int cnt = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cnt; i++) {
			String line = sc.nextLine();
			String[] strArr = line.split(" ");
			int H = Integer.parseInt(strArr[0]);
			int W = Integer.parseInt(strArr[1]);
			int N = Integer.parseInt(strArr[2]);

			if (N % H == 0) {
				System.out.println(H + "" + String.format("%02d", N / H));
			} else {
				System.out.println(N % H + "" + String.format("%02d", (N / H) + 1));
			}
		}
	}
}