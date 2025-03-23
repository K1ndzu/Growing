package desk;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Gui {
	String Country;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(new GridBagLayout());
	JLabel labelus = new JLabel("US DOLLAR");
	JLabel labelbr = new JLabel("Reais Brasileiros");
	
	JTextField begin = new JTextField(10);
	JTextField lastly = new JTextField(10);
	
	
	void setup() {
		// frame and Gui.
		lastly.setEditable(false);
		GridBagConstraints gridSetup = new GridBagConstraints();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Converter");
		frame.setResizable(false);
		panel.setBackground(Color.decode("#F5DEB3"));
		//Grid
		gridSetup.insets = new Insets(10,10,10,10);
		panel.add(begin, gridSetup);
		gridSetup.gridx = 1;
		panel.add(lastly, gridSetup);
		gridSetup.gridx = 0;
		gridSetup.gridy = 2;
		panel.add(labelus, gridSetup);
		gridSetup.gridx = 1;
		panel.add(labelbr, gridSetup);
		
		
		frame.add(panel);
		begin.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char numb = e.getKeyChar();
				if (numb < '0' || numb > '9') {
					e.consume();
				}else {
					String text = begin.getText() + numb;
					
					Float x = (float) (Float.valueOf(text) * 5.76);
					
					lastly.setText(String.valueOf(x));
				}
			}
		});
		
		
		
		frame.setVisible(true);
		
	}


	
	
	
	
	
	
}

