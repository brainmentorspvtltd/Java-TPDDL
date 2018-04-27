class Parent
{
	static int x = 100;
	void show() {
		System.out.println("Parent Show");
	}
}
class Child extends Parent
{
	int x = 200;
	@Override
	void show() {
		System.out.println("Child Show "+x);
	}
}
public class ISMemberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Child().show();
	
		Parent parent = new Child();
		parent.show();
		System.out.println(parent.x);
	}

}
