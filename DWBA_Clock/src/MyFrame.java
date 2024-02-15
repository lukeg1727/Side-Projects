import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {

	JButton setGameTime;
	JButton resetGameTime;
	JButton setShotClockTime;
	JButton setShotClockShortTime;
	JButton resetShotClock;
	JButton shortClockReset;
	JButton startTime;
	JButton stopTime;
	
	MyFrame() {
		
		setGameTime = new JButton();
		setGameTime.setBounds(100, 50, 300, 50);
		setGameTime.addActionListener(this);
		setGameTime.setText("Set Game Time");
		setGameTime.setFocusable(false);
		setGameTime.setFont((new Font("Arial", Font.BOLD, 20)));
		setGameTime.setBackground(Color.BLUE);
		setGameTime.setForeground(Color.BLACK);
		
		resetGameTime = new JButton();
		resetGameTime.setBounds(100, 125, 300, 50);
		resetGameTime.addActionListener(this);
		resetGameTime.setText("Reset Game Time");
		resetGameTime.setFocusable(false);
		resetGameTime.setFont((new Font("Arial", Font.BOLD, 20)));
		resetGameTime.setBackground(Color.RED);
		resetGameTime.setForeground(Color.BLACK);
		
		setShotClockTime = new JButton();
		setShotClockTime.setBounds(100, 400, 300, 50);
		setShotClockTime.addActionListener(this);
		setShotClockTime.setText("Set Shot Clock Time");
		setShotClockTime.setFocusable(false);
		setShotClockTime.setFont((new Font("Arial", Font.BOLD, 20)));
		setShotClockTime.setBackground(Color.BLUE);
		setShotClockTime.setForeground(Color.BLACK);
		
		setShotClockShortTime = new JButton();
		setShotClockShortTime.setBounds(100, 475, 300, 50);
		setShotClockShortTime.addActionListener(this);
		setShotClockShortTime.setText("Set Short Shot Clock Time");
		setShotClockShortTime.setFocusable(false);
		setShotClockShortTime.setFont((new Font("Arial", Font.BOLD, 20)));
		setShotClockShortTime.setBackground(Color.RED);
		setShotClockShortTime.setForeground(Color.BLACK);
		
		resetShotClock = new JButton();
		resetShotClock.setBounds(100, 550, 300, 50);
		resetShotClock.addActionListener(this);
		resetShotClock.setText("Reset Shot Clock Time");
		resetShotClock.setFocusable(false);
		resetShotClock.setFont((new Font("Arial", Font.BOLD, 20)));
		resetShotClock.setBackground(Color.BLUE);
		resetShotClock.setForeground(Color.BLACK);
		
		shortClockReset = new JButton();
		shortClockReset.setBounds(100, 625, 300, 50);
		shortClockReset.addActionListener(this);
		shortClockReset.setText("Reset Short Time");
		shortClockReset.setFocusable(false);
		shortClockReset.setFont((new Font("Arial", Font.BOLD, 20)));
		shortClockReset.setBackground(Color.RED);
		shortClockReset.setForeground(Color.BLACK);
		
		startTime = new JButton();
		startTime.setBounds(100, 225, 300, 50);
		startTime.addActionListener(this);
		startTime.setText("Start Time");
		startTime.setFocusable(false);
		startTime.setFont((new Font("Arial", Font.BOLD, 20)));
		startTime.setBackground(Color.BLACK);
		startTime.setForeground(Color.WHITE);
		
		stopTime = new JButton();
		stopTime.setBounds(100, 300, 300, 50);
		stopTime.addActionListener(this);
		stopTime.setText("StopTime");
		stopTime.setFocusable(false);
		stopTime.setFont((new Font("Arial", Font.BOLD, 20)));
		stopTime.setBackground(Color.BLACK);
		stopTime.setForeground(Color.WHITE);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000, 1000);
		this.setVisible(true);
		this.add(setGameTime);
		this.add(resetGameTime);
		this.add(setShotClockTime);
		this.add(setShotClockShortTime);
		this.add(resetShotClock);
		this.add(shortClockReset);
		this.add(startTime);
		this.add(stopTime);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == setGameTime) {
			ClockFunctions gameClock = new ClockFunctions();
			gameClock.SetGameClock();		
			}
		else if(e.getSource() == resetGameTime) {
			System.out.println("Hip hip");
		}
		else if(e.getSource() == setShotClockTime) {
			ClockFunctions shotClock = new ClockFunctions();
			shotClock.SetShotClock();	
		}
		else if(e.getSource() == setShotClockShortTime) {
			ClockFunctions shortClock = new ClockFunctions();
			shortClock.SetShortenedClock();	
		}
		else if(e.getSource() == resetShotClock) {
			System.out.println("Yupp");
		}
		else if(e.getSource() == shortClockReset) {
			System.out.println("Good Job");
		}
		else if(e.getSource() == startTime) {
			System.out.println("GREAT Job");
		}
		else if(e.getSource() == stopTime) {
			System.out.println("MAGNIFICENT Job");
		}

	}
	
}
