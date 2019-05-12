package zadaci;

import java.util.Scanner;

public class Vjezba1 {
	
	private double width;
	private double height;
	
	public Vjezba1() {
	}

	public Vjezba1(double width, double height) {	
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(this.width < 0){
			this.width = 0;
		}
		
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(this.height < 0) {
			this.height = 0;
		}
		this.height = height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}

	public static void main(String[] args) {

	}
	
	
	
	
}
