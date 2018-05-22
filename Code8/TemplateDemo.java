import java.util.ArrayList;

class MyArrayList<T>{
	ArrayList<T> arr ;
	MyArrayList(){
		arr = new ArrayList<>();
	}
	void add(T data) {
		arr.add(data);
	}
	void print() {
		for(T t : arr) {
			System.out.println(t);
		}
	}
}
class Emp{
	int id ;
	String name;
	Emp(int id , String name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Id "+id+" name "+name;
	}
}
public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s2 = new ArrayList<>();
		s2.add("Hi");
		MyArrayList<Integer> s = new MyArrayList<>();
		s.add(100);
		MyArrayList<Emp> s3 = new MyArrayList<>();
		s3.add(new Emp(1001,"Ram"));
		s3.add(new Emp(1002,"Shyam"));
		s3.print();
		

	}

}
