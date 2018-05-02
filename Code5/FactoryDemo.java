import java.util.ResourceBundle;

import factorydemo.IProducer;




class Factory{
	private Factory() {
		
	}
	public static IProducer getObject() {
		ResourceBundle r = ResourceBundle.getBundle("config");
		String className = r.getString("classname");
		Object object = null;
		try {
			object = Class.forName(className).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//IProducer p = new Producer();
		return (IProducer)object;
	}
}
class Consumer{
	void callProducer() {
		//Producer p = new Producer(); // BAD
		//IProducer p = new Producer();
		IProducer p = Factory.getObject();
		p.talk();
		//p.dontTalk();
	}
}
public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer c = new Consumer();
		c.callProducer();
		

	}

}
