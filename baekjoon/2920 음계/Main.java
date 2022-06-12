import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int[] music = new int[8];
		for (int i = 0; i < 8; i++) {
			music[i] = sc.nextInt();
		}

		main.solution(music);
	}

	private void solution(int[] music) {
		int[] ascending = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		int[] descending = new int[]{8, 7, 6, 5, 4, 3, 2, 1};

		boolean ascendingFlag = true;
		boolean descendingFlag = true;
		for (int i = 0; i < 8; i++) {
			if (music[i] != ascending[i]) ascendingFlag = false;
			if (music[i] != descending[i]) descendingFlag = false;
		}

		if (ascendingFlag) System.out.println("ascending");
		else if (descendingFlag) System.out.println("descending");
		else System.out.println("mixed");

	}
}