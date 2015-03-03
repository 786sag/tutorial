package informationSystem;

/**
 * 
 * @author Shahid
 *
 */
public class demo {

	public static void main(String[] args) {
		User shahid=new User();
		User father = new User();
		User mother = new User();
		User ali=new User();
		
		//setting shahid's properties
			shahid.setfName("Shahid");
			shahid.setmName("Ahmad");
			shahid.setlName("Ghumman");
			shahid.setAddress("Sialkot,51301,street no 9,Pakistan");
			shahid.setAge(30);
			shahid.setPhone("+ 92-3218798798");
			shahid.setGender("Male");
			//setting Father's properties
			father.setfName("Noor");
			father.setmName("Ahmad");
			father.setlName("Ghumman");
			father.setAddress("Sialkot,51301,street no 9,Pakistan");
			father.setAge(60);
			father.setPhone("+923275847584");
			father.setGender("Male");
			//setting Mother's properties
			mother.setfName("Ayesha");
			mother.setmName("Noor");
			mother.setlName("Ahmad");
			mother.setAddress("Sialkot,51301,street no 9,Pakistan");
			mother.setAge(55);
			mother.setPhone("+923275847667");
			mother.setGender("Female");
			//Putting key and value in the map for father
			father.getRelatives().put("son", shahid);			
			shahid.getRelatives().put("father", father);			
			father = shahid.getRelatives().get("father");
			father.getRelatives().get("son");
			
			//Putting key and value in the map for Ali(second son)
			father.getRelatives().put("son", ali);
			ali.getRelatives().put("father", father);
			father=shahid.getRelatives().get("father");
			father.getRelatives().get("son");
			
			
			//Putting key and value in the map for mother
		    mother.getRelatives().put("son", shahid);
		    shahid.getRelatives().put("Mother", mother);
		    mother=shahid.getRelatives().get("mother");
		    //mother.getRelatives().get("son");
			
	
			//Getting the First son's father's first name and mother's first name
		   System.out.println("First son's name is "+shahid.getfName());
		   System.out.println("Shahid's father's first name is "+shahid.getRelatives().get("father").getfName());
		   System.out.println("Second sons's name is "+ali.getfName());
		   System.out.println("Ali's father's first name is "+shahid.getRelatives().get("father").getfName());
		   System.out.println("Father's second son's name is  "+father.getRelatives().get("son").getfName());
	}
	

}
