package model;
	//Alex Ryberg
	
	public class Tiger {
		private String name;
		private boolean isKing;
		private int age;
		
		public Tiger() {
			super();
		}

		public Tiger(String name, boolean isKing, int age) {
			super();
			this.name = name;
			this.isKing = false;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isKing() {
			return isKing;
		}

		public void isKing(boolean isKing) {
			this.isKing = isKing;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String makeNoise() {
			return "Roar";
		}

	}

