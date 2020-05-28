package mypackage;

public class Account {
	private int number;
	private double balance;
	private String name;
	private String email;
	private int phoneNum;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public double getBalance(){
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
	
	public void setPhone(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getPhone(){
		return phoneNum;
	}
	
	public void depositFund(double fund) {
		this.balance+=fund;
	}
	
	public void withdrawFund(double fund) {
		if((this.balance-fund)>=0) {
			this.balance-=fund;
		}
	}
}


