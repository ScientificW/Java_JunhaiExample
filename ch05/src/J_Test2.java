//Hashtable<K, V> = new Hashtable<K, V>();
import java.util.Hashtable;

public class J_Test2 {
	public static void main(String[] args) {
	    Hashtable<Integer,String> h = new Hashtable<Integer,String>();
	    h.put(new Integer(0), "value");
	    String s = h.get(new Integer(0));
	    System.out.println(s);
	}
}
