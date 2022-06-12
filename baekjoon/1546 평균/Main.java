import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Solution().run();
	}
}

class Solution {
	Scanner sc = new Scanner(System.in);
	
	public boolean run() throws IOException {

		int cnt = sc.nextInt();
		int[] n = new int[cnt];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < cnt; i++) {
			n[i] = sc.nextInt();
			if (n[i] > max) {
				max = n[i];
			}
		}

		double sum = 0;
		for (int i = 0; i < cnt; i++) {
			sum += (double)n[i]/(double)max * 100;
		}
		
		System.out.println(sum/cnt);
		

		return true;
	}
}