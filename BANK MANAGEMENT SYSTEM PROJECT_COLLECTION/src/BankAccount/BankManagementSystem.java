package BankAccount;
import java.util.Scanner;
public class BankManagementSystem {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Rbi BA=new Sbi();
		while(true)
		{	
		System.out.println("Choose Your Option");
		System.out.println("1.Create New Account");
		System.out.println("2.Display Account Details");
		System.out.println("3.Deposite money");
		System.out.println("4.Withdraw Money");
		System.out.println("5.Check Balance");
		System.out.println("6.Exit");
		System.out.println("Thank You");
		int ch=s.nextInt();
		
		switch(ch) {
		case 1:
			BA.createAccount();
			break;
		case 2:
			BA.displayAllDetails();
			break;
			
		case 3:
			BA.depositMoney();
			break;
			
		case 4:
			BA.withdrawl();
			break;
			
		case 5:
			BA.balanceCheck();
			break;
			
		case 6:
			System.exit(0);
			
			break;
			
		default :
			System.out.println("Invalid choice ...");
			break;
		}
		}
	}
}