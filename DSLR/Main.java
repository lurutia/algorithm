import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Solution().run();
	}
}

class Solution {
	boolean[] visit = new boolean[10001];
	int[] from = new int[10001];
	char[] how = new char[10001];
	
	public boolean run() throws IOException {
		BufferedReader br;
		BufferedWriter bw;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int loop = Integer.parseInt(br.readLine());
		for(int i=0; i<loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			String ret = bfs(A, B);
			bw.write(ret+"\n");
		} 
		bw.flush();
		
		return true;
	}
	
	public String bfs(int A, int B) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(A));
		Arrays.fill(visit, false);
		visit[A] = true;
		from[A] = -1;
		how[A] = 'N';
		
		while(true) {
			Node findNode = queue.poll();
			if(findNode.A == B) {
				String path = "";
				int back = B;
				for(;;) {
					if(back < 0) break;
					if(how[back] != 'N') path = how[back] + path;
					back = from[back];
				}
				
				return path;
			}
			
			methodD(queue, findNode);
			methodS(queue, findNode);
			methodL(queue, findNode);
			methodR(queue, findNode);
		}
	}
	
	public void methodD(Queue<Node> queue, Node node) {
		int number = node.A*2;
		if(number>9999) {
			number = number%10000;
		}
		
		if(visit[number]) return;
		visit[number] = true;
		from[number] = node.A;
		how[number] = 'D';
		
		queue.add(new Node(number));
	}
	
	public void methodS(Queue<Node> queue, Node node) {
		int number = node.A==0 ? 9999 : node.A-1;
		
		if(visit[number]) return;
		visit[number] = true;
		from[number] = node.A;
		how[number] = 'S';
		
		queue.add(new Node(number));
	}
	
	public void methodL(Queue<Node> queue, Node node) {
		int number = node.A;
		int temp = node.A/1000;
		number = number*10 + temp;
		number = number%10000;
		
		if(visit[number]) return;
		visit[number] = true;
		from[number] = node.A;
		how[number] = 'L';
		
		queue.add(new Node(number));
	}
	
	public void methodR(Queue<Node> queue, Node node) {
		int number = node.A;
		int temp = number%10;
		number = number/10;
		number = number + temp*1000;
		
		if(visit[number]) return;
		visit[number] = true;
		from[number] = node.A;
		how[number] = 'R';
		
		queue.add(new Node(number));
	}
}

class Node {
	int A;
	
	public Node(int A) {
		this.A = A;
	}
}
