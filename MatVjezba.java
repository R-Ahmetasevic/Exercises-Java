package zadaci;

public class MatVjezba {

	public static void main(String[] args) {

		int[][] niz = new int[4][4];
		fillArray(niz);
		
		System.out.println("Originalni niz:");
		printArray(niz);
		largestRowAndColumn(niz);
		
	}
	
	public static void largestRowAndColumn(int[][] m) {
		
		int row = 0;
		int column = 0;
		int rowSum = 0;
		int columnSum = 0;
		
		for(int i=0; i<m.length; i++) {
			rowSum += m[row][i];
			columnSum += m[i][column];
		}
		
		for(int i=0; i<m.length; i++) {
			int rowTemp = 0;
			int columnTemp = 0;
			for(int j=0; j<m[0].length; j++) {
				rowTemp += m[i][j];
				columnTemp += m[j][i];
			}
			
			if(rowTemp > rowSum) {
				rowSum = rowTemp;
				row = i;
			}
			
			if(columnTemp > columnSum) {
				columnSum = columnTemp;
				column = i;
			}
		}
		
		System.out.println("Largest row index " + row);
		System.out.println("Largest column index " + column);	
	}
	
	
	public static void fillArray(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				m[i][j] = (int)(Math.random() * 2);
			}
		}
	}
	
	public static void printArray(int[][] m) {
		for(int red=0; red<m.length; red++) {
			for(int kolona=0; kolona<m[red].length; kolona++) {
				System.out.print(m[red][kolona] + " ");
			}
			System.out.println();
		}		
	}
	
	

}
