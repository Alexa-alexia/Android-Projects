package views;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class loginForm extends JFrame implements ActionListener {
	//seting the frame properties.
	public final int HEIGHT=300;
	public final int WIDTH=400;
	public  JButton OK,CANCEL,RESET;
	public  TextField UserName;
	public JPasswordField Password;
	public JCheckBox showPassword;
	public  JLabel nameArea;
	public JLabel passwordArea;
	 
	
	
	public loginForm() {
		//creating an instance of the eventHandler object.
		
		 
		
		//dimensions of the frame are set.
		this.setSize(WIDTH,HEIGHT);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		this.setTitle("LOGIN DIALOG");	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//getting the contentpane of the frame here we may add elements to the frame.
		Container contentPane=this.getContentPane();
		
		//creating a pane of the the Label Area.
		JPanel toppanel=new JPanel(new BorderLayout(1,5));
		 
		//creating a textarea and assigning it to the top panel.
		this.nameArea=new JLabel("UserName");
		this.UserName=new TextField(10);
		
		// a textfield of 10 columns.
		JPanel userpanel=new JPanel();
		
		userpanel.add(this.nameArea);
		userpanel.add(this.UserName);
		userpanel.setToolTipText("Enter Your UserName");
		
		
		this.Password=new JPasswordField(10);
		this.passwordArea=new JLabel("Password");
		
		JPanel password=new JPanel();
		password.add(this.passwordArea);
		password.add(this.Password);
		password.setToolTipText("Enter Your Password");
		
		 
		toppanel.add(userpanel,BorderLayout.CENTER);
		toppanel.add(password,BorderLayout.SOUTH);
		//creating objects and associating them with the respective ActionListeners.
		
		JPanel ButtonArea=new JPanel(new FlowLayout());
		this.OK=new JButton("OK");
		this.OK.addActionListener(this);
		
		this.CANCEL=new JButton("CANCEL");
		this.CANCEL.addActionListener(this);
		
		this.RESET=new JButton("RESET");
		this.RESET.addActionListener(this);
		
		this.showPassword=new JCheckBox("Show Password");
		this.showPassword.addActionListener(this);
		ButtonArea.add(this.OK);
		ButtonArea.add(this.CANCEL);
		ButtonArea.add(this.RESET);
		ButtonArea.add(this.showPassword);
		
		//Adding the toppanel to the ContentPane.
		contentPane.add(toppanel,BorderLayout.NORTH);
		contentPane.add(ButtonArea,BorderLayout.EAST);
		
		
	}
	
	public static void main(String[]args) {
		//creating an instance of the login form and setting it to visible foe view purposes.
		
		loginForm one=new loginForm();
		one.setVisible(true);
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
