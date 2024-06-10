/*
reader.nextLine将键盘输入的一行内容转换成字符串
toCharArray将字符串转换为字符数组
*/
import java.util.Scanner;
public class Example4_1{
    public static void main(String args[ ]){
        Scanner reader=new Scanner(System.in);
        String s=reader.nextLine();
        char a[]=s.toCharArray();	 
        for(int i=0;i<a.length;i++){
           a[i]=(char)(a[i]^'w');	 
        }
        String secret=new String(a); 
        System.out.println("密文:"+secret);
        for(int i=0;i<a.length;i++){
           a[i]=(char)(a[i]^'w');
        }
        String code=new String(a);  
        System.out.println("原文:"+code);
    }
}
