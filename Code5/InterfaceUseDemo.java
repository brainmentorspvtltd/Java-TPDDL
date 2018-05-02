@FunctionalInterface
interface Calc{
	int compute(int x, int y);
	//void show();
	
}
class CalcImpl implements Calc{
	@Override
	public int compute(int x, int y ) {
		return x + y;
	}
}
class Test{
	void show() {
		System.out.println("Test Show...");
	}
}
public class InterfaceUseDemo {
// Lambda
	public static void main(String[] args) {
		Calc d = (a,b)->{
			System.out.println("A is "+a+" and b is "+b);
			return a*b;
			
		};
		int result = d.compute(90, 10);
		System.out.println("Result is "+result);
		Calc c = new Calc() {
			@Override
			public int compute(int a, int b) {
				return a + b;
			}
		};
		
//		Test t = new Test() {
//			@Override
//			void show() {
//				super.show();
//				this.print();
//				System.out.println("Anonymous Class Show...");
//			}
//			void print() {
//				System.out.println("Print...");
//			}
//		};
//		t.show();
//		// TODO Auto-generated method stub
//		if(10>2) {
//		Calc c = new Calc() {
//			@Override
//			public int compute(int x, int y) {
//				return x * y;
//			}
//		};
//		}
		/*Calc c = new CalcImpl();
		int result= c.compute(100, 200);
		System.out.println("Result is "+result);*/
		
		
	}

}
