package graphic;
import java.awt.*;
import java.util.Timer;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
	
	
		
		
		
		
	
	Main(){
		this.setTitle("DVD LOADING");
		MyPanel panel;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		panel = new MyPanel();
		this.setResizable(false);
		this.add(panel);
		
		this.setVisible(true);
		this.pack(); // pack because who is put the size will be panel
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Main();
		
	}
	
	
	
	
	
	
}