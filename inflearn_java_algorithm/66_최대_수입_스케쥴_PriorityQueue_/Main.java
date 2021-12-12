import java.util.*;

/*
input
6
50 2
20 1
40 2
60 3
30 3
30 1

output
150
 */

public class Main {

    private static int max = Integer.MIN_VALUE;
    public int solution(List<Lecture> list) {
        int answer = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int j = 0;
        for (int i = max; i > 0; i--) {
            for (; j < list.size(); j++) {
                if (list.get(j).day < i) break;
                else q.offer(list.get(j).pay);
            }
            if (!q.isEmpty()) answer = answer + q.poll();
        }
        

        return answer;
    }
  
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Lecture> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pay = in.nextInt();
            int day = in.nextInt();
            list.add(new Lecture(pay, day));
            max = Math.max(max, day);
        }

        Collections.sort(list);

        System.out.print(T.solution(list));
        
        return ;
    }
}

class Lecture implements Comparable<Lecture> {
    int pay;
    int day;
    public Lecture(int pay, int day) {
        this.pay = pay;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}