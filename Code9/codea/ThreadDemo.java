class Logic{
	int counter;
	static int counter2;
	void logic(){
		for(int i = 1; i<=5; i++,counter++){
			System.out.println("I is "+i+" "+Thread.currentThread().getName()+" "+counter);
		}
	}
	static void logic2(){
		for(int i = 1; i<=5; i++,counter2++){
			System.out.println("I is "+i+" "+Thread.currentThread().getName()+" "+counter2);
		}
	}
}
class Job implements Runnable{
	Logic logic = new Logic();
	//int counter;
	@Override
	//public synchronized  void run(){
	public   void run(){
		// Job Logic
		System.out.println("Job Start "+Thread.currentThread().getName());
		// Object Level Lock
		synchronized (logic) {
			logic.logic(); // Synch
		}
		// Class Level Lock
		synchronized (Logic.class) {
			Logic.logic2();
		}
		//logic.logic(); // Not Synch
		//synchronized(this){
//		for(int i = 1; i<=5; i++,counter++){
//			System.out.println("I is "+i+" "+Thread.currentThread().getName()+" "+counter);
//		}
		//}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Job job = new Job();
		Thread worker = new Thread(job,"ram");
		//Job job2 = new Job();
		
		Thread worker2 = new Thread(job,"shyam");
		//Job job3 = new Job();
		Thread worker3 = new Thread(job,"mike");
		worker.setPriority(Thread.MAX_PRIORITY);
		worker2.setPriority(Thread.MIN_PRIORITY);
		worker3.setPriority(Thread.NORM_PRIORITY);
		worker.start();  // Runnable Mode
		//worker.join();
		worker2.start();
		worker3.start();
		for(int i = 1; i<=5; i++){
			System.out.println(i+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}

	}

}
