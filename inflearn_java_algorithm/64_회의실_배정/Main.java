import java.util.*;

/*
input
5
1 4
2 3
3 5
4 6
5 7

3
3 3
1 3
2 3

output
3

2
 */

public class Main {

    public int solution(Room[] arr, int n) {
        int answer = 0;
        int last = Integer.MIN_VALUE;

        for (Room p : arr) {
            if (p.start >= last) {
                answer++;
                last = p.end;
            }
        }

        return answer;
    }
  
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        Room[] arr = new Room[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Room(in.nextInt(), in.nextInt());
        }

        Arrays.sort(arr);

        System.out.print(T.solution(arr, n));
        
        return ;
    }
}

class Room implements Comparable<Room> {
    int start;
    int end;

    public Room(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Room o) {
        if (o.end - this.end != 0) return this.end - o.end;
        else return this.start - o.start;
    }
}