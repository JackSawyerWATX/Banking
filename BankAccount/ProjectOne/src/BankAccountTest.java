
public class BankAccountTest {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.greet());
	
		// TODO Auto-generated method stub
		BankAccount Account1 = new BankAccount();
		System.out.println(Account1.randomNumber());
		
		Account1.depositMoney(100, " Checking");
		Account1.depositMoney(250, " Savings");
		Account1.displayBalance();
		System.out.println(Account1.randomNumber);
		
		System.out.println("Total in ACCOUNT " + Account1.randomNumber + ": " + BankAccount.totalAccounts);
		
		Account1.withdrawMoney(10, " From Checking");
		Account1.withdrawMoney(25, " From Savings");
		Account1.displayBalance();
		
		System.out.println("Total in ACCOUNT 4580000001: " + BankAccount.totalAccounts);
		
		BankAccount Account2 = new BankAccount();
		System.out.println("New Account Number: 4580000002");
		
		Account2.depositMoney(1700, " Checking");
		Account2.depositMoney(5800, " Savings");
		Account2.displayBalance();

		System.out.println("Total in ACCOUNT 45800000002: " + BankAccount.totalAccounts);
		
		Account2.withdrawMoney(105, " From Checking");
		Account2.withdrawMoney(275, " From Savings");
		Account2.displayBalance();
		
		System.out.println("Total in BOTH ACCOUNTS: " + BankAccount.totalAccounts);
		// class member (static) with # of accounts created so far.

	}
}
