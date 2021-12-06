package collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m = new HashMap<Integer, String>();
		for(int i=1;i<=15;i++) {
			m.put((i), ("Student"+i));
		}
		m.put(16, "Pavan");//Insert a Key value mapping into the map
		System.out.println("the value of key 5 is: "+m.get(5));//Fetch the value of a Key
		Object newclone = m.clone();//Create a clone/copy of HashMap
		System.out.println(newclone);
		System.out.println("the given is present: "+m.containsKey(16));//Check if the given Key is in the Map
		System.out.println("the given values is present :"+m.containsValue("Pavan"));//Check if the value is in the Map
		System.out.println("Is the man empty : "+m.isEmpty());//Check if the map is empty
		System.out.println("The size of the map is :"+m.size());//Check if the map is empty
		Object keyset = m.keySet();//Print all the Keys of the map to the console
		System.out.println("the key set is: ");
		System.out.println(keyset);
		Object valuesset = m.values();//Print all the Values of the map to the console
		System.out.println("the values set is: ");
		System.out.println(valuesset);
		m.remove(5, "Student5");//Remove a specific Key-value pair
		System.out.println(m);
		HashMap<Integer,String> newm = new HashMap<Integer, String>();
		newm=(HashMap<Integer, String>) m.clone();//Copy all the elements of the Map to another Map
		System.out.println(newm);
		

	}

}
