package model;

public class Donkey {
	private String name;
	private String gender;
	private int age;
	
	public Donkey() {
		super();
	}
	
	public Donkey(String pName, String pGender, int pAge) {
		this.name = pName;
		this.gender = pGender;
		this.age = pAge;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String makeNoise() {
		return "Hee-Haw";
	}
}
