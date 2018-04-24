import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// c:\\abcd\\xyz.txt
		String path = "/Users/amit/Documents/Java-TataPowers/JavaBasics/src/WordCount.java";
		int wordCount = 0;
		File file  = new File(path);
		Scanner s = new Scanner(file);
		//Scanner s = new Scanner("Hello How are You\n I am Fine");
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
			wordCount++;
		}
		System.out.println("Total Lines are "+wordCount);
		s.close();
	}

}
