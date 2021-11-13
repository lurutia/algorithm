import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static List<Long> list = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer tk = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list.add(Long.parseLong(tk.nextToken()));	
		}
		
		Collections.sort(list);
		
		int n2 = Integer.parseInt(br.readLine());
		StringTokenizer tk2 = new StringTokenizer(br.readLine());
		for(int i=0; i<n2; i++) {
			int result = find(Long.valueOf(tk2.nextToken()));
			bw.write(result + "\n");
		}
			
		br.close();
		bw.close();
	}
	
	private static int find(Long x) {
		if(list.size() == 0) return -1;
		
		int start = 0;
		int end = list.size();
		int middle;
		Long value;
		
		while(true) {
			middle = start + (end - start)/2;
			value = list.get(middle);
			if(value.equals(x)) {
				return 1;
			} else if(value < x) {
				start = middle+1;
			} else if(value > x) {
				end = middle;
			}
			
			if(start == end) return 0;
		}
	}
}