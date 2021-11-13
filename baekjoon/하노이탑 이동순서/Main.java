import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.valueOf(br.readLine());
		
		System.out.println((int)Math.pow(2, n)-1);
		hanoi(n, 1, 3, 2);
		br.close();
		bw.close();
	}

	private static void hanoi(int n, int source, int target, int sub) throws IOException {
		if(n == 1) {
			move(source, target);
			return;
		}
		
		hanoi(n-1, source, sub, target);
		move(source, target);
		hanoi(n-1, sub, target, source);
	}
	
	private static void move(int source, int target) throws IOException {
		bw.write(source + " " + target + "\n");
	}	
}