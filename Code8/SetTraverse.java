import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("ram", 2222);
		map.put("shyam", 3222);
		map.put("sohan", 4222);
		map.put("mohan", 5222);
		map.put("ramesh", 6222);
		if(map.containsKey("ram")) {
			map.put("ram", 99999);
		}
		
//		Set<String> keys = map.keySet();
//		Iterator<String> key= keys.iterator();
//		while(key.hasNext()) {
//			String currentKey = key.next();
//			System.out.println(currentKey+" "+map.get(currentKey));
//		}
		
		for(Map.Entry<String,Integer> m :map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(1);
		set.add(2);
		set.add(20);
		set.add(100);
		set.add(910);
		System.out.println(set.ceiling(21));  // >=
		System.out.println(set.floor(100));  //<=
		System.out.println(set.higher(20)); //>
		System.out.println(set.lower(100));  //<
		//System.out.println(set);
//		Iterator<Integer> i = set.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		for(Integer j:set) {
//			System.out.println(j);
//		}
		
		
	}

}
