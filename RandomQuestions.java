package zadaci;

import java.util.Scanner;

public class RandomQuestions {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Unesite broj pitanja na koji zelite odgovoriti:");
		int unos = scn.nextInt();
		
		pitanja(unos);

		scn.close();
	}
	
	public static void pitanja(int brojPitanja) {
		
		Scanner scn = new Scanner(System.in);
		
		int brojacTacnihOdgovora = 0;
		int brojacNetacnihOdgovora = 0;
		
		int rez = 0;
		for(int i=0; i<brojPitanja; i++) {
			int randBroj1 = (int) (1 + Math.random() * 100);
			int randBroj2 = (int) (1 + Math.random() * 100);
			if(randBroj1 > randBroj2) {
				rez = randBroj1 - randBroj2;
				System.out.println("Koliko je " + randBroj1 + " - " + randBroj2 + " ?");
				int unos = scn.nextInt();
				if(unos == rez) {
					brojacTacnihOdgovora++;
				}
				else{
					brojacNetacnihOdgovora++;
				}
			}
			else if(randBroj2 > randBroj1) {
				randBroj2 = randBroj1;
				rez = randBroj1 - randBroj2;
				System.out.println("Koliko je " + randBroj1 + " - " + randBroj2 + " ?");
				int unos = scn.nextInt();
				if(unos == rez) {
					brojacTacnihOdgovora++;
				}
				else{
					brojacNetacnihOdgovora++;
				}
			}
		}
		System.out.println("Broj tacnih odgovora: " + brojacTacnihOdgovora);
		System.out.println("Broj netacnih odgovora: " + brojacNetacnihOdgovora);
		
		scn.close();
	}
}
