package org.comstudy21.ch05;

import java.util.Scanner;

class Circle {
	
	private double x, y;
	private int radius;
	
	public Circle (double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}
	public class CircleManager {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Circle C [] =  new Circle[3];
			for(int i=0; i<C.length; i++) {
				System.out.print("x, y, radius: ");
				double x = scanner.nextDouble();
				double y = scanner.nextDouble();
				int radius = scanner.nextInt();
				C[i] = new Circle(x, y, radius);
				
				if()
			}
			for(int i=0; i<C.length; i++) {
				C[i].show();
				scanner.close();
		}
	}
}