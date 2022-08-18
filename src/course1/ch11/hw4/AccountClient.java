package course1.ch11.hw4;

public class AccountClient {

	
	
	
	double transferCost;     // Havale Masrafı
	double amount;			 // Para Çek - Yatır - Havale Et için Kullanılan Miktar 
	
	
	private int id;
	private String firstName;
	private String lastName;
	private Account account;
	
	
	
	
	
	
	// Constructor 
	
	public AccountClient(int id, String firstName , String lastName, Account account ) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.account=account;
	}
	
	
	
	
	// Get - Set Method 
	
	
	public double getTransferCost() {
		return transferCost;
	}



	public void setTransferCost(double transferCost) {
		this.transferCost = transferCost;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	// Para Çekme 
	
	
	public double withDraw(double amount) {
		System.out.println("\n**********   Para Cekme Islemi   *******");
		System.out.println("Islem Oncesi Bakiyeniz : " +  account.balance);
		System.out.println("Cekilecek Miktar : " +  amount);
		account.setBalance(account.balance-amount);
		
		printInfo(account);
		return account.balance;
		
	}

	
	
	
	//Para Yatırma 
	
	public double deposit(double amount) {
		System.out.println("\n\n\n**********   Para Yatirma Islemi   *******");
		System.out.println("Islem Oncesi Bakiyeniz : " +  account.balance);
		account.setBalance(account.balance+amount);
		
		printInfo(account);
		return account.balance;
	}


	
	
	
	/*
	 * Havale İşlemi 
	 * 
	 * transferCost Havale Ücreti 	
	 */
	
	
	
	public void transfer(double amount , double transferCost ,Account account2) {
		System.out.println("\n\n\n**********      Havale Islemi      *******");
		System.out.println("Islem Oncesi Bakiyeniz : " +  account.balance);
		System.out.println("Havale Edilecek Miktar : " +  amount);
		System.out.println("Havale Ucreti  : " +  transferCost);
		account.setBalance(account.balance-amount-transferCost);
		account2.setBalance(account2.balance+amount);
		printInfo(account);
		
	}
	
	
	
	public void printInfo(Account account) {
        System.out.println("\nID : " + id + "\n" + firstName + lastName + "Hesabinizdaki Tutar : " + account.balance);
    }

	
}
