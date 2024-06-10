import java.util.Hashtable;

public class J_Test1{
	public static void main(String[] args) {
	    Hashtable h = new Hashtable();
	    h.put(new Integer(0), "value");
	    String s = (String)h.get(new Integer(0));
	    System.out.println(s);
	}
}
