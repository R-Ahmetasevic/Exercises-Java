package zadaci;

import java.util.GregorianCalendar;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		GregorianCalendar gc = new GregorianCalendar();
		year = gc.get(GregorianCalendar.YEAR);
		month = gc.get(GregorianCalendar.MONTH);
		day = gc.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public MyDate(long elapsedTime) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(elapsedTime);
		year = gc.get(GregorianCalendar.YEAR);
		month = gc.get(GregorianCalendar.MONTH);
		day = gc.get(GregorianCalendar.DAY_OF_MONTH);
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public void setDate(long elapsedTime) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(elapsedTime);
		year = gc.get(GregorianCalendar.YEAR);
		month = gc.get(GregorianCalendar.MONTH);
		day = gc.get(GregorianCalendar.DAY_OF_MONTH);		
	}
	
	public String toString() {
		String sMonth = "";
		
		switch (month) {
		case 0: sMonth = "Jan"; break;
		case 1: sMonth = "Feb"; break;
		case 2: sMonth = "Mar"; break;
		case 3: sMonth = "Apr"; break;
		case 4: sMonth = "May"; break;
		case 5: sMonth = "Jun"; break;
		case 6: sMonth = "Jul"; break;
		case 7: sMonth = "Aug"; break;
		case 8: sMonth = "Sep"; break;
		case 9: sMonth = "Oct"; break;
		case 10: sMonth = "Nov"; break;
		case 11: sMonth = "Dec";
		}
		
		return sMonth + " " + day + ", " + year;
	}


	public static void main(String[] args) {

		MyDate object1 = new MyDate();
		
		String sLong = "34355555133101";
		
		long number = Long.parseLong(sLong);
		
		MyDate object2 = new MyDate(number);
		
		System.out.println("Current date: " + object1.toString());
		System.out.println("Specified date: " + object2.toString());
		
		String sLong1 = "561555550000";
		long number1 = Long.parseLong(sLong1);
		
		object2.setDate(number1);
		
		System.out.println("Specified new date: " + object2.toString());
	}
}
