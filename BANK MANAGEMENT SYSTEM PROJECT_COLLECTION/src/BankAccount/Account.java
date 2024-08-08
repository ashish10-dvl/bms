package BankAccount;
import java.util.Scanner;
public class Account {
//Declare instance variables for Account No.,Name, Mobile No.,Adhar No.,Gender,age,balance
	protected String bankName;
	private long accNo;
	private String name;
	private long mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
	private double ammount;
	
	private String Exit;
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getExit() {
		return Exit;
	}
	public void setExit(String exit) {
		Exit = exit;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	//create setter getter
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long l) {
		this.accNo = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long l) {
		this.mobNo = l;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}




























//
