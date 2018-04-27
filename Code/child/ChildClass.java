package child;

import parent.MyParentClass;

public class ChildClass extends MyParentClass {
	void show() {
		System.out.println(super.x);
		
	}
public static void main(String[] args) {
	ChildClass obj = new ChildClass();
	obj.show();
	
	//System.out.println(obj.x);
	
}
}
