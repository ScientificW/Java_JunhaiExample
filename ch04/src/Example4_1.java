/*
reader.nextLine�����������һ������ת�����ַ���
toCharArray���ַ���ת��Ϊ�ַ�����
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
        System.out.println("����:"+secret);
        for(int i=0;i<a.length;i++){
           a[i]=(char)(a[i]^'w');
        }
        String code=new String(a);  
        System.out.println("ԭ��:"+code);
    }
}
