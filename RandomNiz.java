package zadaci;

public class RandomNiz {

	public static void main(String[] args) {

		int[] arr = generateArray();
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}
	
	public static int[] generateArray() {
		
		int[] array = new int[10];
		
		for (int i=0; i<array.length; i++) {
			int element = (int) (10 + Math.random() * 90);
			for (int j=0; j<array.length; j++) {
				if (element == array[j]) {
					j--;
					element = (int) (10 + Math.random() * 90);
				}
			}
			array[i] = element;
		}
		return array;
	}
}
