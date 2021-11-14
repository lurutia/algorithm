import java.util.*;

/*
input
5
1 3 9 5 2
5
3 2 5 7 8

output
2 3 5
 */

public class Main {
    public List<Integer> solution(int[] arr, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int lt = 0;
        int rt = 0;

        while(lt < arr.length && rt < arr2.length) {
            if (arr[lt] == arr2[rt]) {
                answer.add(arr[lt]);
                lt++;
                rt++;
            }
            else if (arr[lt] < arr2[rt]) lt++;
            else rt++;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        n = in.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
       
        for (int x : T.solution(arr, arr2)) {
            System.out.print(x + " ");
        }

        return ;
    }
}
