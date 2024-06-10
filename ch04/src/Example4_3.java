/*
Êä³ö½á¹û£º
ab23456789
ab**23456789
ab**236789
*/
public class Example4_3{
    public static void main(String args[ ]){
        StringBuffer str=new StringBuffer("0123456789");
        str.setCharAt(0 ,'a'); 
        str.setCharAt(1 ,'b');
        System.out.println(str); 
        str.insert(2, "**");
        System.out.println(str);
        str.delete(6,8);
        System.out.println(str);
    }
}
