package zadaci;

import java.util.HashSet;
import java.util.Set;

public class PozitivniINegativniUNizu {

	public static void main(String[] args) {

		int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
		
		int brojPozitivnih = 0;
		int brojNegativnih = 0;
		int brojNula = 0;
		
	
		for(int i=0; i<array.length; i++) {
			if(array[i] > 0) {
				brojPozitivnih++;
			}
			else if(array[i] < 0) {
				brojNegativnih++;
			}
			else {
				brojNula++;
			}
		}
		
		/*Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < array.length ; i++)
        {
            if(set.add(array[i]) == false)
            {
            	
                System.out.println("Duplicate element found : " + array[i]);
                System.out.println(counter[i]);
            }
        }*/
	    
		
		
		
		int[] nizPozitivnih = new int[brojPozitivnih];
		int[] nizNegativnih = new int[brojNegativnih];
		int[] nizNula = new int[brojNula];
		
		for(int i=0; i<array.length; i++) {
			int num = array[i];
			if(num > 0) {
				int index = (nizPozitivnih.length - brojPozitivnih);
				nizPozitivnih[index] = num;
				brojPozitivnih--;
			}
			else if(num < 0) {
				int index = (nizNegativnih.length - brojNegativnih);
				nizNegativnih[index] = num;
				brojNegativnih--;
			}
			else {
				int index = (nizNula.length - brojNula);
				nizNula[index] = num;
				brojNula--;
			}	
		}
			
		System.out.println("Originalni niz:");
		print(array);
		System.out.println("Niz pozitivnih:");
		print(nizPozitivnih);
		System.out.println("Niz negativnih:");
		print(nizNegativnih);
		System.out.println("Niz nula:");
		print(nizNula);	
	}

	public static void print(int[] array) {
		for(int e : array) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
