import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> l = new ArrayList<>();
		//l = new Vector<String>();
		ArrayList<String> l = new ArrayList<>(100);
		l.ensureCapacity(1000);
		l.add("ram");
		l.add("kim");
		l.add("tim");
		l.add("rim");
		l.add(0, "shyam");
		l.set(1, "ram Kumar");
		System.out.println(l);
		System.out.println(l.size());
		//l.remove(0);
		//l.remove("ram");
		Collections.sort(l);
		System.out.println("After Sort "+l);
		System.out.println("After Remove "+l);
		System.out.println(l.indexOf("shyam")>=0?"Found":"Not Found");
		
		if(l.contains("kumar")) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found...");
		}
		
		// Traverse Way
		for(int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			//i.remove();
		}
		ListIterator<String> j = l.listIterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		while(j.hasPrevious()) {
			System.out.println(j.previous());
		}
		for(String str : l) {
			System.out.println(str);
		}
		l.forEach(currentElement->System.out.println(currentElement));
//		l.forEach(currentElement->{
//			if(currentElement.endsWith("kumar")) {
//				System.out.println("Dr "+currentElement);
//			}
//		});
		ArrayListDemo2 obj = new ArrayListDemo2();
		l.forEach(obj::logic);
		l.forEach(ArrayListDemo2::logic2);

	}
	void logic(String currentElement) {
		if(currentElement.endsWith("kumar")) {
			System.out.println("Dr "+currentElement);
		}
	}
	static void logic2(String currentElement) {
		if(currentElement.endsWith("kumar")) {
			System.out.println("Dr "+currentElement);
		}
	}
}
