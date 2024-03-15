import java.util.Scanner;
public class CircleArea{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter circle radius : ");
		double r = sc.nextDouble();

		System.out.println("Area of circle : " + (3.14*r*r));

	}
}