import java.util.LinkedList;

public class WrapperAndVarArgs {
	// var args in java 5
	
	int add(int ...a) {
		System.out.println("Args "+a.length);
		int sum = 0;
		for(int i :a) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		WrapperAndVarArgs obj = new WrapperAndVarArgs();
		System.out.println(obj.add());
		System.out.println(obj.add(1));
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1,2,3));
		System.out.println(obj.add(1,2,3,4));
		
		
		System.out.println(Integer.toBinaryString(123));
		LinkedList l = new LinkedList();
		Integer a = new Integer(100);
		l.add(100);  // AutoBoxing + Upcasting
		l.add(a); // Upcasting
		
		int x = 100; // Value Type
		x++;
		// Old Code Java 1.4
		Integer y = new Integer(200);
		//y++;
		int z = y.intValue();
		z++;
		y = new Integer(z);
		// After Java 1.5
		//Integer y = 200; // Boxing // Ref Type
		y++;
		//int a = y.intValue(); // UnBoxing
		//a++;
		//y = a;  // Boxing
	}

}
