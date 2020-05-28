package mypackage;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Account mainAcc = new Account();
		
		//Account informations
		int number;			//account number
		double balance = 0; //total balance
		String name;		//name of the user
		String email;		//email
		int phoneNum;		//phone number
		double fund;		//fund to be withdrawn/
		
		//setting the account
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your account number: ");
		number = input.nextInt();
		mainAcc.setNumber(number);
		
		System.out.println("Input your name: ");
		name = input.next();
		mainAcc.setName(name);
		
		System.out.println("Input your email: ");
		email = input.next();
		mainAcc.setEmail(email);
		
		System.out.println("Input your phone number: ");
		phoneNum = input.nextInt();
		mainAcc.setPhone(phoneNum);
		
		//variable to store the option selected on the list
		int option=0;
		
		//while the "exit" option is not selected, the user will keep using the program functions on a loop
		while(option != 12) {
			
			showOpt();//Show all the available options
			option = input.nextInt();
			
			switch(option){
				
				//shows the account number
				case 1:
					System.out.println("Your account number: "+mainAcc.getNumber()); // do it like that on the other cases pls	
					break;
				
				//shows the user name
				case 2:
					System.out.println("Your name: " + mainAcc.getName());
					break;
					
				//shows the email
				case 3:
					System.out.println("Your email: "+mainAcc.getEmail());;
					break;
				
				//shows the account phone number
				case 4:
					System.out.println("Your phone number: " + mainAcc.getPhone());
					break;
				
				//changes the account number
				case 5:
					System.out.println("Write the new account number:");
					mainAcc.setNumber(input.nextInt());
					break;
					
				//changes the name
				case 6:
					System.out.println("Write the new name:");
					mainAcc.setName(input.next());
					break;
				
				//changes the email
				case 7:
					System.out.println("Write the new email:");
					mainAcc.setEmail(input.next());
					break;
					
				//changes the phone
				case 8:
					System.out.println("Write the new phone number:");
					mainAcc.setPhone(input.nextInt());
					break;
					
				//deposits the fund
				case 9:
					System.out.println("Quantity to be deposited:");
					mainAcc.depositFund(input.nextDouble());
					break;
					
				//withdraws the fund
				case 10:
					System.out.println("Quantity to be withdrawn:");
					mainAcc.withdrawFund(input.nextDouble());
					break;
				
				//shows the balance
				case 11:
					System.out.println("Your balance is "+ mainAcc.getBalance());
					break;
				
				//exits the program
				case 12:
					System.out.println("Goodbye, "+mainAcc.getName());
					break;
					
				default:
					//Unavailable option
					break;
			}
		}	
	}
	
	private static void showOpt() {
		System.out.println("Choose the number for one of the options below:"
				+ "\r\n" + " 1  -  Show your account number"
				+ "\r\n" + " 2  -  Show your name"
				+ "\r\n" + " 3  -  Show your email"
				+ "\r\n" + " 4  -  Show your phone number"
				+ "\r\n" + " 5  -  Update your account number"
				+ "\r\n" + " 6  -  Update your number"
				+ "\r\n" + " 7  -  Update your email"
				+ "\r\n" + " 8  -  Update your phone number"
				+ "\r\n" + " 9  -  Deposit funds"
				+ "\r\n" + "10  -  Withdraw funds"
				+ "\r\n" + "11  -  Show your balance"
				+ "\r\n" + "12  - Exit the program");
	}
}
