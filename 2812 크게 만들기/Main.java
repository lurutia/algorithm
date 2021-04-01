import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;

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
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Stack<Integer> s = new Stack<Integer>();
		int[] arr2 = Stream.of(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
		
		int c = 0;
		for(int i=0; i<N; i++) {
			while(!s.isEmpty() && s.peek() < arr2[i] && c<K) {
				s.pop();
				c++;
			}
			
			s.add(arr2[i]);
		}
		
		while(c<K) {
			s.pop();
			c++;
		}
		
		for(int value : s) {
			System.out.print(value);
		}
	}
}
