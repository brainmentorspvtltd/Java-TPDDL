import static java.lang.System.out;
import static com.demo.A.print;
import static java.lang.Math.sqrt;

class N1
{
	static void show() {
		class V{
			void print() {
				System.out.println("Print....");
			}
		}
		V obj = new V();
		obj.print();
	}
}

class Outer{
	int x = 10;
	interface P
	{
		
	}
	class V implements P
	{
		
	}
	class V1 extends V{
		
	}
	class Inner{
	int x = 20;
	Inner(int x){
		int z = Outer.this.x  + this.x + x;
		System.out.println("Z is "+z);
	}
	void show() {
		System.out.println("Inner Show...");
	}
	}
	static class StaticInner{
		static void print() {
			System.out.println("Print... ");
		}
	}
}

public class StaticImport {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(30);
		inner.show();
		Outer.Inner i = new Outer().new Inner(40);
		i.show();
		
		Outer.StaticInner.print();
		//out.println(sqrt(4));
		//print();
		

	}

}
