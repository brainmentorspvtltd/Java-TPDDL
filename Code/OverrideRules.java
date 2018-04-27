class First{
	int x, y;
}
class Second extends First{
	int z;
}
class Q{
	First show() {
		System.out.println("Q Show");
		return new First();
	}
}
class V extends Q{
	@Override
	protected Second show() {
		System.out.println("V Show");
		return new Second();
	}
}
public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V v = new V();
		v.show();

	}

}
