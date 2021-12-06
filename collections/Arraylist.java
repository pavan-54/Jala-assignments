package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			arraylist.add("Pavan"+i);
		}
		arraylist.add("Pavan10");//Add an element to the ArrayList
		Iterator<String> iterator = arraylist.iterator();//Iterate through the ArrayList by using Iterator object
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		arraylist.add(5, "newly_adedd");//Add an element at a specific index

		arraylist.remove(5);//Remove an element from the ArrayList, Remove at an index
		arraylist.set(5, "new updated");//Update the element at a specific index
		try {
//		arraylist.get(16);/Update the element at a specific index
		System.out.println("element is present");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("the element is not there");
		}
		
		System.out.println(arraylist.get(5));//Get an element at a particular index
		System.out.println("the size is: "+arraylist.size());//Find out the size of the ArrayList
		System.out.println("The list has this element: "+arraylist.contains("Pavan0"));//Check the given element is present in the ArrayList

		arraylist.clear();//Remove all elements of the ArrayList

		System.out.println(arraylist);
		//System.out.println(arraylist);
		
		
	}

}
