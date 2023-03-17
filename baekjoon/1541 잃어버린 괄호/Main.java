import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		main.solution(input);
	}

	private void solution(String input) {
		int result = 0;
		int firstMinus = input.indexOf('-');
		if (firstMinus > -1) {
			result += plus(input.substring(0, firstMinus));
			result += reversePlus(input.substring(firstMinus + 1));
		} else {
			result = plus(input);
		}

		System.out.println(result);
	}

	private int plus(String str) {
		String[] arr = str.split("\\+");
		return Arrays.stream(arr).map(Integer::parseInt).mapToInt(i -> i).sum();
	}

	private int reversePlus(String str) {
		str = str.replace('+', '-');
		String[] arr = str.split("-");
		return Arrays.stream(arr).map(Integer::parseInt).mapToInt(i -> -i).sum();
	}
}