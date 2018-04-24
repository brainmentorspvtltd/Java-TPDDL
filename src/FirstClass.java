import java.io.IOException;
import java.util.Scanner;

public class FirstClass {

	static public  void main(String ...arr) throws IOException {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = s.nextInt() ;
		System.out.println("Enter the Second Number");
		int b = s.nextInt() ;
		int  c = a + b;
		//byte z[] = System.in.readAllBytes();
		
		System.out.println("Sum is "+c);
		s.close();

	}

}
