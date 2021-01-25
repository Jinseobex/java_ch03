package org.comstudy21.ClassEx;

public class ClassExCircleClass {
	
		int radius; // 원의 반지름을 저장하는 멤버 필드(변수)
		String name;  // 원의 이름을 저장하는 멤버 변수
		
		public double getArea() {
			return 3.14*radius*radius;
		}
	
	public static void main(String[] args) {
		
		ClassExCircleClass pizza; 
		pizza = new ClassExCircleClass();
		pizza.radius = 10;
		pizza.name = "오구피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"피자의 면적은: "+area);
		
		ClassExCircleClass donut = new ClassExCircleClass();
		donut.radius = 2;
		donut.name = "던킨도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은: "+area);
		
	}

}	
