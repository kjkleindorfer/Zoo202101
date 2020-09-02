package model;
// New class by Paul Thairu
// Monkey class
public class Monkey {
	
	private String name;
	private String species;
	private String color;
	
	public Monkey() {
		super();
	}
	
	public Monkey(String name, String species, String color) {
		super();
		this.name = name;
		this.species = species;
		this.color = color;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String makeNoise() {
		return "chatter chatter or screech screech";
	}

}
