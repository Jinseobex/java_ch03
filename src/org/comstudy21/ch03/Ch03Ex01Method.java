package org.comstudy21.ch03;

public class Ch03Ex01Method {
	
	static void swap(int x, int y) {
		int t = x;
		x = y;
		y = t;
	}
	
	public static void main(String[] args) {
		System.out.println("call by value example");
		// a -> x '값'이 전달 되는 것! 변수 자체가 전달 되는 것이 아니다.
		// 즉, 함수 내에서 아무리 돌려도 밖의 값이 변경되는 것이 아니다! 서로 다른 값!
		
		int a = 100;
		int b = 100; 
		
		swap(a, b);
		System.out.println("a: "+a+", b: "+b);
		
	}
}
