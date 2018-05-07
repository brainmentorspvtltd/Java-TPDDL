
public class BeSpecific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int x = 100/0;
		int y [] = new int[10];
		y[20] = 100;
		String a = null;
		a.length();
		}
		catch(ArithmeticException e) {
			// Dialog Box
			// logs
			//System.out.println("");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		catch(NullPointerException e) {
			
		}
		catch(Exception e) {
			
		}
		

	}

}
