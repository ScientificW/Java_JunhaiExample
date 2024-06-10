class 锥<E>{
    double height;
    E bottom;
    public 锥(E b){
        bottom=b;   
    }
    public void computerVolume(){
        String s=bottom.toString();
        double area=Double.parseDouble(s);
        System.out.println("体积是:"+1.0/3.0*area*height); 
    }
}
class Circle{
    double area,radius; 
    Circle(double r){
       radius=r;
    } 
    public String toString(){
       area=radius*radius*Math.PI;
       return ""+area;
    }
}
class Rectangle{
    double sideA,sideB,area; 
    Rectangle(double a,double b){
       sideA=a;
       sideB=b;
    } 
    public String toString(){
       area=sideA*sideB;
       return ""+area;
    }
}
public class Example5_1{
    public static void main(String args[]){
        Circle circle=new Circle(10);
        锥<Circle> coneOne=new 锥<Circle>(circle);      //创建一个（圆）锥对象coneOne
        coneOne.height=30;
        coneOne.computerVolume();
        Rectangle rect=new Rectangle(10,20);
        锥<Rectangle> coneTwo=new 锥<Rectangle>(rect); //创建一个（方）锥对象coneTwo
        coneTwo.height=10;
        coneTwo.computerVolume();
    }
}
