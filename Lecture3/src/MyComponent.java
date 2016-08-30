import java.awt.Graphics;
import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	static int counter = 0;
	
	public void paintComponent (Graphics g) {
		
		Car firstCar = new Car(getWidth()-60,getHeight()-30);
		
		firstCar.draw(g);
		
		System.out.println(counter++);
	}
}
