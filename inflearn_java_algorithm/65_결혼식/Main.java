import java.util.*;

/*
input
5
14 18
12 15
15 20
20 30
5 14

output
2
 */

public class Main {

    public int solution(List<Time> list) {
        int answer = 0;
        int cur = 0;

        for (Time t : list) {
            if (t.state.equals("S")) {
                cur++;
            }
            else {
                cur--;
            }
            answer = Math.max(answer, cur);
        }

        return answer;
    }
  
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Time> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            int t2 = in.nextInt();
            list.add(new Time(t, "S"));
            list.add(new Time(t2, "E"));
        }

        Collections.sort(list);

        System.out.print(T.solution(list));
        
        return ;
    }
}

class Time implements Comparable<Time> {
    int time;
    String state;

    public Time(int time, String state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) return this.state.equals("S") ? 1 : -1;
        else return this.time - o.time;
    }
}