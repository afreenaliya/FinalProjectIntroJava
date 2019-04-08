import java.util.*;

public class BankOperations {
	static BankAccount[] bankAccounts = new BankAccount[3];
	
	public static void main(String[] args) {
		BankAccount bac = new BankAccount(5674, 
				"John Doe", 
				1000.0, 
				AccountType.Checking);
		BankAccount bac2 = new BankAccount(5675, 
				"John Brown", 
				10.0, 
				AccountType.Saving);
		BankAccount bac3 = new BankAccount(5676, 
				"John White", 
				55.0, 
				AccountType.Joint);
		
		bankAccounts[0] = bac;
		bankAccounts[1] = bac2;
		bankAccounts[2] = bac3;
		
		getBalanceFor();
	}
	
	private static void getBalanceFor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the account number you want the balance for?");
		int bankAccountNumber = sc.nextInt();
		
		for(int i = 0; i < bankAccounts.length; i++) {
			if(bankAccounts[i].getAccountNumber() == bankAccountNumber) {
				System.out.println("You have $" + bankAccounts[i].getBalance());
			}
		}
		
	}

	public static void changeName(BankAccount b, String NewName) {
		b.setAccountName(NewName);
	}
	
	public static void sendMoney(BankAccount b1, BankAccount b2, double money) {
		if(b1.getBalance() > money) {
			b1.setBalance(b1.getBalance() - money);
			b2.setBalance(b2.getBalance() + money);
		}
		else {
			System.out.println("Insufficient Balance.");
		}
	}
	
	public static void addInterest(double interestRate) {
		for(int i = 0; i < bankAccounts.length; i++) {
			double result = bankAccounts[i].getBalance() * (1 + interestRate);
			bankAccounts[i].setBalance(result);
		}
	}
}
