package zadaci;

public class MyArray {

	private int[] niz;
	
	public MyArray(int[] niz) {
		this.niz = niz;
	}

	public int getSmallestElement() {
		int min = niz[0];
		
		for(int i=0; i<niz.length; i++) {
			if(min > niz[i]) {
				min = niz[i];
			}
		}
		return min;
	}
	
	public int getLargestElement() {
		int max = niz[0];
		
		for(int i=0; i<niz.length; i++) {
			if(max < niz[i]) {
				max = niz[i];
			}
		}
		return max;
	}
	
	public int sumAllElements() {
		int sum = 0;
		for(int i=0; i<niz.length; i++) {
			sum += niz[i];
		}
		return sum;
	}

	public void printAllElements() {
		for(int i=0; i<niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 8, 6};
		
		MyArray array1 = new MyArray(array);
		
		System.out.println("Najmanji element niza je " + array1.getSmallestElement());
		System.out.println("Najveci element niza je: " + array1.getLargestElement());
		System.out.println("Suma svih elemenata niza je: " + array1.sumAllElements());
		System.out.println("Elementi niza su: ");
		array1.printAllElements();	
	}
}
