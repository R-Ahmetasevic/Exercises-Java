package zadaci;

public class NasumicanNiz20Brojeva {

	public static void main(String[] args) {
		
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		for (int num : array) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}
