package org.comstudy21.ch05;

class TV2 {
	
	
	private int size;
	private String manufacturer;
	
	public TV2() {
		this.size = 32;
		this.manufacturer = "LG";
		System.out.println(size + "인치" + manufacturer);
		}
	public TV2(String manufacturer) {
		this.size = 32;
		this.manufacturer = "LG";
		System.out.println(this.size + "인치" + manufacturer);
		}
	public TV2(int size, String manufacturer) {
		this.size = 32;
		this.manufacturer = "LG";
		System.out.println(size + "인치" + manufacturer);
		}
	public TV2(String manufacturer) {
		this.size = 65;
		this.manufacturer = "LG";
		System.out.println(this.size+ "인치 "+manufacturer);
	}

}

