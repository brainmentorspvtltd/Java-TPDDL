import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int[10];
		System.out.println(x.length);
		String name = "Ram";
		name  = "Ram Kumar";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println("      Amit     Srivastava       ".trim());
		int index = "ram".indexOf("a");
		"ramram".lastIndexOf("a");
		"amit".equals("amit");
		"amit".equalsIgnoreCase("AMIT");
		"amit".compareTo("Amit");
		"amit".compareToIgnoreCase("Amit");
		char arr [] = "amit".toCharArray();
		Arrays.sort(arr);
		String d = new String(arr);
		System.out.println(d);
		byte barr[] = "Amit".getBytes();
		"Ram Kumar".substring(1);
		System.out.println("Sub String "+"Ram Kumar".substring(1, 5));  // 1 index , 5 position
		"Ram".replace('a', 'e');
		char firstChar = "Ram".charAt(0);
		"Ram".concat("Kumar").concat("Delhi");
		String t = "Ram"+"Kumar"+"Delhi";
		boolean result = "Ram Kumar".endsWith("Kumar");
		result = "Ram Kumar".startsWith("Ram");
		result = "Ram Kumar".contains("am");
		result = "Ram".isEmpty();
		String addressArr[] = "A-19,Roop Nagar, Delhi-7".split(",");
		for(String add : addressArr) {
			System.out.println(add);
		}
		String e = String.valueOf(100);
		e = String.valueOf(true);
		e = String.valueOf(90.20); //"90.20"
		int w = 100;
		Integer ww = w;
		String ff = ww.toString();
				
		
	}

}
