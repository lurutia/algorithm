import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int ret = loop(L, R);
		
		bw.write(ret+"");
		bw.flush();
		
		return true;
	}
	
	public int loop(int L, int R) {
		int ret = 0;
		String strL = String.valueOf(L);
		String strR = String.valueOf(R);
		if(strL.length() != strR.length()) {
			return 0;
		}
		
		for(int i=0; i<strL.length(); i++) {
			if(strL.charAt(i) == strR.charAt(i)) {
				if(strL.charAt(i)=='8') ret++;
			} else {
				break;
			}
		}
		
			
		return ret;
	}
}