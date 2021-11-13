import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int a, b;
	static int arr[];
	static int count = 0;
	
	
	public static void main(String[] args) throws IOException {
		StringTokenizer tk = new StringTokenizer(br.readLine());
		a = Integer.parseInt(tk.nextToken());
		b = Integer.parseInt(tk.nextToken());
		
		arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		run();
		
		bw.write(count + "\n");
		
		br.close();
		bw.close();
	}
	
	private static void run() throws IOException {
		for(int i=a-1; i>=0; i--) {
			int divide = b/arr[i];
			if(divide== 0) continue;
			b = b % arr[i];
			
			count = count + divide;
			
			if(b == 0) return;
		}
	}
}