import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.makeNoise());
		
		Dog sparky = new Dog();
		System.out.println(sparky.makeNoise());
		
		Fish goldy = new Fish();
		System.out.println(goldy.makeNoise());
		
		Pig bacon = new Pig();
		System.out.println(bacon.makeNoise());

		Cow beef = new Cow();
		System.out.println(beef.makeNoise());
		
		Bird roadRunner = new Bird();
		System.out.println(roadRunner.makeNoise());
		
		Goose snow = new Goose();
		System.out.println(snow.makeNoise());
		
		Horse jack = new Horse();
		System.out.println(jack.makeNoise());
		
		Dragon reptar = new Dragon();
		System.out.println(reptar.makeNoise());
	}

}
