/**未使用抽象类 
public class Circle{
	double r;
	Circle(double r){
		this.r=r;
	}
	public double getArea(){
		return(3.14*r*r);
	}
}
*/

public class Circle extends Geometry {
    double r;
    Circle(double r) {
        this.r=r;
    }
    public double getArea() {
        return(3.14*r*r);
    }
}




