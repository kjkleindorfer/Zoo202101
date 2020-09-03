package model;
/**
 * 
 * @author Jian Shi
 *
 */
public class Mosquito {
	private String name;
	private String size;
	private String kind;

	public Mosquito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mosquito(String name, String size, String kind) {
		super();
		this.name = name;
		this.size = size;
		this.kind = kind;
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String makeNoise() {
		return "Buzz Buzz";
	}
}
