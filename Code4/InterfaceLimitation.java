import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface Card{
	void service();
	void applyForCard();
	void features();
}
abstract class CardAdapter implements Card{

	@Override
	public void service() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyForCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void features() {
		// TODO Auto-generated method stub
		
	}
	
}
class Silver extends CardAdapter{
	
}
class Gold extends CardAdapter{
	
}
class Diamond extends CardAdapter{
	
}
public class InterfaceLimitation {

	public static void main(String[] args) {
		WindowListener l;
		WindowAdapter q;
		// TODO Auto-generated method stub

	}

}
