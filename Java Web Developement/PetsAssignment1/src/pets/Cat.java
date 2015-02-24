package pets;
/**
 * A class ilustrating the concept of inheretance
 * @author Shahid
 *
 */
public class Cat extends Pets {
	private float hight;
	//Implementation of the Abstract method
@Override	public void speak(){
		System.out.println("Cat Meaooon");
	}
	//Class method
	public void sniff(){
		System.out.println("Sniffing");	
	}
	//Implementation of the Abstract method
@Override	public int numberOfLegs(int leg){
		return leg;
		
	}
	//No argument constractor
		public Cat(){
			this.setAge(12);
			this.setColor("black");
			this.setLegs(4);
			this.setHight(6);
		}
	//One argument constructor initializing Legs attribute of Class Cat
	public Cat(int legs){
		this.setLegs(legs);
	}
	
	//Four argument constractor initializing age,color,legs and hight of Class Cat
	public Cat(int age,String color,int legs,float hight){
		this.setAge(age);
		this.setColor(color);
		this.setLegs(legs);
		this.setHight(hight);
	}
	
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		this.hight = hight;
	}
}
