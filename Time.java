package zadaci;

public class Time {

	public static void main(String[] args) {

		Time tm1 = new Time();
		Time tm2 = new Time(555550000);
		
		System.out.println("Current tm1: " + tm1.toString());
		System.out.println("Current tm2: " + tm2.toString());
		
		tm2.setTime(44440000);
		
		System.out.println("Current time2: " + tm2.toString());		
	}
	
	private long second;
	private long minute;
	private long hour;
	
	public Time() {
		long ms = System.currentTimeMillis();
		
		long totalSeconds = ms / 1000;
		second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 24;
		hour = totalHours % 24;
	}

	public Time(long elapseTime) {
	
		long totalSeconds = elapseTime / 1000;
		second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 24;
		hour = totalHours % 24;
	}

	public long getSecond() {
		return second;
	}

	public long getMinute() {
		return minute;
	}

	public long getHour() {
		return hour;
	}
	
	public void setTime(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		second = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 24;
		hour = totalHours % 24;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	
	
	
	

}
