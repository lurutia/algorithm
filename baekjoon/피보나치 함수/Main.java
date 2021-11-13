import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static boolean visit[];
	static Integer arrZero[];
	static Integer arrOne[];
	
	static int zero;
	static int one;
	
	public static void main(String[] args) throws IOException {
		int a = Integer.parseInt(br.readLine());
		int b[] = new int[a];
		for(int i=0; i<a; i++) {
			b[i] = Integer.parseInt(br.readLine());	
		}
		
		
		for(int i=0; i<a; i++) {
			zero = 0;
			one = 0;
			visit = new boolean[b[i] + 1];
			arrZero = new Integer[b[i] + 1];
			arrOne = new Integer[b[i] + 1];
			run(b[i]);
			bw.write(zero + " " + one + "\n");
		}
		
		br.close();
		bw.close();
	}
	
	private static void run(int n) throws IOException {
		fivonacci(n);
	}
	
	private static void fivonacci(int n) throws IOException {
		if(n == 0) {
			if(!visit[n]) {
				arrZero[n] = 0;
				visit[n] = true;
			}
			zero++;
		} else if(n == 1) {
			if(!visit[n]) {
				arrOne[n] = 1;
				visit[n] = true;
			}
			one++;
		} else {
			if(visit[n]) {
				zero = zero + arrZero[n];
				one = one + arrOne[n];
			} else {
				fivonacci(n-1);
				fivonacci(n-2);
				arrZero[n] = zero;
				arrOne[n] = one;
				visit[n] = true;
			}
		}
	}
}