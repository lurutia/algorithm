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
		int L = Integer.parseInt(st.nextToken());
		
		int p1 = 0;
		int p2 = 0;
		long sum = 0;
		int[] result = new int[3];
		result[0] = Integer.MAX_VALUE;
		
		while(p1<=p2 && p2<1000000000) {
			if(sum == N && p2-p1+1 <=100 && p2-p1+1>=L) {
				if(result[0]>p2-p1) {
					result[0] = p2-p1;
					result[1] = p1;
					result[2] = p2;
				}
				if(p2-p1+1 == L) break;
			}
			
			if(sum < N) {
				sum = sum + ++p2;
			} else if(sum >= N) {
				sum = sum-p1++;
			}
		}
		
		if(result[0] == Integer.MAX_VALUE) {
			bw.write(-1+"\n");
		} else {
			for(int i=result[1]; i<=result[2]; i++) {
				bw.write(i+" ");
			}
			bw.write("\n");
		}
		
		bw.flush();
	}
}