abstract class Loan
{
	double balance;
	Loan(){
		balance = 1000;
		System.out.println("Loan Cons Call");
	}
	void applyForLoan() {
		System.out.println("COmmon Process for Apply  a Loan...");
	}
	abstract void emi();
}
class AutoLoan extends Loan{
	AutoLoan(){
		// super();
		System.out.println("Auto Loan Cons Call");
	}
	@Override
	void emi() {
		System.out.println("Auto Loan EMI Logic");
	}
	void shortDuration() {
		
	}
}
class HomeLoan extends Loan{
	@Override
	void emi() {
		System.out.println("Home Loan Emi Logic");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Loan loan = new AutoLoan();
		loan.emi();
		//loan.shortDuration();
		//Loan loan = new Loan();
		// TODO Auto-generated method stub

	}

}
