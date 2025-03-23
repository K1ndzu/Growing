package Defalt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
/* I need to make a frame window, that i input password
 * and can make 4 task 
 * 1. deposit; 2.withdraw; 3. change password; 4.show balance
 * i need in first, make the frame, and put some attributes
 * i need to refresh the cardlayout
 * 
 * 
 */

public class Banking {
	
	
	JLabel balance;
	Double Balance = 100.0;
	CardLayout cardLayout = new CardLayout();
	JFrame frame; 
	String Password = "";
	Font MyFont = new Font("Arial", Font.PLAIN, 18);
	//JPanels
	JPanel switcher = new JPanel(cardLayout);
	JPanel panelPass = new JPanel(new GridBagLayout()); // Creating a panel with layout of GridBag.
	JPanel panelMenu = new JPanel(new GridBagLayout());
	JPanel panelDraw = new JPanel(new GridBagLayout());
	JPanel panelPosit = new JPanel(new GridBagLayout());
	JPanel panelProfile = new JPanel(new GridBagLayout());
	
	
	
	public Banking() {
		
		frame = new JFrame();// frame attributes
		frame.add(switcher);
		frame.setSize(400,400);
		frame.setTitle("Banking");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		cardLayout.show(switcher, "Password");
		
		balance = new JLabel("The Balance is $" + String.format("%.2f", Balance));
		balance.setFont(MyFont);
		balance.setBackground(new Color(0xead8b1));
		balance.setOpaque(true);
		
		password();
		menu();
		withdraw(balance);
		deposit(balance);
	}
	void updateBalance(JLabel balance) {
		balance.setText("The Balance is $" + String.format("%.2f", Balance));
	}
	
	void menu() {
		
		JButton[] buttonsMenu = new JButton[4];
		panelMenu.setBackground(new Color(29, 132, 181));
		GridBagConstraints gridMenu = new GridBagConstraints();
		
		// Creating the buttons
		buttonsMenu[0] = new JButton("Withdraw");
		buttonsMenu[1] = new JButton("Deposit");
		buttonsMenu[2] = new JButton("Balance");
		buttonsMenu[3] = new JButton("Profile");
		for (int i = 0; i<buttonsMenu.length; i++) {
			gridMenu.gridx = 0;
			gridMenu.gridy = i;
			gridMenu.insets = new Insets(10,10,10,10);
			panelMenu.add(buttonsMenu[i], gridMenu);	
		}
		
		// checker of buttons
		buttonsMenu[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				cardLayout.show(switcher, "Withdraw");
				}
		});
		buttonsMenu[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(switcher, "Deposit");
				}
		});
		buttonsMenu[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				JOptionPane.showMessageDialog(frame, Balance);
				}
		});
		
		
		
		
		switcher.add(panelMenu, "Menu");
	}
	void withdraw(JLabel balanceDraw) {
		panelDraw.add(balanceDraw);
		updateBalance(balanceDraw);
		JButton submit = new JButton("SUBMIT");
		JLabel quest = new JLabel("What amount you want to Withdraw?");
		
		quest.setBackground(new Color(0xead8b1));
		quest.setOpaque(true);
		quest.setFont(MyFont); 
		panelDraw.setBackground(new Color(0x3a6d8c));
		
		GridBagConstraints gridDraw = new GridBagConstraints();
		
		gridDraw.insets = new Insets(10,20,10,10);
		gridDraw.gridx = 0;
		gridDraw.gridy = 0;
		panelDraw.add(quest,gridDraw);
		gridDraw.gridy = 1;
		JTextField textWithdraw = new JTextField(10);
		panelDraw.add(textWithdraw,gridDraw);
		gridDraw.gridy = 2;
		panelDraw.add(submit,gridDraw);
		gridDraw.gridy = 3;
		
		panelDraw.add(balanceDraw,gridDraw);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eql = textWithdraw.getText();
				Double count = Double.valueOf(eql);
				if (count <= Balance && count>0) {
				Balance = Balance - count;
				JOptionPane.showMessageDialog(frame, "The Balance is $" + String.format("%.2f", Balance));
				textWithdraw.setText("");
				cardLayout.show(switcher, "Menu");
				panelDraw.remove(balanceDraw);
				}else {
					JOptionPane.showMessageDialog(frame, "Incorrect value");
				}
				}
				
			
		
		});
			
			
			
			
		
		
	
	switcher.add(panelDraw, "Withdraw");	
	}
	void deposit(JLabel balancePosit) {
		panelPosit.add(balancePosit);
		updateBalance(balancePosit);
		panelPosit.removeAll();
		JButton submit = new JButton("SUBMIT");
		JLabel amount = new JLabel("What amount you want to Deposit?");
		amount.setBackground(new Color(0xead8b1));
		amount.setOpaque(true);
		amount.setFont(MyFont);
		panelPosit.setBackground(new Color(0x3a6d8c));
		
		GridBagConstraints gridPosit = new GridBagConstraints();
		gridPosit.insets = new Insets(10,20,10,10);
		gridPosit.gridx = 0;
		gridPosit.gridy = 0;
		panelPosit.add(amount,gridPosit);
		gridPosit.gridy = 1;
		JTextField textDeposit = new JTextField(10);
		panelPosit.add(textDeposit,gridPosit);
		gridPosit.gridy = 2;
		panelPosit.add(submit,gridPosit);
		gridPosit.gridy = 3;
		panelPosit.add(balancePosit,gridPosit);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eql = textDeposit.getText();
				Double count = Double.valueOf(eql);
				if (count > 0) {
					Balance = Balance + count;
					JOptionPane.showMessageDialog(frame,"The Balance is $" + String.format("%.2f", Balance));
					textDeposit.setText("");
					cardLayout.show(switcher, "Menu");
					panelPosit.remove(balancePosit);
					}else {
						JOptionPane.showMessageDialog(frame, "Incorrect value");
				
				}
				
			}
		
		});
			
			
			
			
		
		
	
	switcher.add(panelPosit, "Deposit");	
	}
	void profile() {
		
	}
	
	
	
	
	
	void password() {
		
		
		panelPass.setBackground(new Color(19, 38, 47)); // for change color of panel
		
		GridBagConstraints gbc = new GridBagConstraints(); //here is the declaration of the settings of grid
		JLabel labelPassword = new JLabel("Please, put your Password"); // label for pop-up the message
		labelPassword.setOpaque(false);
		labelPassword.setForeground(Color.white);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.PAGE_START;
		labelPassword.setFont(MyFont);
		panelPass.add(labelPassword, gbc);
		
		gbc.anchor = GridBagConstraints.CENTER;
		JPasswordField textPassword = new JPasswordField(10);
		textPassword.setFont(MyFont);
		JButton CheckButton = new JButton("SUBMIT");
		
		gbc.gridy = 1;
		gbc.insets = new Insets(10,10,10,10);
		panelPass.add(textPassword, gbc);
		
		gbc.gridy = 2;
		panelPass.add(CheckButton, gbc);
		switcher.add(panelPass, "Password");
		
		
		CheckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] ps = textPassword.getPassword();
				String pass = String.copyValueOf(ps);
				if (pass.equals(Password)) {
					cardLayout.show(switcher, "Menu");// with parameter, it'll appear in the center of this par..
				}else {
					JOptionPane.showMessageDialog(null,"Incorrect Password");
				}
				
			}
			
			
		});
		
	}
	
	
	
	
	public static void main(String[] args) {
		new Banking();
		
	}
	
	
}
