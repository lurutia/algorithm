import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

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
		int n = sc.nextInt();
		
		Stack<Node> stack = new Stack<Node>();
		
		long result = 0;
		
		for(int i=0; i<n; i++) {
			int next = sc.nextInt();
			Node node = new Node(next, 1);
			
			while(!stack.isEmpty()) {
				if(stack.peek().height < node.height) {
					result = result + stack.pop().count;
				} else if(stack.peek().height == node.height) {
					node.count = stack.peek().count + 1;
					result = result + stack.pop().count;
				} else {
					result++;
					break;
				}
			}
			
			stack.push(node);
		}
		
		
		System.out.println(result);
	}
}

class Node {
	long height;
	long count;
	
	public Node(long height, long count) {
		this.height = height;
		this.count = count;
	}
}