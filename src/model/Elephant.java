package model;


//Added by John Ryan

public class Elephant {
	private String name;
	private int age;
	private int weight;
	
	public Elephant() {
		super();
	}
	
	public Elephant(String n, int a, int w) {
		super();
		setName(n);
		setAge(a);
		setWeight(w);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public Integer getWeight() {
		return this.weight;
	}
	
	public void setWeight(int w) {
		this.weight = w;
	}
	
	public String makeNoise() {
		return "Arooooh!";
	}
}