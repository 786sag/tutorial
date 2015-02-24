/**
 * 
 */
package pets;
/**
 * A Class ilustrating the concept of Abstract Class
 * @author Shahid
 *
 */
public abstract class Pets {
	private int age;
	private String color;
	private int legs;
	
	/**
	 * Abstact method of the class
	 */
public abstract  void speak();
//Abstract method for the class
public abstract int numberOfLegs(int l);

public void sleep(){
	System.out.println("Sleeping");	
}
//Getting the value for age
public int getAge() {
	return age;
}
//Setting the value for age
public void setAge(int age) {
	this.age = age;
}
//getting color for pets attribute color
public String getColor() {
	return color;
}
//setting color for Pets attribute color
public void setColor(String color) {
	this.color = color;
}
//Getting legs for Pets attributr Legs
public int getLegs() {
	return legs;
}
//Setting legs for Pets attribute Legs
public void setLegs(int legs) {
	this.legs = legs;
}
}
