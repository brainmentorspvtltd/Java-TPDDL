import java.util.ArrayList;
import java.util.HashMap;

class Person{
	String name;
	String phone;
	Person(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
}

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Person> map = new HashMap<>();
		map.put(1, new Person("Ram","2222"));
		map.put(2, new Person("Ram","3333"));
		System.out.println(map);
		
		HashMap<String,ArrayList<Integer>> phoneMap = new HashMap<>();
		ArrayList<Integer> ramPhones = new ArrayList<>();
		ramPhones.add(1111);
		ramPhones.add(2111);
		ramPhones.add(3111);
		ramPhones.add(4111);
		phoneMap.put("ram", ramPhones);
		phoneMap.get("ram").get(0);
//		phoneMap.put("shyam",3333);
//		phoneMap.put("amit",4444);
//		phoneMap.put("ram", 5222);
		System.out.println(phoneMap);
		System.out.println(phoneMap.get("ram"));
		phoneMap.remove("ram");
		

	}

}
