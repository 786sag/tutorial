/**
 * class to run Pets
 * @author Shahid
 *
 */
public class RunPets {
/**
 * checking objects behavioir
 * @param args
 */
	public static void main(String[] args) {
		Pets p1 = new Cat();//
		p1.speak();
		
		p1 = new Dog();
		p1.speak();
		
		p1 = new Parrot();
		p1.speak();
		
		p1 = new AustralianParrot();
		p1.speak();
		
		p1 = new PakistaniParrot();
		p1.speak();
		
		p1 = new AustralianParrot();
		((Parrot) p1).eatFood();
		
		p1 = new PakistaniParrot();
		((Parrot) p1).canFly();

	}

}
