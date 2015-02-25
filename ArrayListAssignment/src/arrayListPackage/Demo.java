package arrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/**
 * Demonstration of bubble sort
 * @author Shahid
 *
 */
public class Demo {
 
	public static void main(String[] args) {
		BubbleSort bs=new BubbleSort();
		//Creating two arraylists by assigning 6 values to each
		ArrayList<Integer> myArray = new ArrayList<Integer>(Arrays.asList(45,6,89,38,1,9));
		ArrayList<Integer> myArray1 = new ArrayList<Integer>();
		//Creating an object of class BubbleSort
		System.out.println("Unsorted array is "+myArray);
	    bs.arraySort(myArray);
	    //Assigning sorted arraylist to second arraylist
	    myArray1=new ArrayList<Integer>(myArray);
	    System.out.println("Sorted array is "+myArray1);
}
}