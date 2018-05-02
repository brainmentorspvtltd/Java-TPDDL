package factorydemo;
public class Producer implements IProducer{
	public void talk() {
		System.out.println("Producer Talk...");
	}
	public void dontTalk() {
		System.out.println("Not Expose to Consumer...");
	}
}
