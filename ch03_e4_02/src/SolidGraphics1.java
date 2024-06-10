//【例4.2】  用接口实现多重继承。


public interface SolidGraphics1        //立体图形接口
{
    public abstract double volume();   //计算体积
}

class SolidGraphics1_ex
{
    public static void main(String args[])
    {
        SolidGraphics1 s1 = new Cuboid1(10);
        System.out.println("一个正方体体积为 "+s1.volume());

//        s1 = new Globe1(10);
//        System.out.println("一个球体积为 "+s1.volume());
    }
}


/*
程序运行结果如下：
一个正方体体积为 1000.0
一个球体积为 4188.790204786391
*/


/*
程序错误：

1、接口变量不能调用接口中没有声明的方法。例如，如果接口中没有声明print()方法，则

    s1.print();    //编译错，cannot find symbol : method print()
    
    
*/