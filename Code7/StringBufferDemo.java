
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		synchronized(sb) {
		//StringBuffer sb = new StringBuffer();
		sb.append("Amit");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("hkjdhghghghgsjhgjdhjfjkhdjfkghkjdhgjkhdkgjhkdhgkdhgkjdjkgdh");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		}
		/*sb.insert(1, "AA");
		sb.deleteCharAt(0);
		sb.delete(0, 5);
		sb.reverse();*/
		
		
		

	}

}
