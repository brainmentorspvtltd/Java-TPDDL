import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
//		try(Scanner s = new Scanner(System.in)){
//			
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt(); //100 (enter \n)
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the Gender");
		char gender = scanner.next().charAt(0);
		System.out.println("Id "+id+" Name is "+name+" Gender "+gender);
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Address");
		String address = s.nextLine();
		System.out.println("Address is "+address);
		s.close();
		scanner.close();

	}

}
