import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static List<ConferenceRoom> roomList = new ArrayList<ConferenceRoom>();
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(tk.nextToken());
			int end = Integer.parseInt(tk.nextToken());
			roomList.add(new ConferenceRoom(start, end));
		}
		
		roomList.sort(new Comparator<ConferenceRoom>() {
			@Override
			public int compare(ConferenceRoom c1, ConferenceRoom c2) {
				if(c1.end > c2.end) return 1;
				else if(c1.end == c2.end) {
					if(c1.start > c2.start) return 1;
					else return -1;
				} else {
					return -1;
				} 
			}
		});
		
		for(int i=0; i<n; i++) {
			roomList.get(i).idx = i;
		}
		
		run();
		
		bw.write(count + "\n");
		
		
		br.close();
		bw.close();
	}
	
	private static void run() throws IOException {
		if(roomList.size() <= 1) {
			count = roomList.size();
			return;
		}
		
		ConferenceRoom lastRoom = roomList.get(0);
		
		
		count++;
		
		while(true) {
			boolean isLast = true;
		
			for(int i=lastRoom.idx+1; i<roomList.size(); i++) {
				if(lastRoom.end<=roomList.get(i).start && lastRoom.start <= roomList.get(i).start) {
					lastRoom = roomList.get(i);
					count++;
					isLast = false;
					break;
				}
			}
			
			if(isLast) return;
		}
	}
}

class ConferenceRoom {
	int idx;
	int start;
	int end;
	
	public ConferenceRoom(int start, int end) {
		this.start = start;
		this.end = end;
	}
}