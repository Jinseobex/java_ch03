package org.comstudy21.ch03;

class People {
	String name;
	String phone;
	String address;

	// 생성자는 멤버를 초기화 하는 목적이 있는 메소드이다.
	// 리턴하지 않고 리턴형도 없다.
	// 생성자 메소드의 이름은 클래스 이름과 동일 해야 한다.
	// 생성자도 함수이므로 함수의 다른 특징을 모두 갖는다.
	// 생성자 Override - 생성자 재정의
	public People(String name, String phone, String address) {
		// super(); <--- 반드시 지워줘야 함. 부모의 생성자를 호출하는 것으로 필요가 없다.
		this.name = name;
		this.phone = phone;
		this.address = address;
	}



	// 재정의 - Override. 다시 만든다.
	
	@Override // 검사해주는 역활을 한다.
	public String toString() {
		return String.format("%-6s\t%-17s\t%s\n", name, phone, address);
	}
	
}

public class Ch03Ex03PointEx {
	
	public static void main(String[] args) {
//		People kim = new People();
//		kim.name = "김유신";
//		kim.phone = "010-1234-5678";
//		kim.address = "서울시 종로구 견지동";
		//People 타입의 참조변수 kim
		People kim = new People("김일성","010-1234-5678","평안남도 평양시");
		
		//System.out.printf("%s | %s %s\n", kim.name, kim.phone, kim.address);
		System.out.println(kim.toString()); // toString()이 생략 되어있다.
	}

}
