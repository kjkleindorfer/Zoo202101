package model;

// Added by Nikki McCloud
public class Guinea_Pig {

		private String name;
		private String species;
		private int age;

		public Guinea_Pig() {
			super();
		}

		public Guinea_Pig(String name, String species, int age) {
			super();
			this.name = name;
			this.species = species;
			this.age = age;

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

		public int getAge() {
			return this.age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String makeNoise() {
				return "Squeak!";
		}
}
