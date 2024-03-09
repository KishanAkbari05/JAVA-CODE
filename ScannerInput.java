import java.util.Scanner;
public class ScannerInput{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your first number : ");
		int a = sc.nextInt();
		System.out.println("enter your second number : ");
		int b = sc.nextInt();

		System.out.println(a);
		System.out.println(b);

	}
}