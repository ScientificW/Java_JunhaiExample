
public class MyClass
{
  static String s1 = "I am unique!";
	public static void main(String args[])
	{
		String s2 = "I am unique!";
		String s3 = new String(s1);
		String s4 = new String(s2);
		String s5 = new String(s2);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
	}
} 
