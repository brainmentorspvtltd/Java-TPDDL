import java.util.HashSet;

class Book{
	int id ;
	String name;
	String author;
	double price;
	String pub;
	Book(int id , String name, String author, double price, String pub){
		this.id = id;
		this.name  = name;
		this.author = author;
		this.price = price;
		this.pub  = pub;
		
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof Book) {
			Book book = (Book) object;
			if(book.id == this.id 
					&& book.name.equals(this.name) 
					&& this.author.equals(book.author)
					&& this.pub.equals(book.pub)
					&& this.price==book.price) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
//		if(author.contains("ram")) {
//			return 10;
//		}
//		if(author.equals("ram")) {
//			return 10;
//		}
//		else
//		{
//			return 20;
//		}
		return author.length() ;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", pub=" + pub + "]\n";
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		HashSet<Book> bookSet = new HashSet<>();
		Book b = new Book(10,"Let Us C","Yashwant",90,"Abc");
		System.out.println(b.hashCode()); 
		
		bookSet.add(b);
		Book b1 = new Book(10,"Let Us C","Yashwant",90,"Abc");
		System.out.println(b1.hashCode());
		bookSet.add(b1);
		bookSet.add(new Book(12,"Let Us C","Yashwant",90,"Abc"));
		
		System.out.println(bookSet);
		

	}

}
