import javax.swing.JOptionPane;
/**
*This program asks user to create a Name and Password, asks for them, then authenticates both.
*/
public class FlowChart {
	public static void main(String [] args) { 
		String Username = JOptionPane.showInputDialog(null, "Please create a username.");
		String Password = JOptionPane.showInputDialog(null, "Please create a password.");

		String UsernameTry = JOptionPane.showInputDialog(null, "Please enter your username.");
		String PasswordTry = JOptionPane.showInputDialog(null, "Please enter your password.");

		if (Username.equals(UsernameTry) && Password.equals(PasswordTry)) {
			System.out.println("Hello " + Username + "!");
		} else {
			System.out.println("Wrong Username or Password!");
		}
		/*Pseudocode:
		*PROMPT and Read Username Creation
		*PROMPT and Read Password Creation
		*PROMPT and Read Username Input
		*PROMPT and Read Password Input
		*IF Input Username and Password matches original 
		*DISPLAY "Hello" + Username
		*ELSE 
		*DISPLAY "Wrong Username or Password!"
		*/
	}
}
