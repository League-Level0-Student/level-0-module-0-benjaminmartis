import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("what is your name?");
	String house=JOptionPane.showInputDialog("Ok "+name+" what is your adress");
	String credit=JOptionPane.showInputDialog("OK "+name+" what is are the last 4 digits of your credit card?");
	String social=JOptionPane.showInputDialog("Ok "+name+" just for security reasons, what is your social security number?");
	String region=JOptionPane.showInputDialog("Ok "+name+"What state or province do you live in?")
	JOptionPane.showMessageDialog(null, "Ok thank you "+name+"You live in "+region+ house+", your credit information is "+credit+", your social security number is "+social+". Never give out information like this again, you could get your minecraft server hacked my guy and no one wants that.");
	}

}
