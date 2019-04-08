public class BankAccount {

	private int accountNumber;
	private String accountName;
	private double balance;
	private AccountType accountType;

	public BankAccount(int ANO, String AN, double b, AccountType AT) {
		accountNumber = ANO;
		accountName = AN;
		balance = b;
		accountType = AT;
	}
	
	public String toString() {
		String info = "Account Number: " + accountNumber +
						"\nAccount Name: " + accountName +
						"\nAccount Balance: " + balance +
						"\nAccount Type: " + accountType;
		return info;			
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

}
