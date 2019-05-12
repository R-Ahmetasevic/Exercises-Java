package zadaci;

import java.util.Date;

public class StopWatch {
	
	private Date startTime;
	private Date endTime;
	
	public Date getStartTime() {
		return startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public StopWatch() {
		startTime = new Date();
	}
	
	public Date Start() {
		return startTime;
	}
	
	public Date Stop() {
		endTime = new Date();
		return startTime;
	}
	
	public long getElapsedTime() {
		return endTime.getTime() - startTime.getTime();
	}
	
	public static void main(String[] arg) {
		
		int[] niz = new int[100000];
		
		for(int i=0; i<niz.length; i++) {
			niz[i] = (int) (1 + Math.random() * 100000);
		}
		
		StopWatch clk = new StopWatch();
		clk.Start();
		selectionSort(niz);
		clk.Stop();
		
		System.out.println("Execution time: " + clk.getElapsedTime());
		System.out.println("Start time was: " + clk.getStartTime());
		System.out.println("End time was: " + clk.getEndTime());
	}

	public static void selectionSort(int[] niz) {

		for(int i=0; i<niz.length; i++) {
			int najmanjiBroj = niz[i];
			int index = i;
			for(int j=i+1; j<niz.length; j++) {
				if(najmanjiBroj > niz[j]) {
					najmanjiBroj = niz[j];
					index = j;
				}
			}
			if(index != i) {
				niz[index] = niz[i];
				niz[i] = najmanjiBroj;
			}
		}
	}
	
	
}
