import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static List<Area> list = new ArrayList<Area>();
	
	public static void main(String[] args) throws IOException {
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int area = Integer.parseInt(tk.nextToken());
		int line = Integer.parseInt(tk.nextToken());
		int startArea = Integer.parseInt(tk.nextToken());
		
		for(int i=1; i<=area; i++) {
			list.add(new Area(i));
		}
		
		for(int i=0; i<line; i++) {
			StringTokenizer tk2 = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(tk2.nextToken());
			int end = Integer.parseInt(tk2.nextToken());
			
			list.get(start-1).addLine(list.get(end-1));
			list.get(end-1).addLine(list.get(start-1));
		}
		
		run(startArea);
		
		
		br.close();
		bw.close();
	}
	
	
	private static void run(int startArea) throws IOException {
		listSort();
		
		Area area = list.get(startArea-1);
		area.visit();
		dfs(area);
		
		listClear();
		
		List<Area> queue = new LinkedList<Area>();
		queue.add(area);
		bfs(queue);
	}
	
	private static void dfs(Area area) {
		for(int i=0; i<area.list.size(); i++) {
			Area findArea = area.list.get(i);
			if(findArea.isVisit()) continue;
			findArea.visit();
			dfs(findArea);
		}
	}
	
	private static void bfs(List<Area> queue) {
		if(queue.isEmpty()) return;
		
		for(int i=0; i<queue.size(); i++) {
			Area findArea = queue.get(i);
			if(findArea.isVisit()) continue;
			findArea.visit();
			queue.addAll(findArea.list);
		}
	}
	
	private static void listSort() {
		for(int i=0; i<list.size(); i++) {
			list.get(i).sort();
		}
	}
	
	private static void listClear() {
		System.out.print("\n");
		for(int i=0; i<list.size(); i++) {
			list.get(i).clear();
		}
	}
}

class Area {
	List<Area> list = new ArrayList<Area>();
	
	private int my;
	private boolean isVisit = false;
	
	Area(int my) {
		this.my = my;
	}
	
	public void addLine(Area area) {
		this.list.add(area);
	}
	
	public void visit() {
		this.isVisit = true;
		this.printMy();
	}
	
	public void printMy() {
		System.out.print(this.my + " ");
	}
	
	public boolean isVisit() {
		return this.isVisit;
	}
	
	public void clear() {
		this.isVisit = false;
	}
	
	public int getMy() {
		return this.my;
	}
	
	public void sort() {
		Collections.sort(this.list, new Comparator<Area>() {
			@Override
			public int compare(Area o1, Area o2) {
				return o1.getMy() < o2.getMy() ? -1 : 1;
			}
		});
	}
}