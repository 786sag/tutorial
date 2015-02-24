package pets;

/**
 * Ilustrating the behaviours of different class's objects
 * 
 * @author Shahid
 *
 */

public class Demo {

	public static void main(String[] args) {

		/**
		 * checking objects behavioir
		 * 
		 * @param args
		 */

		// making object of Dog with Pets class reference
		Pets p1 = new Dog();
		// Displaying abstract method of class Dog
		p1.speak();
		// Accessing Dog class abstract Method
		System.out.println("Dog have legs--> "+p1.numberOfLegs(0));
		// Accessing attribute of Dog class
		System.out.println("Breed of dog is--> "+((Dog)p1).getBreed());

		// making object of Cat with Pets class reference
		p1 = new Cat();
		// Displaying abstract method of class Cat
		p1.speak();
		// Displaying abstract method of class Cat
		System.out.println("Cat have legs--> "+p1.numberOfLegs(12));
		// Accessing attribute of Cat class
		System.out.println("Hight of Cat is --> "+((Cat)p1).getHight());

		// making object of Dog with Pets class reference
		p1= new Parrot();		
		// Displaying abstract method of class Parrot
		p1.speak();
		// Displaying abstract method of class Parrot
		System.out.println("Parrot have legs--> "+p1.numberOfLegs(1));
		// Accessing attribute of Parrot class
		System.out.println("Speed of Parrot is --> "+((Parrot)p1).getSpeed());

	}

}
