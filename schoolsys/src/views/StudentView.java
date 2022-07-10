package views;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StudentView extends JFrame {
	private JButton ShowTimeTable,MakeComplaint,ShowResults;
	private JPanel ButtonPanel;
	private Container contentPane;
	private final int WIDTH=500;
	private final int HEIGHT=500;
	
	
	
	public StudentView() {
		//initializing the contentPane
		this.contentPane=this.getContentPane();
		
		//setting dimensions of the window.		
		this.setLocationRelativeTo(null);
		this.setSize(WIDTH,HEIGHT);
		
		//setting the layout of the window
		this.setLayout(new BorderLayout());
		
		//setting default close operation
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//initializing the components of the window.
		this.ShowTimeTable=new JButton("SHOW TIMETABLE");
		this.MakeComplaint=new JButton("MAKE COMPLAINT");
		this.ShowResults=new JButton("SHOW RESULTS");
		
		
		
		//adding all the elements to the frame window.
		this.ButtonPanel=new JPanel(new BorderLayout());
		this.ButtonPanel.setSize(250,100);
		
		this.ButtonPanel.add(this.ShowTimeTable,BorderLayout.NORTH);
		this.ButtonPanel.add(this.MakeComplaint,BorderLayout.CENTER);
		this.ButtonPanel.add(this.ShowResults,BorderLayout.SOUTH);
		
		//adding the button panel to the content pane
		this.contentPane.add(this.ButtonPanel,BorderLayout.NORTH);
	}
	public static void main(String [] args) {
		StudentView n=new StudentView();
		n.setTitle("STUDENT PORTAL ");
		n.setVisible(true);
	}

}
