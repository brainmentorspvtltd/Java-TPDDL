class Account{
	int id;
	double balance;
	String name;
	void withDraw() {
		System.out.println("Account class withdraw...");
	}
	void desposit() {
		System.out.println("Account class Deposit...");
	}
	void roi() {
		System.out.println("Account class ROI 5%...");
	}
}
class SavingAccount extends Account{
	@Override
	void withDraw() {
		super.withDraw();
		System.out.println("SavingAccount WithDraw Called...");
	}
	void debitCard() {
		System.out.println("Issue a Debit Card...");
	}
}
class CurrentAccount extends Account{
	@Override
	void withDraw() {
		super.withDraw();
		System.out.println("CurrentAccount WithDraw Called...");
	}
	void odLimit() {
		System.out.println("OD Limit of CurrentLimit...");
	}
}
class AccountCaller{
	void callMe(Account account) {
		account.desposit();
		account.withDraw();
		account.roi();
		if(account instanceof SavingAccount) {
			((SavingAccount)account).debitCard();
			//SavingAccount s = (SavingAccount) account;  // Downcasting
			//s.debitCard();
		}
		else
		if(account instanceof CurrentAccount) {	
			((CurrentAccount)account).odLimit();
		}
	}
}
public class ISADemo {
	
	public static void main(String[] args) {
		AccountCaller ac = new AccountCaller();
		ac.callMe(new SavingAccount());
		System.out.println("***********************");
		ac.callMe(new CurrentAccount());
		// TODO Auto-generated method stub
//		Account savingAccount = new SavingAccount();  // Upcasting
//		savingAccount.desposit();
//		savingAccount.withDraw();
//		savingAccount.roi();
//		savingAccount.debitCard();
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.desposit();
//		ca.withDraw();
//		ca.roi();
//		ca.odLimit();

	}

}
