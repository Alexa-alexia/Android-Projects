package views;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class studentLogin extends loginForm{
	
	public studentLogin() {
		super();
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==OK) {
			String password="hello";
			if(Password.getText().equals("")||UserName.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"Password or UserName not Set");
			}
			
			else if(Password.getText().equals("hello")) {
				//At this point the user has entered the correct password.
				 StudentView std=new StudentView();
				 std.setTitle("STUDENT PORTAL");
				 std.setVisible(true);
				
			}
			else {
				JOptionPane.showMessageDialog(null,"You entered the WRONG password");
			
			}
			
		}
		else if(evt.getSource()==CANCEL) {
			///REQUIRED TO GET THE ROOTPANE .
			JButton clicked=(JButton) evt.getSource();
			JRootPane root=(JRootPane) clicked.getRootPane();
			JFrame frame=(JFrame) root.getParent();
			
			frame.setVisible(false);
			
			//re- create an instance of the home page for navigability.
			views.HomePage homepage=new views.HomePage();
			homepage.setVisible(true); // this is happens when the user cancels a login operation he should navigate backwards.
			
			
		}
		
		else if(evt.getSource()==showPassword) {
			
			if(showPassword.isSelected()) {
				Password.setEchoChar((char)0);
			}
			
			else {
				Password.setEchoChar('*');
			}
		}
		else if(evt.getSource()==RESET) {
			Password.setText("");
			UserName.setText("");
		}
		
	}
	

}
