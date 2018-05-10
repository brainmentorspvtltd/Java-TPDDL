import java.util.ArrayList;
import java.util.Scanner;

class Customer{
	private int id;
	private String name;
	private double balance;
	Customer(int id , String name, double balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object instanceof Customer) {
			Customer c = (Customer)object;
			if(this.id>0 && this.name!=null) {
				if(this.id == c.id && this.name.equals(c.name)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Id "+id+" name "+name+" Balance "+balance+"\n";
	}
}
class CustomerOperations{
	private static ArrayList<Customer> customerList = new ArrayList<>();
	static void add(int id , String name , double balance) {
		Customer customer = new Customer(id, name , balance);
		customerList.add(customer);
	}
	
	
	static void traverse() {
		if(customerList.size()>0) {
			for(Customer customer: customerList) {
				System.out.print(customer);
			}
		}
	}
	static boolean find(int id , String name , double balance) {
		Customer customerObject = new Customer(id, name,balance);
		return customerList.contains(customerObject);
		
	}
	static int findAndReturnIndex(int id , String name , double balance) {
		Customer customerObject = new Customer(id, name,balance);
		return customerList.indexOf(customerObject);
		
	}
	static boolean delete(int id , String name , double balance) {
		int index = findAndReturnIndex(id, name, balance);
		if(index>=0) {
			customerList.remove(index);

			return true;		
					}
		return false;
	}
	static boolean update() {
		return false;
	}
}
public class CRUDDemo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		while(true) {
		System.out.println("1. Add");
		System.out.println("2. Find");
		System.out.println("3. Delete");
		System.out.println("4. Update");
		System.out.println("5. Read");
		System.out.println("6. Sum of Balance of All Customers");
		System.out.println("7. Count Customers");
		System.out.println("8. Sort Customer By Id");
		System.out.println("9. Sort Customer By Name");
		System.out.println("10. Exit");
		System.out.println("Enter the Choice");
		int choice  = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the Id ");
			int id = scanner.nextInt();
			System.out.println("Enter the Name");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Enter the Balance");
			double balance = scanner.nextDouble();
			CustomerOperations.add(id,name,balance);
			System.out.println("Record Added..");
			break;
		case 2:
			System.out.println("Enter the Id ");
			 id = scanner.nextInt();
			System.out.println("Enter the Name");
			scanner.nextLine();
			 name = scanner.nextLine();
			System.out.println("Enter the Balance");
			 balance = scanner.nextDouble();
			String result = CustomerOperations.find(id, name, balance)?"Found":"Not Found";
			System.out.println("Result is "+result);
			break;
		case 3:
			System.out.println("Enter the Id ");
			 id = scanner.nextInt();
			System.out.println("Enter the Name");
			scanner.nextLine();
			 name = scanner.nextLine();
			System.out.println("Enter the Balance");
			 balance = scanner.nextDouble();
			  result = CustomerOperations.delete(id, name, balance)?"Deleted":"Not Deleted";
			  System.out.println("Result is "+result);
		case 5:	
			CustomerOperations.traverse();
			break;
		case 10:
			System.exit(0);
		}
		}
		
//		ArrayList<Customer> customerList = new ArrayList<>();
//		customerList.add(new Customer(1001,"Ram",9000));
//		customerList.add(new Customer(1002,"Shyam",19000));
//		customerList.add(new Customer(1003,"Mike",29000));
//		customerList.add(new Customer(1004,"Tim",8000));
		//System.out.println("Customer List is "+customerList);
//		for(Customer customer: customerList) {
//			System.out.print(customer);
//		}

	}

}
