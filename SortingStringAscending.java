package zadaci;

public class SortingStringAscending {

	public static void main(String[] args) {

		String[] cities = {"Sarajevo", "Ljubljana", "Beograd", "Zagreb", "Skopje"};
		
		for(int i=0; i<cities.length; i++) {
			
			for(int j=1; j<cities.length; j++) {
				
				if(cities[j-1].compareTo(cities[j]) > 0) {
					String temp = cities[j-1];
					cities[j-1] = cities[j];
					cities[j] = temp;
				}
			}
		}
		
		System.out.println("Gradovi po ascending orderu:");
		for(int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
		}
	}
}
