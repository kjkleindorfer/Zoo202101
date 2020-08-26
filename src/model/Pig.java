package model;

//Added by Noah Hoss

public class Pig {
	private String name;
	private int weight;
	private int spots;
	
	public Pig() {
		super();
	}
	
	public Pig(String name, int weight, int spots) {
		super();
		this.name = name;
		this.weight = weight;
		this.spots = spots;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSpots() {
		return spots;
	}

	public void setFins(int spots) {
		this.spots = spots;
	}
	
	public String makeNoise() {
		return "Oinkk!";
	}
}
