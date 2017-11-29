import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("When is your birthday?");
		if(bday.equals("11/29")) {
			JOptionPane.showMessageDialog(null, "merry bday bb");
			
		}else {
			JOptionPane.showMessageDialog(null, " HEEEE HEEEE OOOOH HAAA HHHESH OOOF! HA! MERRY UNbirthday! ");
		}
	}

}
