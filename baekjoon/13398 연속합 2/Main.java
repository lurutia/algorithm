import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Solution().run();
	}
}

class Solution {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public boolean run() throws IOException {
		
		run_test();
		
		return true;
	}
	
	public void run_test() throws NumberFormatException, IOException {
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int MAX = arr[0];
		int MAX2 = arr[0];
		int ret = arr[0];
		for(int i=1; i<N; i++) {
			int temp = MAX;
			MAX = Integer.max(MAX+arr[i], arr[i]);
			MAX2 = Integer.max(MAX2+arr[i], temp);
			ret = Integer.max(ret, Integer.max(MAX, MAX2));
		}
		
		bw.write(ret+"");
		bw.flush();
	}
}