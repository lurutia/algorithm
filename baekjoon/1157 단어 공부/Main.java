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
		String str = sc.nextLine().toUpperCase();
		char[] cArr = new char[26];
		for (char c : str.toCharArray()) {
			cArr[c - 'A'] += 1;
		}
		
		int max = Integer.MIN_VALUE;
		char maxAlpha = ' ';
		boolean sameFlag = false;
		for (int i = 0; i < 26; i++) {
			if (cArr[i] >= max) {
				sameFlag = cArr[i] == max;
				max = cArr[i];
				maxAlpha = (char)(i + 'A');
			}
		}

		if (sameFlag) System.out.println("?");
		else System.out.println(maxAlpha);

		
		return true;
	}
}