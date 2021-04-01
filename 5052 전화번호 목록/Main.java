import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;

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
		
		int test_case = sc.nextInt();
		for(int i=0; i<test_case; i++) {
			run_test();
		}
		
		return true;
	}
	
	public void run_test() throws NumberFormatException, IOException {
		int n = sc.nextInt();
		
		Queue<String> queue = new PriorityBlockingQueue<String>();
		
		for(int i=0; i<n; i++) {
			queue.add(sc.next());
		}
		
		String last = null;
		String s = null;
		while(!queue.isEmpty()) {
			if(last == null) {
				last = queue.poll();
				continue;
			} else {
				s = queue.poll();
			}
			
			if(s.startsWith(last)) {
				System.out.println("NO");
				return;
			} else {
				last = s;
			}
		}
				
		System.out.println("YES");
	}
}