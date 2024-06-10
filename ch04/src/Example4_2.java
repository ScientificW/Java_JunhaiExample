/*main方法中的args参数称为命令行参数
指运行时跟在文件名后输入的多个字符串，
保存在args[]数组中，以空格作为分隔符。
parseDouble是将参数转换为双精度浮点数
*/
public class Example4_2{
    public static void main(String args[ ]){
        double n,sum=0.0 ;
        for(int i=0;i<args.length;i++){
           sum=sum+Double.parseDouble(args[i]);
        }
        n=sum/args.length;
        System.out.println("平均数:"+n);
    }
}
