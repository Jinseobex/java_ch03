package org.comstudy21.ch05;

import java.util.Scanner;

class Grade {
	
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		}

	public double average(int math, int science, int english) {
		double total = (math+science+english)/3;
		return total;
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력: ");
	
	int math = scan.nextInt();
	int science = scan.nextInt();
	int english = scan.nextInt();
	
	Grade me = new Grade(math, science, english);
	System.out.println("평균: " + me.average(math, science, english)); // average()는 평균을 계산하여 리턴
	
	scan.close();
}
}