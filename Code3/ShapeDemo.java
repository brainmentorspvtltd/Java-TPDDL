class Shape{
	int l, b;
	void area() {
		System.out.println("Generic....");
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
class Rect extends Shape{
	Rect(int l , int b){
		this.l  = l;
		this.b = b;
	}
	@Override
	void area() {
		System.out.println("Rect Area "+(l*b));
	}
}
class Square extends Shape{
	Square(int l , int b){
		this.l  = l;
		this.b = b;
	}
	@Override
	void area() {
		System.out.println("Square Area" + (l*l));
	}
}
class Drawing{
	void draw(Shape shape) {
		shape.area();
	}
}
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Shape();
//		s.setL(2);
//		s.setB(2);
		Drawing d = new Drawing();
		d.draw(new Rect(2,2));
		d.draw(new Square(3,3));
		
	}

}
