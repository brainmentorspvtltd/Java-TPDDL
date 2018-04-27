class T{
//	void show(int ...x) {
//		System.out.println("int var args");
//	}
	void show(Long x) {
		System.out.println("Long ");
	}
//	void show(Integer x) {
//		System.out.println("Integer");
//	}
//	void show(long x) {
//		System.out.println("long primitive");
//	}
	void show(byte x) {
		System.out.println("byte ");
	}
//	void show(float x) {
//		System.out.println("float");
//	}
//	void show(double x) {
//		System.out.println("double");
//	}
//	void show(int x) {
//	System.out.println("int");		
//	}
}
public class OverloadingRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T obj = new T();
		obj.show((byte)10);

	}

}
