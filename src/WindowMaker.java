import java.awt.*;
import javax.swing.*;
public class WindowMaker {
	private static void openWindow(){
		JFrame frame = new JFrame("My Awesome Window");//sets up a window
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ends the program when you close the window
	       JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);//puts some text in the window
	       textLabel.setPreferredSize(new Dimension(300, 100)); 
	       frame.getContentPane().add(textLabel, BorderLayout.CENTER); 
	       //Display the window. 
	       frame.setLocationRelativeTo(null); 
	       frame.pack();
	       frame.setVisible(true); 
	    }
	}