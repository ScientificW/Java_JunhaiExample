/*main�����е�args������Ϊ�����в���
ָ����ʱ�����ļ���������Ķ���ַ�����
������args[]�����У��Կո���Ϊ�ָ�����
parseDouble�ǽ�����ת��Ϊ˫���ȸ�����
*/
public class Example4_2{
    public static void main(String args[ ]){
        double n,sum=0.0 ;
        for(int i=0;i<args.length;i++){
           sum=sum+Double.parseDouble(args[i]);
        }
        n=sum/args.length;
        System.out.println("ƽ����:"+n);
    }
}
