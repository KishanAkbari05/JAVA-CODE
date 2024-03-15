import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your first number : ");
		double a = sc.nextDouble();
		System.out.println("enter your second number : ");
		double b = sc.nextDouble();
		System.out.println("enter your operater : ");
		char c = sc.next().charAt(0);
		
		switch(c){
			case '+' :
				      System.out.println("Add :" +(a+b));
					  break; 
		    case '-' :
		    	      System.out.println("Sub :" +(a-b));
					  break;
		    case '/' :
		    	      System.out.println("Div :" +(a/b));
					  break; 
		    case '*' :
		    	     System.out.println("Multi :" +(a*b));
					  break; 
		    case '%' :
		    	      System.out.println("Modulo :" +(a%b));
					  break;  
		    default  : 
		    	      System.out.println("enter valid operator");

		}
	}
}