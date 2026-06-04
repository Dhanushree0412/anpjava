package day11;

//Bank Class Definition
class Bank{
	private double amount;

	/*Instance variable
	 * This variable stores the total balance in account*/
	Bank(double amount){  //Constructor
		this.amount=amount;
		//this.amount refers to class variable
		
	}
	
	//Withdraw method
	//This method is used to take money out of the account
	void withdraw(double withdrawalAmount) {
		//The if condition Checks if enough balance is available
		if(withdrawalAmount<=amount) {
			amount=amount-withdrawalAmount;//Deduct the withdrawal amount from balance
			System.out.println("Withdrawal Successfull");//Prints Success message after withdrawal	
		}else {
			System.out.println("Insufficient Balance");
			// Prints insufficient balance if balance is low
		}
	}
	void deposit(double depositAmount) {
		//This method is used to add money into account
		
		amount=amount+depositAmount;
		//Adds deposited amount to balance
		
		System.out.println("After deposit , Available balance:"+String.format("%.2f",amount));
		//Print balance amount after deposit
	}
	
}
public class BankAccount {

	public static void main(String[] args) {
		Bank b=new Bank(3000);
		//Creating an object with initial balance 10000
		//b is used to call methods created above(withdraw, deposit)
		b.withdraw(5000);
		//withdraw 5000 from the account
		
		b.deposit(5000);
		//deposit or adds 5000 into an account
	

	}

}
