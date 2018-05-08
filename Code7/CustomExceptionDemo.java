import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class MinorAgeException extends Exception{
	private int age;
	private String message;
	private int errorCode;
	MinorAgeException(){
		
	}
	MinorAgeException(int errorCode, String message, int age){
		this.errorCode = errorCode;
		this.message = message;
		this.age = age;
	}
	MinorAgeException(int age){
		this.age = age;
	}
	MinorAgeException(String message){
		this.message = message;
	}
	MinorAgeException(String message, int age){
		this.message = message;
		this.age = age;
	}
	public String toString() {
		return (errorCode==0?"":errorCode)+(message==null?"Under Age ":message)+(age>0?age:"");
	}
}

class CustomExceptionDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fs = new FileInputStream("abcd.txt")){
			
		}
		catch(IOException e) {
			
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = s.nextInt();
		try {
		if(age<18) {
			throw new MinorAgeException(100,"My Custom Message",age);
		}
		System.out.println("Apply For DL");
		}
		catch(MinorAgeException e) {
			System.out.println(e);  // e.toString();
			//System.out.println("Under Age "+e.toString());
		}

	}

}
