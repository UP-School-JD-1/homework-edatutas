package course1.ch11.hw4;

public class AccountTest {

	public static void main(String[] args) {
 
		Account account1 = new Account(500);
		Account account2 = new Account(200);
		AccountClient accountClient1 = new AccountClient( 1 ,"Eda " , "Tutas ", account1);
		
		accountClient1.withDraw(100);
		accountClient1.deposit(50);
		accountClient1.transfer(20,1,account2);
		
	}

}
