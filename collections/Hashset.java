package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hash = new HashSet();
		hash.add(1);
		hash.add(2);
		Object object = hash.clone();
		System.out.println(object);
		System.out.println(hash.contains(3));
		System.out.println(hash.isEmpty());
		System.out.println("the size is : "+hash.size());
		Iterator iterator = hash.iterator();
		while (iterator.hasNext()) {
			Object object2 = (Object) iterator.next();
			System.out.println(object2);
			
		}
		hash.remove(1);
		hash.clear();
		ArrayList list = new ArrayList();
		hash.addAll(list);
		hash.containsAll(list);
		hash.removeAll(list);
		/*
		 * and so on methods
		 */
	}

}
 