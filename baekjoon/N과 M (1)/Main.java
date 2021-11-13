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
	static boolean isVisit[] = {false, false, false, false, false, false, false, false, false};
	static int arr[];
	
	public static void main(String[] args) throws IOException {
		StringTokenizer tk = new StringTokenizer(br.readLine());
		a = Integer.parseInt(tk.nextToken());
		b = Integer.parseInt(tk.nextToken());
		
		arr = new int[b];
		
		run();
		
		br.close();
		bw.close();
	}
	
	private static void run() throws IOException {
		nm(1);
	}
	
	private static void nm(int position) throws IOException {
		if(position > b) return;
		for(int i=1; i<=a; i++) {
			if(isVisit[i]) {
				continue;
			}
			
			arr[position-1] = i;
			isVisit[i] = true;
			if(position == b) {
				for(int j=0; j<arr.length; j++) {
					bw.write(arr[j] +  " ");	
				}
				bw.write("\n");
			} else {
				nm(position + 1);	
			}
			
			isVisit[i] = false;
		}
	}
}
