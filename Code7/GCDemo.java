class X {
	int y ;
	static X obj;
	X(){
		 y = 100;
		System.out.println("X Born");
	}
	@Override
	protected void finalize() {
		obj = this;
		System.out.println("Bye Bye X Object... "+this.y);
	}
}
public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj = new X();
		obj = null;
		System.gc();
		for(int i = 1; i<=10; i++) {
			System.out.println("I is "+i);
		}
		if(X.obj!=null) {
		System.out.println("After Finalize "+X.obj.y);
		}

	}

}
