import java.util.*;
public class Arrayreverse{
	 public static void main(String[] args) {	

	 	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your array size : ");
		int n = sc.nextInt();

		int a[] = new int[n];
		
		System.out.println("Enter your array Element : ");
		
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}

		int b[] = new int[n];

		
		System.out.println("Reverse Array : ");
		
		for(int i=0;i<n;i++){
			b[i]=a[n-i-1];
			System.out.print(b[i] +" ");
		}
	}
}