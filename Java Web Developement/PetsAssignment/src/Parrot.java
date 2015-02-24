/**
 *Class Parrot implements interface Pets 
 * @author Shahid
 *
 */
public class Parrot implements Pets{
	
	/**
	 * implementation of abstract method of interface Pets
	 */
@Override	public void speak(){
		System.out.println("Parrot speaks Chichichi");
	}
	/**
	 * Method of class Parrot
	 */
	public void canFly(){
		System.out.println("Parrots can fly very low");
		}
	/**
	 * Method of class Parrot
	 */
	public void eatFood(){
		System.out.println("Parrots eat special food");
	}
}
