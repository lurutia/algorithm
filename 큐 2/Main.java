import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static MyQueue queue;
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		queue = new MyQueue();
		
		for(int i=0; i<n; i++) {
			String command = br.readLine();
			run(command);	
		}
		
		br.close();
		bw.close();
	}
	
	private static void run(String command) throws IOException {
		String commandToken[] = command.split(" ");
		
		if(commandToken[0].equals("push")) {
			queue.push(Integer.parseInt(commandToken[1]));
		} else if(commandToken[0].equals("pop")) {
			bw.write(queue.pop()+"\n");
		} else if(commandToken[0].equals("front")) {
			bw.write(queue.front()+"\n");
		} else if(commandToken[0].equals("size")) {
			bw.write(queue.size()+"\n");
		} else if(commandToken[0].equals("empty")) {
			bw.write(queue.empty()+"\n");
		} else if(commandToken[0].equals("back")) {
			bw.write(queue.back()+"\n");
		} 
	}
}

class MyQueue {
	private int arr[] = new int[1];
	private int front = 0;
	private int back = 0;
	
	public void push(int num) {
		if(this.back >= this.arr.length) {
			int temp[] = new int[this.arr.length * 2];
			for(int i=0; i<this.arr.length-front; i++) {
				temp[i] = this.arr[i+front];
			}
			
			this.arr = temp;
			this.back = this.back-this.front;
			this.front = 0;
		}
		
		
		this.arr[this.back++] = num;
	}
	
	public int pop() {
		if(this.front == this.back) return -1;
		
		return this.arr[this.front++];
	}
	
	public int size() {
		return this.back-this.front;
	}
	
	public int empty() {
		return this.back-this.front <= 0 ? 1 : 0;
	}
	
	public int front() {
		if(this.empty() == 1) return -1;
		return this.arr[this.front];
	}
	
	public int back() {
		if(this.empty() == 1) return -1;
		return this.arr[this.back-1];
	}
}