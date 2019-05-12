package zadaci;

public class ShufflingMatrix {

	public static void main(String[] args) {

		int[][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		System.out.println("Originalni matrix:");
		printArray(m);
		shuffleArray(m);
		System.out.println("Shuffled matrix:");
		printArray(m);
		
	}
	
	public static void printArray(int[][] array) {
		for(int red=0; red<array.length; red++) {
			for(int kolona=0; kolona<array[red].length; kolona++) {
				System.out.print(array[red][kolona] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void shuffleArray(int[][] array) {
		
		for(int red=0; red<array.length; red++) {
			for(int kolona=0; kolona<array[red].length; kolona++) {
				int randomRow = (int) (Math.random() * array.length);
				int randomColumn = (int) (Math.random() * array[red].length);
				int temp = array[red][kolona];
				array[red][kolona] = array[randomRow][randomColumn];
				array[randomRow][randomColumn] = temp;
			}
		}
	}
}
