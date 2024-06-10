//【例4.2】  长方体类继承长方形类并实现立体图形接口。

public class Cuboid1 extends Rectangle2 implements SolidGraphics1  //长方体类
{
    protected double height;           //高度

    public Cuboid1(double length, double width, double height)     //构造方法
    {                                  
        super(length, width);
        this.height = height;
    }

    public Cuboid1(Rectangle2 r1, double height)
    {
        this(r1.length, r1.width, height);
    }

    public Cuboid1(double width)
    {
        this(width, width, width);
    }

    public Cuboid1()
    {
        this(0,0,0);
    }

    public double area()               //计算长方体的表面积，覆盖父类方法
    {
        return super.perimeter() * this.height;
    }

    public double perimeter()          //虽然不需要计算周长，但需要覆盖父类方法，否则产生逻辑错误
    {    
        return 0;
    }

    public double volume()             //计算长方体的体积，覆盖接口中的抽象方法
    {
        return super.area() * this.height;
    }

    public void print()                //显示，覆盖父类方法
    {
        System.out.print("一个长方体，长度为 "+this.length+"，宽度为 "+this.width+"，高度为 "+this.height);
//        System.out.print("，周长为 "+this.perimeter());
        System.out.println("，表面积为 "+this.area()+"，体积为 "+this.volume());
    }

    public static void main(String args[])
    {
        Cuboid1 c1 = new Cuboid1(10,20,30);
        c1.print();
    }
}

/*

程序运行结果如下：

一个长方体，长度为 10.0，宽度为 20.0，高度为30.0，表面积为 1800.0，体积为6000.0

*/




/*

程序错误：

1、本类必须覆盖方法area()，计算长方体的表面积。如果没有覆盖area()方法，程序仍然可运行，但计算的是长方形面积，而不是长方体的表面积。运行结果如下：

一个长方体，长度为 10.0，宽度为 20.0，高度为30.0，表面积为 200.0，体积为6000.0


    public final double perimeter()    //计算长方形周长，实现接口中的抽象方法，最终方法
    {
        return (this.width + this.length)*2;
    }



    public double area()               //计算长方体的表面积，覆盖父类方法
    {
        return this.perimeter() * this.height;
    }

2、Java的多重继承机制在语法上也存在二义性。如果

public interface SolidGraphics1        //立体图形接口
{
//    double length=0.0;           //长度

    public double area(int i);               //计算长方形面积，覆盖接口中的抽象方法
    public abstract double volume();   //计算体积
}

编译时能够检查出成员变量的二义性，例如，下列语句出错：
        System.out.print("一个长方体，长度为 "+this.length+"，宽度为 "+this.width+"，高度为 "+this.height);

成员方法的二义性对程序运行没有影响。
//reference to length is ambiguous, both variable length in Rectangle2 and variable length in SolidGraphics1 match



*/
