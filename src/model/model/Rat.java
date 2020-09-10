package model;

//Added by Trong Dinh

public class Rat {
	private String name;
	private String color;
	private int weight;
	
	public Rat() {
		super();
	}
	
	public Rat(String name, String color, int weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String makeNoise() {
		return "Squeak";
	}
}
