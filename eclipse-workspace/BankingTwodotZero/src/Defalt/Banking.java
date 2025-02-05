package Defalt;

import java.awt.Font;

import javax.swing.*;
import java.awt.*;
/* I need to make a frame window, that i input password
 * and can make 4 task 
 * 1. deposit; 2.withdraw; 3. change password; 4.show balance
 * i need in first, make the frame, and put some attributes
 * 
 * 
 * 
 */

public class Banking {

	JFrame frame; 
	JTextField textfield;
	void password() {
		JTextField textPassword = new JTextField();
		textPassword.setBounds(100,200,200,100);
		
	}
	
	
	void bank() {
	Font MyFont = new Font("Arial", Font.PLAIN, 50);
	frame = new JFrame();// frame attributes
	frame.setSize(400,400);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setResizable(false);
	password();
	JTextField textPassword = new JTextField();
	textPassword.setBounds(100, 200, 200, 80);
	textPassword.setFont(MyFont);
	frame.add(textPassword);
	
	}
	
	
	
	public static void main(String[] args) {
		Banking banks = new Banking();
		banks.bank();
	}
	
	
}
