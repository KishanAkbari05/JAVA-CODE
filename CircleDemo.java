class Circle{
	double radius;

	public double circleArea(){
		return Math.PI * radius * radius;
	}

}
public class CircleDemo{
public static void main(String[] args) {
	Circle c1 = new Circle();
	c1.radius = 10;
	double area = c1.circleArea();
	System.out.println("Circle Area = "+area);
 }
}