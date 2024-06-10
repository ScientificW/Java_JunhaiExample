//【例4.1】  接口与实现接口的类。

public class Ellipse2 implements PlaneGraphics2 //椭圆类，覆盖平面图形接口
{
    protected double radius_a;         //a轴半径
    protected double radius_b;         //b轴半径

    public Ellipse2(double radius_a, double radius_b)
    {                                  //构造方法
        this.radius_a = radius_a;
        this.radius_b = radius_b;
    }

    public Ellipse2(double radius_a)   //圆是椭圆的特例
    {
        this.radius_a = radius_a;
        this.radius_b = radius_a;
    }

    public Ellipse2()
    {
        this(0,0);
    }

    public double area()               //计算椭圆面积，实现接口中的抽象方法
    {
        return Math.PI * this.radius_a * this.radius_b;
    }


    public void print()
    {
        if (this.radius_a==this.radius_b)
            System.out.print("一个圆，半径为 "+this.radius_a);
        else
            System.out.print("一个椭圆，a轴半径为 "+this.radius_a+"，b轴半径为 "+this.radius_b);
        System.out.println("，面积为 "+this.area());
    }

    public static void main(String args[])
    {
        Ellipse2 e1 = new Ellipse2(10,20);
        e1.print();
        
        e1 = new Ellipse2(10);
        e1.print();
    }
}

/*
程序运行结果如下：

一个椭圆，a轴半径为 10.0，b轴半径为 20.0，面积为 628.3185307179587，周长为94.24777960769379
一个圆，半径为 10.0，面积为 314.1592653589793，周长为62.83185307179586

*/