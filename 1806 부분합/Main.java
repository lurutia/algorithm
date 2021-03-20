import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
				
		int[] arr = new int[N+1];
		
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int number = Integer.parseInt(st.nextToken());
			arr[i] = number;
		}
		
		int p1 = 0;
		int p2 = 0;
		int sum = arr[0];
		int result = Integer.MAX_VALUE;
		
		while(p1<=p2 && p2 < N) {
			if(sum < T) {
				sum = sum + arr[++p2];
			} else if(sum >= T) {
				result = Integer.min(result, p2-p1+1);
				sum = sum-arr[p1++];
			}
		}
		
		if(result == Integer.MAX_VALUE) result = 0;
		
		bw.write(result+"\n");
		bw.flush();
	}
}