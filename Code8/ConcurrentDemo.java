import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v;
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("ram");
		s1.add("shyam");
		List<String> s2 = Collections.synchronizedList(s1);
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		//ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		for(Integer a : list) {
			System.out.println(a);
			list.add(new Random().nextInt(100));
		}
		System.out.println("Now the List is "+list);

	}

}
