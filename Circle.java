	class Circle{
	double radius;

	public double areaOfCircle(double radius){
		return Math.PI * radius * radius;
	}

}
public class Circle extends Parent implements Interface {
	
}
public static void main(String[] args) {
	Circle c1 = new Circle();
	c1.radius = 10;
	area = c1.areaOfCircle();
	System.out.println(area);
}