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
		ArrayList listCopy = new ArrayList(myArray);
	    bs.arraySort(listCopy);
	    //Assigning sorted arraylist to second arraylist
	    myArray1=new ArrayList<Integer>(listCopy);
	    System.out.println("Sorted array is "+myArray1);
	    System.out.println("just to show no modification in original array "+myArray);
}
}