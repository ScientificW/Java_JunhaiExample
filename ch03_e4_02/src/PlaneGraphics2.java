//【例4.1】  图形接口与实现图形接口的类。

public interface PlaneGraphics2        //平面图形接口，都是public
{
    public abstract double area();     //计算面积，都是public abstract 
    public abstract double perimeter();//计算周长
    public abstract void print();
}




class PlaneGraphics2_ex
{
    public static void main(String args[])
    {
        PlaneGraphics2 g1 = new Rectangle2(10,20);  //长方形
                      //接口是引用数据类型，接口变量能够获得实现接口的类的对象
        g1.print();                    //运行时多态性

        g1 = new Rectangle2(10);       //正方形
        g1.print();

        g1 = new Ellipse2(10,20);      //椭圆
        g1.print();

        g1 = new Ellipse2(10);         //圆
        g1.print();
    }
}

/*

程序运行结果如下：

一个长方形，长度为 10.0，宽度为 20.0，面积为 200.0，周长为 60.0
一个正方形，边长为 10.0，面积为 100.0，周长为 40.0
一个椭圆，a轴半径为 10.0，b轴半径为 20.0，面积为 628.3185307179587，周长为94.24777960769379
一个圆，半径为 10.0，面积为 314.1592653589793，周长为62.83185307179586

*/



/*

程序正确：
1、接口中可以声明常量。例如，
    public static final int WIDTH=0;   //宽度
    public static final int HEIGHT=1;  //高度
但不知这些常量如何使用？



程序错误：

1、接口中的成员变量都是常量，在声明时，必须赋初值。
    int count;                   //编译错，= expected    
    
   即使声明时为成员变量赋了初值，也是常量 
    int count=0;
   在实现接口的类中，不能为接口中和成员变量赋值。
   count++;                      //编译错，cannot assign a value to final variable count    
   
   this.count;                   //编译错, cannot assign a value to final variable count

2、接口中的方法都是公有的，不能声明私有等方法

    private double area();       //编译错，modifier private not allowed here
    protected double area();     //编译错，modifier protected not allowed here   
    

3、接口中的方法都是实例方法，不能声明类方法。例如，
    public static abstract double area();   //编译错，modifier static not allowed here

4、接口变量不能调用接口中没有声明的方法。例如，如果接口中没有声明print()方法，则

    p1.print();    //编译错，cannot find symbol : method print()


private interface PlaneGraphics2        //编译错，modifier private not allowed here
protected interface PlaneGraphics2        //编译错，modifier protected not allowed here


*/

