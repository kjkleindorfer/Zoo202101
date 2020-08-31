package model;

//added by Aleksander Brown

public class Platypus {
	private String name;
	private String size;
	private int age;

	public Platypus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Platypus(String name, String size, int age) {
		super();
		this.name = name;
		this.size = size;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return size;
	}

	public void setColor(String size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String makeNoise() {
		return "warble warble";
	}

}
