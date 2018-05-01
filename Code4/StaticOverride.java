class BB{
	static void print() {
		System.out.println("BB print...");
	}
}
class CC extends BB{
	//@Override
	static void print() {
		System.out.println("CC print...");
	}
}
public class StaticOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB bb = new CC();
		bb.print();

	}

}
