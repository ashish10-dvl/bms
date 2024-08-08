package BankAccount;
import java.util.Scanner;
public class Sbi implements Rbi {

	Account ac = new Account();
	Scanner s=new Scanner(System.in);
//overriding Methods
	@Override
	public void createAccount() {
		System.out.println("Enter Account No. :");
		ac.setAccNo(s.nextLong());
		System.out.println("Enter Name. :");
		ac.setName(s.next());
		System.out.println("Enter Mob. :");
		ac.setMobNo(s.nextLong());
		//s.next();
		System.out.println("Enter Aadhar No. :");
		ac.setAdharNo(s.next());
		System.out.println("Enter Gender :");
		ac.setGender(s.next());
		System.out.println("Enter Age :");
		ac.setAge(s.nextInt());
		System.out.println("Enter Balance :");
		ac.setBalance(s.nextDouble());
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Account Number : "+ac.getAccNo());
		System.out.println("Account Holder Name : "+ac.getName());
		System.out.println("Mobile Number : "+ac.getMobNo());
		System.out.println("Adhar Number : "+ac.getAdharNo());
		System.out.println("Gender : "+ac.getGender());
		System.out.println("Age : "+ac.getAge());
		System.out.println("Balance : "+ac.getBalance());
			
	}

	@Override
	public void depositMoney() {
//update the balance by adding the amount	
		System.out.println("Balance = "+ac.getBalance());
		System.out.println("Enter Amount to Deposit");
		double amount=s.nextDouble();
		if(amount>0) {
			
		double Balance=amount += ac.getBalance();
		ac.setBalance(Balance);
		System.out.println("Your Current Balance is : "+Balance);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
		
	}

	@Override
	public void withdrawl() {
		System.out.println("Balance = "+ac.getBalance());
		System.out.println("Enter Amount to Withdraw");
		double ammount = s.nextDouble();
		if(ammount>0) {
			
		
		  if(ac.getBalance()>=ammount) {
			  double Balance=ac.getBalance()-ammount;
			  ac.setBalance(Balance);
			  System.out.println("Your Current Balance is : "+Balance);
			
		}
		  else {
				System.out.println("You Dont Have Enough Balance. "+"Balance = "+ac.getBalance());
			}
		  
		}
				else {
					System.out.println("Invalid Amount");
		}
	
	}

	@Override
	public void balanceCheck() {
		System.out.println("Your Current Balance is : "+ac.getBalance());
		
	}

	
}
