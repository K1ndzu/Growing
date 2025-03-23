package time;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame{
	Calendar calendar;
	JLabel timeLabel = new JLabel();
	JLabel dateLabel = new JLabel();
	JLabel dayLabel = new JLabel();
	SimpleDateFormat dateFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat timeFormat;
	String time;
	String date;
	String day;
	MyFrame(){
	// here for Time
	timeFormat = new SimpleDateFormat("hh:mm:ss a");
	timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
	timeLabel.setBackground(Color.black);
	timeLabel.setForeground(new Color(0xff0000));
	timeLabel.setOpaque(true);
	this.add(timeLabel);
	//Here for Date
	dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	dateLabel.setFont(new Font("Verdana", Font.PLAIN, 40));
	dateLabel.setBackground(Color.black);
	dateLabel.setForeground(new Color(0xff0000));
	dateLabel.setOpaque(true);
	this.add(dateLabel);
	//here for day
	dayFormat = new SimpleDateFormat("EEEE");
	dayLabel.setFont(new Font("Verdana", Font.PLAIN, 40));
	dayLabel.setBackground(Color.black);
	dayLabel.setForeground(new Color(0xff0000));
	dayLabel.setOpaque(true);
	this.add(dayLabel);
	//layout of frame
	this.setLayout(new FlowLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Clock");
	this.setSize(350, 300);
	this.setResizable(false);
	this.setVisible(true);
	
	updateTime();
	}
	
	public void updateTime() {
		while(true) {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	
}
