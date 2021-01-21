package org.comstudy21.ch03_2;

import java.util.Arrays;
import java.util.Scanner;

class Student {
	 String name;
	 String major;
	 double point;
	 int rank;
	 
	 public Student() {
		// 디폴트 생성자
		// System.out.println("디폴트 생성자 호출");
	}
	 
	 public Student(String name, String major, double point, int rank) {
		 
		this.name = name;
		this.major = major;
		this.point = point;
		this.rank = rank;
	}
	
	 @Override
	public String toString() {
		return "[" + name + ", " + major + ", " + point + ", " + rank + "]";
	}

	static Scanner scan = new Scanner(System.in);
	
	static final int MAX = 50;
	static Student[] stArr = new Student[MAX];
	static int top = 0;
	
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
		
		for(int i=0; i<arr.length; i++) {
		arr[i] = mkStudent(); // 객체 생성 후 반환 하는 메소드
		
		}
		for(Student st : arr) {
			System.out.println(st);
		}
	}

	public static void test(String[] args) {
		
		Student kim = new Student("김진섭","이탈리아어학과", 4.5, 10);
		Student lee = new Student("이순신", "전술과", 5.0, 1); 
		Student park = new Student("박혁거세", "창업과", 4.8, 1);
	
		Student[] stdArr = new Student[3];
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