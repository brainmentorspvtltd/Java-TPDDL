interface K1
{
	void print();
	default void show() {
		System.out.println("Show...");
	}
}
interface K3 {
	default void show() {
		System.out.println("Display...");
	}
}
class K2 implements K1,K3{
	@Override
	public void show() {
		K1.super.show();
		K3.super.show();
	}
	public void print() {
		System.out.println("K2 Print...");
	}
}
public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
