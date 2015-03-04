package informationSystem;

/**
 * 
 * @author Shahid
 *
 */
public class demo {

	public static void main(String[] args) {
		final User shahid=new User();
		User father = new User();		
		User ali=new User();
		User ahmad=new User();
		
		//setting shahid's properties
			shahid.setUserInformation("shahid", "ahmad", "ghumman", "Sialkot,51301,street no 9,Pakistan", "+ 92-3218798798", 1, 30,"Male" );
			
		//setting Father's properties
			father.setUserInformation("noor", "ahmad", "ghumman", "Sialkot,51301,street no 9,Pakistan", "+ 92-3218798333", 2, 50,"Male" );
			
		//setting shahid's properties
			shahid.setUserInformation("ahmad", "shah", "ghumman", "Sialkot,51301,street no 9,Pakistan", "+ 92-3218722223", 1, 9,"Male" );
		//Methid to find father name with shahid object
			shahid.getFatherName(father, shahid);
			
		//Method to find father name with ali object			
			ali.getFatherName(father, ali);			
		    
		//grandfather query
		    ali.getRelatives().put("son", ahmad);
		    ahmad.getRelatives().put("father", ali);
		  
		//System.out.println("ahmed grand father === "+ahmad.getRelatives().get("father").getRelatives().get("father").getfName());
		    
			
	
		    System.out.println("Shahid's father's first name is "+shahid.getRelatives().get("father").getfName());
		    System.out.println("Ali's father's first name is "+shahid.getRelatives().get("father").getfName());
	}
	

}
