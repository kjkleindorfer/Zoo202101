package model;

public class Horse {
	private String name;
	private int weight;
	private boolean isRaceHorse;
	
	public Horse() {
		super();
	}
	public Horse(String name, int weight, boolean isRaceHorse) {
		super();
		this.name = name;
		this.weight = weight;
		this.isRaceHorse = isRaceHorse;
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
	public boolean isRaceHorse() {
		return isRaceHorse;
	}
	public void setRaceHorse(boolean isRaceHorse) {
		this.isRaceHorse = isRaceHorse;
	}
	public String makeNoise() {
		return "Neigh";
	}

}
