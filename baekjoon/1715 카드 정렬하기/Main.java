import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

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
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			queue.add(sc.nextInt());
		}
		
		int result = 0;
		while(!queue.isEmpty()) {
			if(queue.size() == 1) break;
			int value1 = queue.poll();
			int value2 = queue.poll();
			
			result += value1 + value2;
			queue.add(value1 + value2);
		}
		
		System.out.print(result);
	}
}
