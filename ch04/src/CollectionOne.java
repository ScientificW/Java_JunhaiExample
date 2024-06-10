import java.util.Vector;

public class CollectionOne {
	/**
	 * @param args
	 */
	CollectionOne(){
		Vector<String> vec = new Vector<String> ();
//		Vector vec = new Vector();
		vec.add(String.valueOf(1));
		vec.add("one");
		vec.add("two");
		vec.add("three");
		String str = (String)vec.get(2);
		System.out.println("The index of 2: " + str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CollectionOne();
	}
}
