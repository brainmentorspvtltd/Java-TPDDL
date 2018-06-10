import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc{
	int add(int  x, int y){
		return x + y;
	}
	int sub(int  x, int y){
		return x - y;
	}
	
	int mul(int  x, int y){
		return x * y;
	}
	Calc(){
		System.out.println("Calc cons");
	}
	static{
		System.out.println("Calc Static Call");
	}
}
class ScCalc{
	int pow(int  x, int y){
		return (int) Math.pow(x, y);
	}
	ScCalc(){
		System.out.println("Sc Calc Cons Call");
	}
	static{
		System.out.println("Sc Calc Loaded Static");
	}
}
public class RefDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		System.out.println("Enter the Class Load");
		Scanner s = new Scanner(System.in);
		String className = s.next();
		
		Object object = Class.forName(className).newInstance();  // new SomeClassName()
		System.out.println("Enter the Method Name");
		String methodName = s.next();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class, int.class);
		Object result = method.invoke(object, 1000,2000);
		System.out.println("Result is "+result);
		//System.out.println(object);

	}

}
