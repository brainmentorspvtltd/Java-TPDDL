// Utility Class
final class Validation{
	private Validation() {}
	public static boolean isNotBlank(String value) {
		return value!=null && value.trim().length()>0;
	}
}

class User{
	static int counter;  // Per Class Per Copy
	String userid;  // Instance Var (Per Object per Copy)
	String password;
	static void show() {
		//userid = "";
		System.out.println("Counter is "+counter);
	}
	 User(String userid , String password){
		//counter=0;
		this.userid = userid;
		this.password = password;
		counter++;
	}
	static {
		counter = 0;
		//userid = "";
		System.out.println("I will call only once....");
	}
	
	
}
public class StaticDemo {

	public static void main(String[] args) {
		//System s = new System();
		//Math.sqrt(a)
		//Validation v = new Validation();
		System.out.println(Validation.isNotBlank(""));
		//System.out.println(Validation.isNotBlank(""));
		User.show();
		// TODO Auto-generated method stub
		User amit = new User("amit","123");
		User ram = new User("ram","123");
		System.out.println("How Many Users are "+User.counter);
	}

}
