import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Windows crashed");
		
		
		
		String name=JOptionPane.showInputDialog("what are thou name");
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		JOptionPane.showInputDialog(null, "What is your favorite color "+name);
	}
}
