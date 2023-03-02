import java.util.Random;
		
public class BankAccount {
		// TODO Auto-generated method stub

		// (string) account number;
		// (double) checking balance;
		// (double) savings balance;
		
	int randomNumber;
	private int accountNumber;
	private double checkingBalance;
	private double savingsBalance;

		
		// class member (static) with # of accounts created so far.
		public static int numAccounts = 2;
		public static double totalAccounts = 2;
		
		// class member (static) tracks total amount of money stored in every account.
		public BankAccount() {
			BankAccount.numAccounts += 1;
			this.checkingBalance = 0;
			this.savingsBalance = 0;
		}
		
		// Create a private method that returns random ten digit account number.
		public int randomNumber() {
			// TODO Auto-generated method stub
			Random randomNumber = new Random(); 
		    int Random = randomNumber.nextInt((int) Math.pow(10, 10));
		    int savedNumber = Random;
		    return Random;
		}
		
		// In the constructor, call the private method from above so that each 
		// user has a random ten digit account.
		
		// In the constructor, increment the number of accounts.
		
		// Create a method that allows a user to deposit money into either the 
		// checking or saving, and to add to total amount stored.
		
		public void depositMoney(double amount, String account) {
			if (account.equals("savings"))
				this.savingsBalance += amount;
			else if (account.equals("checking"))
				this.checkingBalance += amount;
			BankAccount.totalAccounts += amount;
		}
		
		// Create a method to withdraw money from one balance. 
		// Do not allow withdraw of money if there are insufficient funds.
		public void withdrawMoney(double amount, String account) {
			boolean successful = true;
			if (account.equals("savings")) {
				if (this.savingsBalance - amount >= 0) {
					successful = true;
					this.savingsBalance -= amount;					
				}	
			} else if (account.equals("checking")) {
				if (this.checkingBalance - amount >= 0) {
					successful = true;
					this.checkingBalance -= amount;
				}
			}
			if (successful) {
				BankAccount.totalAccounts -= amount;
			} else {
				System.out.println("Insufficient Funds");
			}
		}
		
		// Create a method to see the total money from the checking and saving.
		public void displayBalance() {
			System.out.println(String.format("Checking: %.2f, Savings %.2f", this.savingsBalance, this.checkingBalance));
		}
		
		// Users should not be able to set any of the attributes from the class
	
		
		// getters & setters
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getCheckingBalance() {
			return checkingBalance;
		}
		public void setCheckingBalance(double checkingBalance) {
			this.checkingBalance = checkingBalance;
		}
		public double getSavingsBalance() {
			return savingsBalance;
		}
		public void setSavingsBalance(double savingsBalance) {
			this.savingsBalance = savingsBalance;
		}

		public int getRandomNumber() {
			return randomNumber;
		}

		public void setRandomNumber(int randomNumber) {
			this.randomNumber = randomNumber;
		}


}
