import javax.swing.JOptionPane;
import java.util.Random;

public class secretmessagebox {

	public static void main(String[] args) {
		 	String message = JOptionPane.showInputDialog("What's your secret message?");
		 	String pass= JOptionPane.showInputDialog("What are the password?");
		 	if (pass.equals("mr lumetta")) {
		 	JOptionPane.showMessageDialog(null, message);
		 	}else {
		 		JOptionPane.showMessageDialog(null, "HAHA! U get no cookies from our secret society.");
		 	}
	}
}
