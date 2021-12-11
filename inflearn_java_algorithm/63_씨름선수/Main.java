import java.util.*;

/*
input
5
172 67
183 65
180 70
170 72
181 60

output
3
 */

public class Main {

    public int solution(Player[] arr, int n) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (Player p : arr) {
            if (p.weight > max) {
                answer++;
                max = p.weight;
            }
        }

        return answer;
    }
  
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);

        int n = in.nextInt();
        Player[] arr = new Player[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Player(in.nextInt(), in.nextInt());
        }

        Arrays.sort(arr);

        System.out.print(T.solution(arr, n));
        
        return ;
    }
}

class Player implements Comparable<Player> {
    int height;
    int weight;
    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
        return o.height - this.height;
    }
}