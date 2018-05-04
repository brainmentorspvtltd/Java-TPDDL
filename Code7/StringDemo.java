class Customer{
	int id;
	String name;
	double balance;
	Customer(int id , String name, double balance ){
		this.id = id;
		this.name = name;
		this.balance  = balance;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
//	@Override
//	public int hashCode() {
//		return name.length();
//	}
}

public class StringDemo {

	public static void main(String[] args) {
		String z = new String("Hello String");
		System.out.println("Z is "+z);
		Customer ram = new Customer(1001,"Ram",9090);
		
		System.out.println("Ram is "+ram);
		Customer tim = new Customer(1001,"tim",93090);
		System.out.println("Ram is "+tim);
		Customer kim = new Customer(1001,"kim",95090);
		System.out.println("Ram is "+kim);
		
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");
		String d = c.toString();
		char arr [] = d.toCharArray();
		int v = 100;
		System.out.println(a==c);
		

	}

}
