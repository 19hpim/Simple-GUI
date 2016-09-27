package net.codeJava.swing;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class OutputStuff extends OutputStream{
	private JTextArea textArea;
    public OutputStuff(JTextArea textArea) {
        this.textArea = textArea;
    }
    public void write(int b) throws IOException {
        // redirects data to the text area
        textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
    public static void openWindow(){
		JFrame frame = new JFrame("My Awesome Window");//sets up a window
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ends the program when you close the window
	       //makes stuff to put in the window
	       JTextArea textArea = new JTextArea(20, 50);
	       JTextField field = new JTextField();
	       //does stuff when the enter key is pressed in the JTextField
	       Action enter = new AbstractAction(){
	     	   @Override
	     	   public void actionPerformed(ActionEvent e){
	     	   System.out.println("Enter was hit.");
	     	   }
	        };
	       field.addActionListener(enter);
	       //routes output to the window instead of the command line 
			PrintStream printStream = new PrintStream(new OutputStuff(textArea));
			System.setOut(printStream);
			System.setErr(printStream);
			//puts the JTextArea and JTextField in the window
	       frame.getContentPane().add(textArea, BorderLayout.CENTER);
	       frame.getContentPane().add(field, BorderLayout.SOUTH);
	       //Display the window. 
	       frame.setLocationRelativeTo(null); 
	       frame.pack();
	       frame.setVisible(true); 
	    }
    }