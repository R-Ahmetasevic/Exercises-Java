package zadaci;

public class MyInteger {

	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if(value % 2 == 0) { 
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if(value % 2 != 0) { 
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime() {
		if(value == 0 || value == 1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(value); i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int num) {
		if(num % 2 == 0) { 
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isOdd(int num) {
		if(num % 2 != 0) { 
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger number) {
		return number.isEven();
	}
	
	public static boolean isOdd(MyInteger number) {
		return number.isOdd();
	}
	
	public static boolean isPrime(MyInteger number) {
		return number.isPrime();
	}
	
	public boolean equals(int num) {
		if(num == value) {
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger number) {
		return number.equals(value);
	}
	
	public static int parseInt(char[] chars) {
		String sNumber = "";
		
		for (int i = 0; i < chars.length; i++) {
			sNumber += chars[i];
		}
		
		return Integer.parseInt(sNumber);
	}
	
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}


	public static void main(String[] args) {

		MyInteger number = new MyInteger(17);
		MyInteger number1 = new MyInteger(19);
		MyInteger number2 = new MyInteger(17);
		
		System.out.println("Is even: " + number.isEven());
		System.out.println("Is odd: " + number.isOdd());
		System.out.println("Is prime: " + number.isPrime());
		
		System.out.println("Is even 15: " + MyInteger.isEven(15));
		System.out.println("Is odd 15: " + MyInteger.isOdd(15));
		System.out.println("Is prime 15: " + MyInteger.isPrime(15));
		
		System.out.println("Is even number: " + MyInteger.isEven(number));
		System.out.println("Is odd number: " + MyInteger.isOdd(number));
		System.out.println("Is prime number: " + MyInteger.isPrime(number));
		
		System.out.println("Equals int: " + number.equals(14));
		System.out.println("Equals int: " + number.equals(17));
		System.out.println("Equals MyInteger: " + number.equals(number1));
		System.out.println("Equals MyInteger: " + number.equals(number2));
		
		char[] chars = {'1', '2', '3'};
		
		System.out.println("Convert chars to int: " + MyInteger.parseInt(chars));
		
		String sNum = "123";
		
		System.out.println("Convert string to int: " + MyInteger.parseInt(sNum));	
	}
}
