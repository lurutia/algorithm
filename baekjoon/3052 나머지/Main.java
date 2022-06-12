import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		main.solution(arr);
	}

	private void solution(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(arr[i] % 42);
		}

		System.out.println(set.size());
	}
}