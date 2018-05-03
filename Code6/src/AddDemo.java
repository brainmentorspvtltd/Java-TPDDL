import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AddDemo {

	public static void main(String[] args) {
		Locale locale = null;
		System.out.println("Press 1 for English ");
		System.out.println("हिंदी के लिए 2 दबाएं");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if(choice == 1) {
			locale	= new Locale("en","US");
		}
		else
		if(choice == 2) {	
		locale	= new Locale("hi","IN");
		}
		ResourceBundle r = ResourceBundle.getBundle("messages",locale);
		Date d = new Date();
		System.out.println(r.getString("welcomemsg")+d);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		String formattedDate = df.format(d);
		System.out.println(r.getString("welcomemsg")+formattedDate);
		double salary = 9001232;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedSalary = nf.format(salary);
		System.out.println(formattedSalary);
		System.out.println(salary);
		
		
		System.out.println(r.getString("firstno"));
		int firstNumber = s.nextInt();
		System.out.println(r.getString("secondno"));
		int secondNumber = s.nextInt();
		System.out.println(r.getString("result")+" "+(firstNumber + secondNumber));
		s.close();
	}

}
