package org.comstudy21.ch03;

	// class는 사용자 정의 타입이다.
	// 사용자가 임의로 만들어서 쓰는 데이터 타입
	// 클래스 = (멤버)필드 + 메소드
	// 필드 : 속성(변수)
	// 메소드 : 일(함수)

class Point {
	// 포인트라는 객체를 만들어서 x,y를 집어넣었다.
	// 어찌보면 배열과 비슷하다고 할 수 있다.
	int x;
	int y;
}

// 패키지 멤버.

public class Ch03Ex02Refer {
	
	static void swap(Point p) { // 받을 땐 타입만 맞춰주면 됨!
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
	}
	public static void main(String[] args) {
		
		Point p1 = null; // Point 타입의 참조변수 p1을 선언했다.
		p1 = new Point(); // new라는 연산자를 써야 객체든 뭐든 만들 수 있다. 
		//p1=레퍼런스!!!
		System.out.println(p1);
		
		p1.x = 100;
		p1.y = 200;
		
		swap(p1);
		System.out.println("p.x: "+p1.x+", p.1y; "+p1.y);
	}

}
