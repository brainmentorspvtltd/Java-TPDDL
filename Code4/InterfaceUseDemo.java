interface Calc{
	int compute(int x, int y);
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

	public static void main(String[] args) {
		Test t = new Test() {
			@Override
			void show() {
				super.show();
				this.print();
				System.out.println("Anonymous Class Show...");
			}
			void print() {
				System.out.println("Print...");
			}
		};
		t.show();
		// TODO Auto-generated method stub
		if(10>2) {
		Calc c = new Calc() {
			@Override
			public int compute(int x, int y) {
				return x * y;
			}
		};
		}
		/*Calc c = new CalcImpl();
		int result= c.compute(100, 200);
		System.out.println("Result is "+result);*/
		
		
	}

}
