package model;

//added by Eli Lueders

public class Llama {
	private String name;
	private String color;
	private boolean readyToSheer;

	public Llama() {
		super();
	}

	public Llama(String name, String color, boolean readyToSheer) {
		super();
		this.name = name;
		this.color = color;
		this.readyToSheer = readyToSheer;
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

	public boolean getReadyToSheer() {
		return readyToSheer;
	}

	public void setReadyToSheer(boolean readyToSheer) {
		this.readyToSheer = readyToSheer;
	}

	public String makeNoise() {
		return "Hmm hmm";
	}

}
