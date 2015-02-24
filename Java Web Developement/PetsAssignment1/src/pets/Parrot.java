package pets;
/**
 * A class ilustrating the concept of inheretance
 * @author Shahid
 *
 */
public class Parrot extends Pets{
	
	private String speed;
	
	
	
	//Implementation of the Abstract method
	
@Override	public void speak(){
		System.out.println("Parrots Choonchoon");
	}
	//Class Method
	public void fly(){
		System.out.println("Flying");	
	}
	//Implementation of the Abstract method
@Override	public int numberOfLegs(int leg){
		return leg;
		
	}
	//One argument constractor initializing speed attribute of class Parrot
	public Parrot(String  speed){
		setSpeed(speed);
	}
	//No argument constructor initializing age,color,legs and speed of Class Parrot
	public Parrot(){
		this.setAge(10);
		this.setColor("white+pink");
		this.setLegs(5);
		this.setSpeed("Fast");
	//Four argument constructor initializing age,color,legs and speed of Class Parrot	
	}
	public Parrot(int age,String color,int legs,String speed){
		this.setAge(age);
		this.setColor(color);
		this.setLegs(legs);
		this.setSpeed("speed");
		
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}

}
