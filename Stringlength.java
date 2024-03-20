import java.util.*;
public class Stringlength{
	 public static void main(String[] args) {	

	 	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your string : ");
		String str = sc.nextLine();

		//for (int i=str.length()/2;i<str.length();i++) {
		//	System.out.print(str.charAt(i));
		//}
		
		System.out.print(str.substring(str.length()/2));
	}
}