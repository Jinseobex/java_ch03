package org.comstudy21.ch05;

class Song {
	
	static String title;
	static String artist;
	static int year;
	static String country;
	
	public Song(String title, String artist, int year, String country) {
		this.title = "Dancing Queen";
		this.artist = "ABBA";
		this.year = 1978;
		this.country = "스웨덴";
	}

	public static void show(String title, String artist, int year, String country) {
		
		System.out.println(year+"년 "+country+" 국적의 "+artist+"가 부른 "+title);
		return;
	}

	public static void main(String[] args) {
		Song song = new Song(title, artist, year, country);
		show(title, artist, year, country);
	}
}