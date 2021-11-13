import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
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
		int n = sc.nextInt();
		Queue<Node> classes = new PriorityQueue<Node>(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o1.start == o1.end) {
					return o1.end - o2.end;
				}
				
				return o1.start - o2.start;
			}
		});
		Queue<Integer> rooms = new PriorityQueue<Integer>();
		
		for(int i=0; i<n; i++) {
			classes.add(new Node(sc.nextInt(), sc.nextInt()));
		}
		
		while(!classes.isEmpty()) {
			Node node = classes.poll();
			if(rooms.isEmpty()) {
				rooms.add(node.end);
			} else {
				if(rooms.peek() > node.start) {
					rooms.add(node.end);
				} else {
					rooms.add(node.end);
					rooms.poll();
				}
			}
		}
		
		System.out.println(rooms.size());
	}
}

class Node {
	int start;
	int end;
	public Node(int start, int end) {
		this.start = start;
		this.end = end;
	}
}