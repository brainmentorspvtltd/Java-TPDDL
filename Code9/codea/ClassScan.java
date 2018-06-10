import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class A
{
	private int x , y;
	static int z;
	public int a;
	protected int b;
	void show(){
		
	}
	void print(){
		
	}
	void add(){
		
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + "]";
	}
	
}
public class ClassScan {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		A obj =new A();
		Class cls = obj.getClass(); // Data + Meta
		//Class cls = A.class;  // Meta 
		Field fields []=cls.getDeclaredFields();
		int privateCount = 0;
		System.out.println(fields.length);
		System.out.println("Before Loop "+obj);
		for(Field field : fields){
			if(Modifier.isPrivate(field.getModifiers())){
				field.setAccessible(true);
				field.set(obj, privateCount);
				privateCount++;
			}
		}
		System.out.println("Private Count is "+privateCount);
		System.out.println("After Loop "+obj);
		
		

	}

}
