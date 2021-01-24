package org.comstudy21.StudentManagerNew;

import java.util.ArrayList;

import org.comstudy21.ch03_2.Student;

public class DB2 {
	
	 public DB2(String name2, String major2, double point2, int rank2) {
		// TODO Auto-generated constructor stub
	}

	String name;
	 String major;
	 double point;
	 int rank;
	
	 class Member {public Member(java.lang.String string2, java.lang.String string3, int i, int j) {
			
		}

	 
	public void main(String[] args) {
		ArrayList<DB2> members = new ArrayList<DB2>();
		DB2 student = new DB2(name, major, point, rank);
		members.add(student);
		members.add(new Member("김진섭","이탈리아어",15,1));
	}

}
}