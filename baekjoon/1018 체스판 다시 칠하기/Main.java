import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		sc.nextLine();
		char[][] arr = new char[row][column];
		for (int i = 0; i < row; i++) {
			arr[i] = sc.nextLine().toCharArray();
		}

		main.solution(row, column, arr);
	}

	private void solution(int row, int column, char[][] arr) {
		int minCount = Integer.MAX_VALUE;
		for (int rowStart = 0; rowStart <= row - 8; rowStart++) {
			for (int columnStart = 0; columnStart <= column - 8; columnStart++) {
				char[][] copyArr1 = new char [row][column];
				char[][] copyArr2 = new char [row][column];
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < column; j++) {
						copyArr1[i][j] = arr[i][j];
						copyArr2[i][j] = arr[i][j];
					}
				}
				int currentCount = 0;
				int currentCount2 = 0;
				for (int i = rowStart; i < rowStart + 8; i++) {
					for (int j = columnStart; j < columnStart + 8; j++) {
						if ((i + j) % 2 == 0 && copyArr1[i][j] == 'B') {
							copyArr1[i][j] = 'W';
							currentCount++;
						} else if ((i + j) % 2 == 1 && copyArr1[i][j] == 'W') {
							copyArr1[i][j] = 'B';
							currentCount++;
						}
						if ((i + j) % 2 == 0 && copyArr2[i][j] == 'W') {
							copyArr2[i][j] = 'B';
							currentCount2++;
						} else if ((i + j) % 2 == 1 && copyArr2[i][j] == 'B') {
							copyArr2[i][j] = 'W';
							currentCount2++;
						}
					}
				}
				minCount = Math.min(minCount, Math.min(currentCount, currentCount2));
			}
		}

		System.out.println(minCount);
	}
}
