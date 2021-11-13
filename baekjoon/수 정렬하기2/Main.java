import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int[] source;
	static int[] target;
	
	public static void main(String[] args) throws IOException {
		int n = Integer.valueOf(br.readLine());
		source = new int[n];
		target = new int[n];
		
		for(int i=0; i<n; i++) {
			source[i] = Integer.valueOf(br.readLine());
		}
		
		mergeSort(0, source.length-1);
		
		for(int i=0; i<target.length; i++) {
			bw.write(source[i] + "\n");
		}
		
		br.close();
		bw.close();
	}
	
	private static void mergeSort(int l, int r) {
		if(l < r) {
			int mid = l+(r-l)/2;
			
			mergeSort(l, mid);
			mergeSort(mid+1, r);
			
			partition(l, mid, r);
		}
	}
	
	private static void partition(int l, int mid, int r) {
		int i = l;
		int j = mid+1;
		int p = l;
		
		while(i<=mid || j<=r) {
			if(j > r || (i <= mid && source[i] < source[j])) {
				target[p] = source[i];
				i++;
			} else {
				target[p] = source[j];
				j++;
			}
			
			p++;
		}
		
		for(int n=l; n<=r; n++) {
			source[n] = target[n];
		}
	}
}