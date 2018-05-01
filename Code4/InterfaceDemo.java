// 100 % Abstract before Java 8
interface IPlayer{  // abstract interface IPlayer
	int MIN_POWER = 10; //public static final int MIN_POWER = 10;
	int MAX_POWER = 50;
	void run(); // public abstract void run();
	void jump();
	void attack();
	void increasePower();
	void loadPlayer();
}
interface StarPlayer{
	int MIN_POWER = 20;
	void extraEnergy();
	void loadPlayer();
}
class PowerPlayer implements IPlayer, StarPlayer{
	int power;
	PowerPlayer(){
		power = IPlayer.MIN_POWER ;
	}
	public void increasePower() {
		if(power<MAX_POWER) {
		power++;
		}
	}
	@Override
	public void run() {
		System.out.println("Run Hard");
	}
	@Override
	public  void jump() {
		System.out.println("Jump Hard");
	}
	@Override
	public void attack() {
		System.out.println("Attack Hard");
	}
	void morePower() {
		
	}
	@Override
	public void extraEnergy() {
		// TODO Auto-generated method stub
		System.out.println("Extra Energy for this Player...");
	}
	@Override
	public void loadPlayer() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
