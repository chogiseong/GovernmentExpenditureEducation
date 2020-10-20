package SwingStudy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JframeTest extends JFrame {
	
	JframeTest(){
		super("Swing Test1");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("cancel");
		JButton b3 = new JButton("Title");
		
		container.add(b1);
		container.add(b2);
		container.add(b3);
		
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				System.out.println("test");
				setTitle("test");
			}
		});
		
		//b2.setEnabled(false);//∫Ò»∞
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK");
				// TODO Auto-generated method stub
				
			}
		};
		b2.addActionListener(listener);
		
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.magenta);
		
		
		
		setSize(800,600);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new JframeTest();
	}
}
