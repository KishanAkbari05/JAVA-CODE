import java.util.Scanner;

class Bank_Account{

	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;


	public void displayBankAccount1(){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter accountType : ");
		accountType = sc.nextLine();

		System.out.println("Enter email : ");
		email = sc.nextLine();

	}
	public void displayBankAccount2(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter userName : ");
		userName = sc.nextLine();

		System.out.println("Enter accountNo : ");
		accountNo = sc.nextInt();

		System.out.println("Enter accountBalance : ");
		accountBalance = sc.nextDouble();
	}

	public void getBankAccount(){
		System.out.println("userName : " +userName);
		System.out.println("AccountNo : " +accountNo);
		System.out.println("email : " +email);
		System.out.println("accountType : " +accountType);
		System.out.println("accountBalance : " +accountBalance);
	}
}

public class Bank{
public static void main(String[] args){

	Bank_Account b1 = new Bank_Account();
	b1.displayBankAccount1();
	b1.displayBankAccount2();
	b1.getBankAccount();

	}
}


 //2nd method
	// public void displayAccounNo(int no){
	// 	accountNo = no;
	// }

	// public int getAccountNo(){
	//     return accountNo;
	// }

//main method ma 
	// b1.displayAccounNo(123456789);
	// b1.getAccountNo();
	// System.out.println("Account No : " + b1.accountNo);