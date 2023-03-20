import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		String n1 = st.nextToken();
		String n2 = st.nextToken();

		main.solution(n1, n2);
	}

	private void solution(String n1, String n2) {
		// 6을 5로 replace 하면 최소값
		// 5를 6으로 replace 하면 최대값

		int min = Integer.parseInt(n1.replace('6', '5')) + Integer.parseInt(n2.replace('6', '5'));
		int max = Integer.parseInt(n1.replace('5', '6')) + Integer.parseInt(n2.replace('5' ,'6'));

		System.out.println(min + " " + max);
	}
}