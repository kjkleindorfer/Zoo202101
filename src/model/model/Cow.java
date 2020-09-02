package model;

//added by Harsha Malhotra

public class Cow {
	private String name;
	private String color;
	private String breed;

	public Cow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cow(String name, String color, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
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

	public String getBreed() { return breed;}

	public void setBreed(String breed) { this.breed = breed; }

	public String makeNoise() {	return "Moo"; }

}
