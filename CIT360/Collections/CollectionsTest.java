//Imports
import java.io.*;
import java.util.*;

class CollectionsTest {

	public static void main (String[] args) {
		
		//Create int array
		int arr[] = new int[] {1, 2, 3, 4};
		
		//Creates a vector
        Vector<Integer> v = new Vector();
        
        //Creates a hashtable
        Hashtable<Integer, String> h = new Hashtable();
        
        v.addElement(1);
        v.addElement(2);
        h.put(1,"students");
        h.put(2,"studentz");
		
		//Prints out results
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}