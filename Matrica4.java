package zadaci;

public class Matrica4 {

	public static void main(String[] args) {
		char[][] odgovori = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E','D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E','D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E','D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E','D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E','D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E','D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E','D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E','D'}
				};

		char[] kljuc = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

		for (int i=0; i<odgovori.length; i++) {
			int tacniOdgovori = 0;
			for (int j=0; j<odgovori[i].length; j++) {
				if (odgovori[i][j] == kljuc[j]) {
					tacniOdgovori++;
				}
			}
			System.out.println("Student " + i + " je imao " + tacniOdgovori + 
				" tacnih odgovora.");
		}
	}
}
