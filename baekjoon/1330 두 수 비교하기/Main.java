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

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(">");
		} else if (n1 == n2) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}

		return true;
	}
}