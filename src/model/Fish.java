package model;

//Added by AJ Serck

public class Fish {
	private String name;
	private String species;
	private int fins;
	
	public Fish() {
		super();		
	}
	
	public Fish(String name, String species, int fins) {
		super();
		this.name = name;
		this.species = species;
		this.fins = fins;
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

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}
	
	public String makeNoise() {
		return "blubb";
	}
	
}
