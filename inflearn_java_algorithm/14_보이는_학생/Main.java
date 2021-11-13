import java.util.Scanner;

/*
input
5
2 3 3 1 3
1 1 2 2 3

output
A
B
A
B
D
 */

public class Main {
    public String[] solution(int[] arr, int[] arr2, int n) {
        String answer[] = new String[n];
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1 && arr2[i] == 3) {
                answer[i] = "A";
            }
            else if (arr[i] == 2 && arr2[i] == 1) {
                answer[i] = "A";
            }
            else if (arr[i] == 3 && arr2[i] == 2) {
                answer[i] = "A";
            }
            else if (arr[i] == arr2[i]) {
                answer[i] = "D";
            }
            else {
                answer[i] = "B";
            }
        }


       return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }

        for (String x : T.solution(arr, arr2, n)) {
            System.out.println(x);
        }

        return ;
    }
}
