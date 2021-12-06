package exceptions;
import java.util.HashSet;  
import java.util.Hashtable;  
import java.util.Set; 

public class _13 {

	    public static void main(String[] args) {  
	         Set exampleleSet = new HashSet();  
	         Hashtable exampleTable = new Hashtable();  
	         exampleleSet.iterator().next();                         //This throws NoSuchElementException  
	         exampleTable.elements().nextElement();      //as there are no elements in our Set  
	                                                                                //and HashTable but we are trying to access the    
	                                                                                          //elements.                               
	}  
	    /*
	     * Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1599)
	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1620)
	at Jala/exceptions._13.main(_13.java:14)

	     */
	  
	

}
