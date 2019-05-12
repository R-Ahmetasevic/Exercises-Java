package zadaci;

public class SumaUSporednojDijagonaliMatrice {

	public static void main(String[] args) {
		int[][] matrix = generateMatrix(5);
		printMatrix(matrix);
		System.out.println("Suma elemenata u sporednoj dijagonali: "
				+ sumOtherDiagonal(matrix));
	}

	public static int sumOtherDiagonal(int[][] m) {
		int sum = 0;
		int indexSum = m.length - 1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i + j == indexSum) {
					sum += m[i][j];
				}
			}
		}

		return sum;
	}

	public static int[][] generateMatrix(int n) {
		int[][] m = new int[n][n];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (1 + Math.random() * 9);
			}
		}

		return m;
	}

	public static void printMatrix(int[][] m) {
		for (int[] row : m) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
}
