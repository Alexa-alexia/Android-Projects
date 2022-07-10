package views;

import javax.imageio.ImageIO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import views.loginForm;




public class HomePage extends JFrame implements ActionListener  {
	//setting dimensions of the frame.
	//public final int X_OFFSET=;
	//public final int Y_OFFSET=;
	public final int WIDTH=700;
	public final int HEIGHT=500;
	
	JButton STUDENT,ADMIN,HOD,STAFF,QUIT;
	
	public HomePage()  {
		//this is the constructor class setting all frame settings and configurations
		
		setSize(WIDTH,HEIGHT);
		setLocationRelativeTo(null);
		
		setTitle("HOME");
		setLayout(new BorderLayout());
		
		//getting the content pane of the frame.
		Container contentPane=this.getContentPane();
		
		//adding components to the frame and associating them with an action Listener.
		this.ADMIN=new JButton("LOG IN AS ADMN");
		this.ADMIN.addActionListener(this);
		
		this.STUDENT=new JButton("LOG IN AS STUDENT");
		this.STUDENT.addActionListener(this);
		
		this.STAFF=new JButton("LOG IN AS STAFF");
		this.STAFF.addActionListener(this);
		
		this.HOD=new JButton("LOG IN AS HOD");
		this.HOD.addActionListener(this);
		
		this.QUIT=new JButton("QUIT");
		this.QUIT.addActionListener(this);
		
		 
		JLabel imageArea=new JLabel(new ImageIcon("C:\\Users\\HP\\Desktop\\SOEN200_13\\canvas.jpg"));
		imageArea.setSize(700,400);
		
		
		
	
		
		
		//Creating a navigation menu panel to hold the above buttons.
		
		JPanel nav=new JPanel(new FlowLayout());
		nav.add(this.ADMIN);
		nav.add(this.STUDENT);
		nav.add(this.STAFF);
		nav.add(this.HOD);
		nav.add(this.QUIT);
		nav.setToolTipText("This is The Navigation Bar");
		nav.setBackground(Color.black);
		nav.setBorder(BorderFactory.createBevelBorder(23, Color.blue,Color.white));
		
		
		//adding the panel to he content pane
		
		contentPane.add(nav,BorderLayout.NORTH);
		contentPane.add(imageArea,BorderLayout.SOUTH);
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		HomePage one= new HomePage();
		one.setVisible(true);
		
	}
	
	//Event Handler for all the classes.
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==ADMIN) {
			//create an instance of the form class and set it to visible.
			views.AdminLogin admnform=new views.AdminLogin();
			 
			admnform.setLocation(500,300);
			JButton frame=(JButton) evt.getSource();
			JRootPane root=(JRootPane) frame.getRootPane(); //Allowing us to get the rootpane of the frame.
			JFrame myframe=(JFrame) root.getParent();
			myframe.setVisible(false);
			
			admnform.setVisible(true);
			admnform.setTitle("ADMINISTRATOR LOGIN");
			
			
		}
		else if(evt.getSource()==STAFF) {
			
			views.staffLogin admnform=new views.staffLogin();
			
			admnform.setLocation(500,300);
			JButton frame=(JButton) evt.getSource();
			JRootPane root=(JRootPane) frame.getRootPane(); //Allowing us to get the rootpane of the frame.
			JFrame myframe=(JFrame) root.getParent();
			myframe.setVisible(false);
			
			admnform.setVisible(true);
			admnform.setTitle("STAFF LOGIN");
			
		}
		else if(evt.getSource()==STUDENT) {
			
			views.studentLogin  admnform=new views.studentLogin();
			
			admnform.setLocation(500,300);
			JButton frame=(JButton) evt.getSource();
			JRootPane root=(JRootPane) frame.getRootPane(); //Allowing us to get the rootpane of the frame.
			JFrame myframe=(JFrame) root.getParent();
			myframe.setVisible(false);
			
			admnform.setVisible(true);
			admnform.setTitle("STUDENT LOGIN");
			
		}
		else if(evt.getSource()==HOD) {
			
			 
			 
			 
			views.HODlogin adminform=new views.HODlogin();
			System.out.println("ADMN LOGIN");
			
			adminform.setLocation(500,300);
			JButton frame=(JButton) evt.getSource();
			JRootPane root=(JRootPane) frame.getRootPane(); //Allowing us to get the rootpane of the frame.
			JFrame myframe=(JFrame) root.getParent();
			myframe.setVisible(false);
			
			adminform.setVisible(true);
			adminform.setTitle("HOD LOGIN");
			
			
			
		}
		
		else if(evt.getSource()==QUIT) {
			//IF Quit is clicked the application should stop.
			
			 
			JButton frame=(JButton) evt.getSource();
			JRootPane root=(JRootPane) frame.getRootPane(); //Allowing us to get the rootpane of the frame.
			JFrame myframe=(JFrame) root.getParent();
			myframe.setVisible(false);
			System.exit(0);
			
			 
		}
	}

}






 