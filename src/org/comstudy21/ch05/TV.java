package org.comstudy21.ch05;

class TV {

	String manu;
	int year;
	int size;
	
	public TV(String manu, int year, int size) {
		this.year = 2017;
		this.size = 32;
		this.manu = "LG";
	}
	public void show() {
		System.out.println(this.manu+"에서 만든 "+this.year+"년형 "+this.size+"인치 TV");
	}

	public static void main(String[] args) {
		TV myTV = new TV ("LG", 2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();
	}
}
