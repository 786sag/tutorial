package pets;
/**
 * A class ilustrating the concept of inheretance
 * @author Shahid
 *
 */
public class Dog extends Pets{
	
	private String breed;
	//Implementation of the Abstract method
@Override	public void speak(){
		System.out.println("Dog Woof");
	}
	//Class method
	public void run(){
		System.out.println("Running");	
	}
	//Implementation of the Abstract method
@Override
	public int numberOfLegs(int leg){
		return leg;
	}
	//No argument constractor
	public Dog(){
		this.setAge(12);
		this.setColor("black");
		this.setLegs(4);
		this.setBreed("Booli");
	}
	
	/**
	 * One argument constractor initializing Dog class age attribute
	 * @param age of the Dog
	 */
	public Dog(int age){
		this.setAge(age);
		
	}
	//Four argument constractor initializing Dog class attributes
	public Dog(int age,String color,int legs,String breed){
		this.setAge(age);
		this.setColor(color);
		this.setLegs(legs);
		this.setBreed(breed);
		
		
	}
	//get the  breed
	public String getBreed() {
		return breed;
	}
	//set the breed
	public void setBreed(String breed) {
		this.breed = breed;
	}
	

}
