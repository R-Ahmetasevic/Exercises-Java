package zadaci;

public class IdenticanBrojJedinicaUReduIKoloni {

	public static boolean checkEvenRowsAndColumns(int[][] arr) {
		int rowSum = 0;
		int columnSum = 0;
		for (int i = 0; i < arr.length; i++) {
			rowSum += arr[0][i];
			columnSum += arr[i][0];
		}
		for (int i = 0; i < arr.length; i++) {
			int sumTempRow = 0;
			int sumTempCol = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sumTempRow += arr[i][j];
				sumTempCol += arr[j][i];
			}
			if (sumTempRow != rowSum || sumTempCol != columnSum) {
				return false;
			}
		}
		return true;
	}

	public static void fillArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
			int[][] matrix = new int[8][8];
			fillArray(matrix);
			if (checkEvenRowsAndColumns(matrix)) {
				printArray(matrix);
				System.out.println("The matrix has even number of 0s and 1s.");
			} else {
				System.out.println("The matrix doesn't have even number of 0s and 1s.");
			}
		
	}
}
