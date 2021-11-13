import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		new Solution().run();
	}
}

class Solution {
	
	public boolean run() throws IOException {
		BufferedReader br;
		BufferedWriter bw;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9*9];
		char[] charArr = null;
		for(int i=0; i<81; i++) {
			if(i%9==0) {
				charArr = br.readLine().toCharArray();
			}
			arr[i] = Integer.parseInt(String.valueOf(charArr[i%9]));
		}
		
		backtracking(arr, 0);
		
		for(int i=0; i<81; i++) {
			bw.write(arr[i]+"");
			if(i>0 && (i+1)%9 == 0) {
				bw.write("\n");
			}
		}
		bw.flush();
		
		return true;
	}
	
	public boolean backtracking(int[] arr, int count) {
		if(count == 81) return true;
		
		if(arr[count] > 0)
			return backtracking(arr, count+1);
		else {
			for(int i=1; i<=9; i++) {
				arr[count] = i;
				if(check(arr, count) && backtracking(arr, count+1)) {
					return true;
				}
			}
			
			arr[count] = 0;
			return false;
		}
	}
	
	public boolean check(int[] arr, int count) {
		int r = count/9;
		int h = count%9;
		int midr = r-(r%3);
		int midh = h-(h%3);
		boolean[] visit = new boolean[10];
		
		Arrays.fill(visit, false);
		for(int i=0; i<9; i++) {
			int value = arr[r*9+i];
			if(value == 0) continue;
			if(visit[value]) return false;
			visit[value] = true;
		}
		
		Arrays.fill(visit, false);
		for(int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				int value = arr[((midr+i)*9) + (midh+j)];
				if(value == 0) continue;
				if(visit[value]) return false;
				visit[value] = true;
			}
		}
		
		Arrays.fill(visit, false);
		for(int i=0;i<9;i++) {
			int value = arr[(i*9)+h];
			if(value == 0) continue;
			if(visit[value]) return false;
			visit[value] = true;
		}
		
		return true;
	}
}