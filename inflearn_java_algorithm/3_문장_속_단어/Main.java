import java.util.Scanner;

/*
input
it is time to study

output
study
 */

public class Main {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length()) {
                max = arr[i].length();
                answer = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
        return ;
    }
}
