import java.util.ArrayList;

class E{
	
}
class A extends E{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D{
	
}
public class WildCardDemo {
	
	static void print5(ArrayList<? super A> aList) {
		System.out.println(aList);
	}
	static void print(ArrayList<? extends A> aList) {
		System.out.println(aList);
	}
	static void print2(ArrayList<?> aList) {
		System.out.println(aList);
	}
	static void print3(ArrayList<Object> aList) {
		System.out.println(aList);
	}
	static void print4(ArrayList<A> aList) {
		System.out.println(aList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Object> p = new ArrayList<>();
//		p.add(100);
//		Object o = new Integer(100);
//		p.add(o);
		
	 print5(new ArrayList<A>());
	// print5(new ArrayList<B>());
	 //print5(new ArrayList<C>());
	 //print5(new ArrayList<D>());
	 print5(new ArrayList<E>());
	 

	}

}
