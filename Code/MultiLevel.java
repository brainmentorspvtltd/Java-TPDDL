class X{
	int a;
	X(){
		a = 100;
		System.out.println("X Default Cons");
	}
	X(int x){
		this();
		System.out.println("X Param Cons");
	}
}
class Y extends X{
	int a ;
	Y(){
		a = 200;
		//super(100);
		//super();
		System.out.println("Y Default Cons");
	}
	Y(int x){
		this();
		//super(100);
		System.out.println("Y Param Cons");
	}
}
class Z extends Y{
	int a;
	Z(){
		
		super(100);
		a = 300;
		System.out.println("Z Default Cons");
	}
	Z(int a){
		this();
		
		//super();
		//X x = this;  //Z  X x = new Z()
		int z = ((X)this).a + ((Y)this).a + this.a + a;
		//super();
		System.out.println("Z Params Cons "+z);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z obj = new Z(1);
	}

}
