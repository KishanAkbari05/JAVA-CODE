import java.util.Scanner;
public class Average{
	public static void main(String[] args) {
		
		int a[] = new int[4];
		int sum=0,avg=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 4 Integer Element :");
		
		for(int i=0;i<4;i++){
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		avg = sum/4;
		System.out.println("Average :" +avg);
	}
}