class Driver{
	DashBoard car = new Car();
	void letsDrive() {
		car.race();
		//car.fuelInjection();
	}
}
interface DashBoard{
	void race();
}
class Car implements DashBoard{
public void fuelInjection() {	
	System.out.println("Do double the Race at 80 Speed...");
}
public void race() {
	fuelInjection();
}
}
public class AbstractionLevelOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
