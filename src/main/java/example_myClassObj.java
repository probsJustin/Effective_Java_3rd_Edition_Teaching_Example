
public class example_myClassObj {

	// there a set of methods that are common to all objects and should be taken into account when writing your own obj/classes 
	// these are general and need to be used in accordance with the book/documentation and are not representative of what is needed and are to be used only as reference material 
	
	// EQUALS
	// when is it appropriate to override equals? It is when a class has a notion
	// of logical equality that differs from mere object identity and a superclass has not
	// already overridden equals.
	
	Boolean equals() {
		Boolean returnObject = false; 
		return returnObject;
	}
	public int hashCode() {
		int returnObject = 10; 
		return returnObject; 
	}
	// Always override toString
	public String toString() {
		String returnObject = ""; 
		return returnObject;
		
	}
	 // Item 13: Override clone judiciously Page 80
	protected example_myClassObj clone() {
		example_myClassObj instance_example_myClassObj = new example_myClassObj(); 
		return instance_example_myClassObj;	
	}
	// Item 14: Consider implementing Comparable Page 89
	public interface Comparable<T> {
		int compareTo(T t);
	}
}
