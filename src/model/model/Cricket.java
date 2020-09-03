package model;
//Ian Wetzler
public class Cricket {
private String species;
private String color;
private String size;

public Cricket() {
	
}
public Cricket(String species, String color, String size) {
	this.setSpecies(species);
	this.setColor(color);
	this.setSize(size);
	}

public String makeNoise() {
	return "Cricket";
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
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
}
