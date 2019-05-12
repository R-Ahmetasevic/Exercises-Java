package zadaci;

public class Udaljenost2D {

	public static void main(String[] args) {

		int[][] niz =  {{0, 983, 787, 714, 1375},
						{983, 0, 214, 1102, 1763},
						{787, 214, 0, 888, 1549},
						{714, 1102, 888, 0, 661},
						{1375, 1763, 1549, 661, 0}};
		
		String[][] array = {{"Chicago", "Boston", "New York", "Atlanta", "Miami"}};
		
		
		System.out.println("Chicago Boston New York Atlanta Miami");
		for(int red=0; red<niz.length; red++) {
			for(int kolona=0; kolona<niz[red].length; kolona++) {		
				System.out.print(niz[red][kolona] + "\t ");
			}
			System.out.println();
		}
		
		
		
	}

}
