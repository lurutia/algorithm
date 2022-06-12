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
		String str = sc.nextLine();
		String[] strArr = str.split(" ");

		if (strArr.length == 0) {
			System.out.println(0);
		} else if (strArr[0].isBlank()) {
			System.out.println(strArr.length - 1);
		} else {
			System.out.println(strArr.length);
		}

		
		return true;
	}
}