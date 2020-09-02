package model;

// Added by Hillary Murphy
public class Goose {

	private String name;
	private String size;
	private String territory;

	public Goose() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goose(String name, String size, String territory) {
		super();
		this.name = name;
		this.size = size;
		this.territory = territory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String makeNoise() {
		return "Honk Honk";
	}

}
