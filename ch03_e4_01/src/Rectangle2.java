//【例4.1】  接口与实现接口的类。

public class Rectangle2 implements PlaneGraphics2 //长方形类，覆盖平面图形接口
{
    protected double length;           //长度
    protected double width;            //宽度

    public Rectangle2(double length, double width)  //构造方法
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle2(double width)    //正方形是长方形的特例
    {
        this.length = width;
        this.width = width;
    }

    public Rectangle2()
    {
        this(0,0);
    }

    public Rectangle2(Rectangle2 r1)
    {
        this(r1.length, r1.width);
    }

    public double area()               //计算长方形面积，覆盖接口中的抽象方法
    {
        return this.width * this.length;
    }

    public double perimeter()          //计算长方形周长，覆盖接口中的抽象方法
    {
        return (this.width + this.length)*2;
    }

    public void print()
    {
        if (this.length==this.width)
            System.out.print("一个正方形，边长为 "+this.length);
        else
            System.out.print("一个长方形，长度为 "+this.length+"，宽度为 "+this.width);
        System.out.println("，面积为 "+this.area()+"，周长为 "+this.perimeter());
    }

    public static void main(String args[])
    {
        Rectangle2 r1 = new Rectangle2(10,20);
        r1.print();
        
        r1 = new Rectangle2(10);
        r1.print();
    }
}


/*

程序运行结果如下：

一个长方形，长度为 10.0，宽度为 20.0，面积为 200.0，周长为 60.0
一个正方形，边长为 10.0，面积为 100.0，周长为 40.0

*/

/*
程序错误：
1、一个类如果声明实现一个接口，则该类必须实现接口中的所有抽象方法，并且方法必须声明为public。

    double area()               //编译错，

area() in Rectangle2 cannot implement area() in PlaneGraphics2; attempting to assign weaker access privileges; was public

*/

