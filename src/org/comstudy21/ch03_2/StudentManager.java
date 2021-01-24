package org.comstudy21.ch03_2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	   static Scanner scan = new Scanner(System.in);
	   
	   static final int MAX = 50; // 50
	   static Student[] stArr = new Student[MAX];
	   static int top = 0;
	   
	   static Student mkStudent() {
	      Student student = new Student();
	      System.out.print("성명>>> ");
	      student.name = scan.next();
	      System.out.print("학과>>> ");
	      student.major = scan.next();
	      System.out.print("성적>>> ");
	      student.point = scan.nextDouble();
	      System.out.print("등수>>> ");
	      student.rank = scan.nextInt();
	      return student;
	   }
	
	static int menu() {
		int no = 0;
		System.out.println("1. input 2. output 3. search 4. modify 5. delete 6. end");
		System.out.println("Choice: ");
	
			try {
				no = scan.nextInt();
			} catch (Exception e) {
				System.out.println("정수만 입력 가능합니다.");
				scan.next(); // 버퍼를 비워준다
				menu(); // 재귀호출
			}

		return no;
	}	
	
	static void input() {
		System.out.println("::: INPUT :::");
		// stArr 배열의 top번지에 객체를 생성하고 top을 증가한다.
		if(top>=MAX) {
			System.out.println("더 이상 입력 할 수 없습니다.");
			return;
		}
		stArr[top++] = mkStudent();
		System.out.println("입력 성공!");
	}
	
	static void output() {
		System.out.println("::: OUTPUT :::");
		for(int i=0; i<top; i++) {
			System.out.println(stArr[i]);
		}
	}
	
	static void search() {
		System.out.println("::: SEARCH :::");
		System.out.println("찾으실 학생의 이름을 입력해주세요: ");
		
		String findName = scan.next();	
		
		for(int i=0; i<top; i++) {
			if(findName.equals(stArr[i].name)) {
				System.out.println("검색하신 학생의 정보: "+stArr[i]);
				return;
				}
			}
			System.out.println("목록에 없는 이름 입니다. 다시 입력해주세요.");
			return;
		}
	
	static void modify() {
		System.out.println("::: MODIFY :::");
		System.out.println("수정하실 학생의 이름을 입력해주세요: ");
		String findName = scan.next();
	
		for(int i=0; i<top; i++) {
			if(findName.equals(stArr[i].name)) {
				System.out.println("검색하신 학생의 정보: "+stArr[i]);
				System.out.println("수정하실 학생의 정보를 입력해주세요: 1.이름 2.학과 3.성적 4.등수");	
				
				int select = scan.nextInt();
				
//				String name = scan.next();
//				String major = scan.next();
//				Double point = scan.nextDouble();
//				int rank = scan.nextInt();
				
				switch(select) {
				
				case 1 :
					System.out.println(1);
				modiname(i);
				case 2 :
				
				case 3 :
				
				case 4 :
				 
					break;
				
				default :
					System.out.println("잘못 입력하셨습니다. 1~4사이의 정수를 입력해주세요.");
				
				
			}	
		}
		
			System.out.println("목록에 없는 이름 입니다. 다시 입력해주세요.");
			return;
	}
	}
	static void modiname(int inserNum) {
	
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(stArr[inserNum].name);
		
		System.out.println("바꾸실 학생의 이름을 입력해주세요: ");
		String name = scan.next();
		st.remove(inserNum);
		st.add(inserNum, name);
		System.out.println("학생의 이름이 "+name+"으로 변경 되었습니다.");
		System.out.println("변경된 학생의 정보: "+st);
//		System.out.println("변경된 학생의 정보: "+stArr[inserNum]);
		
	}

	static void delete() {
		System.out.println("::: DELETE :::");
	}
	
	static void end() {
		System.out.println("::: END :::");
		System.out.println("수고하셨습니다. \n프로그램을 종료합니다.");
		System.exit(0); // 강제종료
	}
	
	public static void main(String[] args) {
	
		while(true) {
		
		int no = menu();
		switch(no) {
		case 1 : input(); break;  // 배열을 만들어서 배열에 데이터를 넣을 수 있도록
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : end(); break;
		default : System.out.println("오류: 해당사항은 없습니다.");
		}
		System.out.println("-----------------------------");
		}
	}

}
