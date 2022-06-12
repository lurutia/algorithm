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

		double d = (double)n1/(double)n2;
		System.out.println(d);
		
		return true;
	}
}