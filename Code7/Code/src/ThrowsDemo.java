import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;
class Util{
	static String StdOutToFile(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}
}
class Flow{
	Logger logger = Logger.getLogger(Flow.class);
	void view() {
		logger.debug("Inside View Function .....");
		System.out.println("Take Input");
		try {
		helper();
		System.out.println("Print Output");
		}
		catch(FileNotFoundException e) {
			System.out.println("Some Problem Occur "+e);
			logger.error(Util.StdOutToFile(e));
			//e.printStackTrace();
			logger.error("Inside View Catch "+e);
		}
		logger.debug("End of View Function... ");
	}
	void helper() throws FileNotFoundException{
		logger.debug("Inside Helper....");
		System.out.println("Logic  Start");
		dao();
		System.out.println("Logic End")
		;
		logger.debug(" Helper Ends....");
	}
	void dao() throws FileNotFoundException{
		logger.debug("Inside DAO....");
		try {
		System.out.println("Connection Open");
//		if(10>2) {
//		//System.exit(0);
//			return;
//		}
		FileInputStream fs = new FileInputStream("abcd.txt");
		//int x = 100/0; // throw new ArithmeticException()
		System.out.println("Query");
		System.out.println("get result");
		}
		finally {
		System.out.println("Connection Close");
		}
		System.out.println("Never Run..");
		logger.debug(" DAO ENDS....");
	}
}
public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setOut(new PrintStream("/Users/amit/Documents/logs/abcd.log"));
		Flow flow = new Flow();
		flow.view();
		
		

	}

}
