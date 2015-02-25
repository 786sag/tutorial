package arrayListPackage;

import java.util.ArrayList;
/**
 * Defining method arraySort
 * @author Shahid
 *
 */
public class BubbleSort {
	/**
	 * Class method doing bubble sort
	 * Taking an arraylist as argument
	 * @param array
	 * 
	 */
	public void arraySort(ArrayList<Integer> array) {
	   
    for(int i = array.size()-1; i >= 0; i--) {
        for(int j = 0; j < i; j++) {
            if(array.get(j) > array.get(j + 1)) {
                int temp = array.get(j);
                array.set(j, array.get(j + 1));
                array.set(j + 1, temp);
            }
        }
    
    }
    }
}
