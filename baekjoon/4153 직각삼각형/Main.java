import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		new Solution().run();
	}
}

class Solution {
	Scanner sc = new Scanner(System.in);
	
	public void run() throws IOException {
		while(true) {
			String line = sc.nextLine();
			String[] strArr = line.split(" ");
			Integer[] arr = new Integer[strArr.length];
			arr[0] = Integer.valueOf(strArr[0]);
			arr[1] = Integer.valueOf(strArr[1]);
			arr[2] = Integer.valueOf(strArr[2]);

			Arrays.sort(arr);
			int A = arr[0];
			int B = arr[1];
			int C = arr[2];

			if (A == 0 && B == 0 && C == 0) {
				return;
			}

			if (A * A + B * B == C * C) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}