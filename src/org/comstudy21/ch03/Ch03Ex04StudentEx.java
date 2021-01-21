package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	 String name;
	 String major;
	 double point;
	 int rank;
	 
	 public Student() {
		// 디폴트 생성자
		 System.out.println("디폴트 생성자 호출");
	}
	 
	 // 생성자 재정의 - over load 같은 클래스 같은 이름의 메소드를 추가하는 것
	 // 시그니처 - 매개변수의 타입과 갯수가 된다.
	 
	 public Student(String name, String major, double point, int rank) {
		 
		this.name = name;
		this.major = major;
		this.point = point;
		this.rank = rank;
	}
	 
	 // override - 상속관계. 부모의 멤버를 재정의한다  부모=클래스와 똑같아야 함!!! 
	 // 부모것을 막고 자식 것을 사용한다. 그렇기 때문에 '재정의'
	 @Override
	public String toString() {
		return "[" + name + ", " + major + ", " + point + ", " + rank + "]";
	}

}

public class Ch03Ex04StudentEx {
	
	static Scanner scan = new Scanner(System.in);
	
	static final int MAX = 50;
	static Student[] stArr = new Student[MAX];
	
	static Student mkStudent() {
		Student student = new Student();
		System.out.print("성명: ");
		student.name = scan.next();
		System.out.print("학과: ");
		student.major = scan.next();
		System.out.print("성적: ");
		student.point = scan.nextDouble();
		System.out.print("등수: ");
		student.rank = scan.nextInt();
		
		return student;
	}

	public static void main(String[] args) {
		Student[] arr = new Student[2]; 
		
		
		// 생성자 오버로딩이 되었을 때는 디폴트 생성자를 명시적으로 추가 해야 한다.
		// 생성자 오버로딩이 되었을 떄는 컴파일러가 디폴트 생성자를 만들지 않는다.
		
		for(int i=0; i<arr.length; i++) {
		arr[i] = mkStudent(); // 객체 생성 후 반환 하는 메소드
		
		}
		//System.out.println(Arrays.toString(arr));
		for(Student st : arr) {
			System.out.println(st);
		}
	}

	public static void test(String[] args) {
		// Student 타입의 참조변수 kim 새로운 값 4개를 생성하고 넣어준다.
		Student kim = new Student("김진섭","이탈리아어학과", 4.5, 10);
						//생성자	    // Student를 생성함! 
		Student lee = new Student("이순신", "전술과", 5.0, 1); // 각각 개체에 필드가 따로 생성된 것
		Student park = new Student("박혁거세", "창업과", 4.8, 1);
		
//		System.out.println(kim.toString());
//		System.out.println(lee);
//		System.out.println(park);
		
		// 배열을 만들 수 있다!
		Student[] stdArr = new Student[3];
		// student의 참조변수를 담았다! 아직 객체 없음!
		// 클래스를 담은게 아니라 참조변수를 3개 만든 것이다.
		// 2차원 배열처럼 생각하는 것이 좋다.
		stdArr[0] = kim;
		stdArr[1] = lee;
		stdArr[2] = park;
		
		stdArr[1].name = "이순자";
		stdArr[1].major = "가정학과";
		
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}
}