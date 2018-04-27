class A
{
	int x ;
	int y ;
	private int getDataFromExternalResource(){
		// Talk to DB/ File/ network and fetch the value
		return 1000;
	}
	
	static{
		System.out.println(" i will call only once when class is loaded...");
	}
	
	{
		y = getDataFromExternalResource(); // Pre Cons Call
	}
	A(){
		 x= 100;
		 y = y + x; // Init
		System.out.println("A Cons");
	}
}
public class InitUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
