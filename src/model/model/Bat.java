/******* Added By ***************
 * author: 	Ben Miner
 * course:	CIS 171 Java II
 * date:	July 2020
 * file:	Bat class
 ********************************/
package model;


public class Bat {
	private String name;
	private String species;
	private String region;
	public Bat() {
		super();
	}
	public Bat(String name, String species, String region) {
		super();
		this.name = name;
		this.species = species;
		this.region = region;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String makeNoise() {
		return "squeak";
	}
}
