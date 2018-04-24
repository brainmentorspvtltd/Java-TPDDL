import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(1);
		l.add(12);
		l.add(9);
		l.add(111);
		l.add(20);
		l.remove(0);
		System.out.println(l.contains(20)?"Found":"Not Found");
		Collections.sort(l);
		System.out.println(l);
		//l.add("Amit");
		
		

	}

}
