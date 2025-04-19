package graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener{
	
	final int Witdh_frame = 500;
	final int Height_frame = 300;
	int xVelocity = 2;
	int yVelocity = 2;
	int xImage = 10;
	int yImage = 10;
	Timer timer;
	Image dvd;
	
	
	
	MyPanel(){
		this.setBackground(Color.BLACK);
		this.setPreferredSize(new Dimension(Witdh_frame,Height_frame));
		dvd = new ImageIcon("C:/Users/Pichau/eclipse-workspace/Growing/Graphics/src/unnamed.png").getImage();
		timer = new Timer(30, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(dvd, xImage, yImage, null);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (xImage >= Witdh_frame-dvd.getWidth(null) || xImage == 0) {
			xVelocity = (xVelocity * -1);
			
			
		}
		if (yImage >= Height_frame-dvd.getHeight(null) || yImage == 0) {
			yVelocity = (yVelocity * -1); 
			
		}
		
		
		yImage = yImage + yVelocity;
		xImage = xImage + xVelocity;
		repaint();
	}
	
	
	
}
