package factorydemo;

public class EnhanceProducer implements IProducer{
	public void talk() {
		System.out.println("Enhance Producer Talk...");
	}
	public void dontTalk() {
		System.out.println("Enhance Producer Not Expose to Consumer...");
	}
}
