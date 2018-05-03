import java.util.ArrayList;

class Emp{
	long id;
	String name;
	double salary;
	Emp(long id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class HeapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long id = 1;
		ArrayList l = new ArrayList();
		System.out.println("Program Start....");
		while(true) {
			Emp e  =new Emp(id,"Ram"+id,9000);
			l.add(e);
			id++;
			Thread.sleep(30);
		}
	}

}
