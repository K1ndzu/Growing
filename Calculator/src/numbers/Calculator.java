package numbers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
	JFrame frame;
	JButton[] numbersButtons;
	JButton divButton, multButton, minusButton, plusButton;
	JButton delButton, clrButton, dotButton, equButton;
	JButton[] operatorButtons;
	JPanel panel;
	JTextField textfield;
	double num1=0, num2=0, result=0;
	char operator;
	Boolean stop = false;
	Font MyFont = new Font("Arial", Font.PLAIN, 30);
	
	Calculator(){
		// frame
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setResizable(false);
		
		frame.setLayout(null);
		
		// textField
		textfield = new JTextField();
		textfield.setFont(MyFont);
		textfield.setEditable(false);
		textfield.setBounds(50, 25, 300, 50);
		
		
		// operator buttons
		operatorButtons = new JButton[8];
		divButton = new JButton("/");
		multButton = new JButton("*");
		plusButton = new JButton("+");
		minusButton = new JButton("-");
		dotButton = new JButton(".");
		clrButton = new JButton("Clear");
		delButton = new JButton("Delete");
		equButton = new JButton("=");
		operatorButtons[0] = plusButton;
		operatorButtons[1] = minusButton;
		operatorButtons[2] = multButton;
		operatorButtons[3] = divButton;
		operatorButtons[4] = dotButton;
		operatorButtons[5] = equButton;
		operatorButtons[6] = delButton;
		operatorButtons[7] = clrButton;
		for (int i=0; i<operatorButtons.length;i++) {
			operatorButtons[i].addActionListener(this);
			operatorButtons[i].setFont(MyFont);

		}
		// numberButtons
		numbersButtons = new JButton[10];
		for (int i=0; i<10;i++) {
			numbersButtons[i] = new JButton(String.valueOf(i));
			numbersButtons[i].addActionListener(this);
			numbersButtons[i].setFont(MyFont);
			numbersButtons[i].setFocusable(false);
		}
		delButton.setBounds(50,430,145,50);
		clrButton.setBounds(205,430,145,50);
		// panel
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4));
		panel.setBackground(Color.gray);
		panel.add(numbersButtons[1]);
		panel.add(numbersButtons[2]);
		panel.add(numbersButtons[3]);
		panel.add(plusButton);
		panel.add(numbersButtons[4]);
		panel.add(numbersButtons[5]);
		panel.add(numbersButtons[6]);
		panel.add(minusButton);
		panel.add(numbersButtons[7]);
		panel.add(numbersButtons[8]);
		panel.add(numbersButtons[9]);
		panel.add(multButton);
		panel.add(dotButton);
		panel.add(numbersButtons[0]);
		panel.add(divButton);
		panel.add(equButton);
		
		//calculate
		
		

		
		
		// add frame
		frame.add(panel);
		frame.add(textfield);
		frame.add(clrButton);
		frame.add(delButton);
		frame.setVisible(true);
		
	
		
		
	}

	
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i<10; i++) {
			if (e.getSource() == numbersButtons[i] && stop == false) {
			textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}	
		}
			if (e.getSource() == dotButton) {
				textfield.setText(textfield.getText().concat(String.valueOf(".")));
				
				}	
			if (e.getSource() == plusButton) {
				textfield.setText(textfield.getText());
				num1 = Double.parseDouble(textfield.getText());
				operator = '+';
				stop = false;
				textfield.setText("");
				}	
			if (e.getSource() == minusButton) {
				textfield.setText(textfield.getText());
				num1 = Double.parseDouble(textfield.getText());
				operator = '-';
				stop = false;
				textfield.setText("");
				}	
			if (e.getSource() == multButton) {
				textfield.setText(textfield.getText());
				num1 = Double.parseDouble(textfield.getText());
				operator = '*';
				stop = false;
				textfield.setText("");
				}	
			if (e.getSource() == divButton) {
				textfield.setText(textfield.getText());
				num1 = Double.parseDouble(textfield.getText());
				operator = '/';
				stop = false;
				textfield.setText("");
				}	
			if (e.getSource() == equButton) {
				num2 = Double.parseDouble(textfield.getText());
				
				switch (operator) {
				
				case '+':
					result = num1 + num2;
					textfield.setText(String.valueOf(result));
					stop = true;
					num1 = result;
					break;
				case '-':
					result = num1 - num2;
					textfield.setText(String.valueOf(result));
					stop = true;
					num1 = result;
					break;

				case '*':
					result = num1 * num2;
					textfield.setText(String.valueOf(result));
					stop = true;
					num1 = result;
					break;

				case '/':
					result = num1 / num2;
					textfield.setText(String.valueOf(result));
					stop = true;
					num1 = result;
					break;
				}
			}
			if (e.getSource() == clrButton) {
				textfield.setText("");
				stop = false;
			}
			if (e.getSource() == delButton) {
				String string = textfield.getText();
				textfield.setText("");
				for (int i = 0; i<string.length()-1; i++ ) {
					textfield.setText(textfield.getText()+string.charAt(i));
				}				
				
			}
			
	}
}
	
	
	
	

