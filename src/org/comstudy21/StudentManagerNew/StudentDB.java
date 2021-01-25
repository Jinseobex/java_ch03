package org.comstudy21.StudentManagerNew;

import java.util.ArrayList;
import java.util.Scanner;

import org.comstudy21.ch03_2.Student;

public class StudentDB {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		String  name;
		String  major;
		double grade;
		int rank;
		
		ArrayList list = new ArrayList();
		
			System.out.print("성명: ");
			name = scan.next();
			System.out.print("학과: ");
			major = scan.next();
			System.out.print("성적: ");
			grade = scan.nextDouble();
			System.out.print("등수: ");
			rank = scan.nextInt();
		
			list.add(name);
			list.add(major);
			list.add(grade);
			list.add(rank);
			
			System.out.println(list);
			System.out.println(list,1);
	
	}

}
