
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		
		int id = 1001;
		Employee ram = new Employee(id,"Ram",9090);
		ram.setSalary(-110);
		ram.setSalary(ram.getSalary()+2000);
		System.out.println("Updated Salary "+ram.getSalary());
//		ram.id = -1001;
//		ram.name = "Ram";
//		ram.salary = -9090;
		ram.print(); // 99.print()
//		System.out.println("Id "+ram.id);
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
		
		//Employee shyam = new Employee();
		//shyam.print();
//		System.out.println("Id "+shyam.id);
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
		

	}

}
