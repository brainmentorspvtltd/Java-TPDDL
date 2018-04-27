 class S{
	 int a , b; 
//	 final int X ;
//	  S(){
//		  X =100;
//	  }
//	  void takeX() {
//		  X = 200;
//	  }
	 //	final void show() {
//		
//	}
}
class N extends S{
	void show() {
		
	}
}
public class UseOfFinalDemo {

	public static void main(String[] args) {
		final S obj = new S();
		//obj = new S();
		obj.a++;
		obj.b++;
		System.out.println(obj.a+" "+obj.b);
		// TODO Auto-generated method stub
		final double PI = 3.14;
		System.out.println();
		//PI++;

	}

}
