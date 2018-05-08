import java.util.ArrayList;
class A{ 
	
}
class B extends A{
	
	
}
class C extends A{
	
}
class D{
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj = new B();
		obj = new C();
		//obj = new D();
		int x = 100;
		Object y = x;
		y  = true;
		y = "Ram";
		
		ArrayList<A> l = new ArrayList<>();

	}

}
