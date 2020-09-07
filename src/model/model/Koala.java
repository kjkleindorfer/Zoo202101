package model;
	//Ruth McGee
	
	public class Koala {
		private String name;
		private boolean isCuddly;
		private int age;
		
		public Koala() {
			super();
		}

		public Koala(String name, boolean isCuddly, int age) {
			super();
			this.name = name;
			this.isCuddly = false;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isCuddly() {
			return isCuddly;
		}

		public void isCuddly(boolean isCuddly) {
			this.isCuddly = isCuddly;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String makeNoise() {
			return "Purrr";
		}

	}

