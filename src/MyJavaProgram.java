import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot jakepaul=new Robot("vic");
		jakepaul.setSpeed(30);
		jakepaul.penDown();
		for (int i = 0; i < 4 ; i++) {
			jakepaul.move(200);
			jakepaul.turn(90);
			jakepaul.setRandomPenColor();

		}
		
	}
}
