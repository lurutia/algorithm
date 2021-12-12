import java.util.*;

/*
input
9 7
1 2
2 3
3 4
1 5
6 7
7 8
8 9
3 8

output
NO
 */

 public class Main {

    static int[] unf;
    public static int find(int start) {
        if (start == unf[start]) return start;
        else return unf[start] = find(unf[start]);
    }

    public static void union(int start, int end) {
        int a = find(start);
        int b = find(end);
        if (a != b) unf[a] = b;
    }
  
    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < k; i++) {
            int start = in.nextInt();
            int end = in.nextInt();

            union(start, end);
        }

        int start = in.nextInt();
        int end = in.nextInt();

        int a = find(start);
        int b = find(end);
        
        if (a == b) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }

        
        
        return ;
    }
}

// public class Main {
//     static int[] ck;
//     public String BFS(Map<Integer, List<Integer>> map, int start, int end) {
//         String answer = "NO";

//         Queue<Integer> queue = new LinkedList<>();
//         queue.offer(start);

//         int L = 0;
//         while (!queue.isEmpty()) {
//             L++;
//             for (int i = 0; i < queue.size(); i++) {
//                 int s = queue.poll();
//                 if (ck[s] != 0) continue;
//                 ck[s] = 1;
//                 if (s == end) {
//                     answer = "YES";
//                     return answer;
//                 }
//                 List<Integer> list = map.get(s);
//                 if (list == null) continue;
//                 for (Integer x : list) {
//                     queue.offer(x);
//                 }
//             }
//         }
        
//         return answer;
//     }
  
//     public static void main(String[] args) throws Exception {
//         Main T = new Main();
//         Scanner in = new Scanner(System.in);

//         int n = in.nextInt();
//         int k = in.nextInt();

//         ck = new int[n];
//         Map<Integer, List<Integer>> map = new HashMap<>();

//         for (int i = 0; i < k; i++) {
//             int start = in.nextInt();
//             int end = in.nextInt();
//             List<Integer> list = map.getOrDefault(start, new ArrayList<>());
//             list.add(end);
//             map.put(start, list);

//             list = map.getOrDefault(end, new ArrayList<>());
//             list.add(start);
//             map.put(end, list);
//         }

//         int start = in.nextInt();
//         int end = in.nextInt();

//         System.out.print(T.BFS(map, start, end));
        
//         return ;
//     }
// }