package SwingStudy1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import SwingStudy.JframeTest;

public class JframeTest1 extends JFrame {
	
	JframeTest1(){
		super("Swing Test1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JCheckBox cb1 = new JCheckBox("c1", true);
		JCheckBox cb2 = new JCheckBox("c2");
		
		ButtonGroup Radio_g = new ButtonGroup();
		
		JRadioButton rb1 = new JRadioButton("r1");
		JRadioButton rb2 = new JRadioButton("r2");
		
		container.add(b1);
		container.add(b2);
		container.add(b3);
		container.add(cb1);
		container.add(cb2);
		Radio_g.add(rb1);
		Radio_g.add(rb2);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				System.out.println("1");
			}
		});
		
		//b2.setEnabled(false);//비활
		ActionListener listener = new ActionListener() {
			String str = " ";
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1");
				JButton btn = (JButton)e.getSource();
				if(btn.getText() == "1") {
					str = "1번 버튼";
				}
				System.out.println(btn.getText() + "번버튼");
				// TODO Auto-generated method stub
				
			}
		};
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		cb1.addItemListener(c_lis);
		cb2.addItemListener(c_lis);
		rb1.addItemListener(r_lis);
		rb2.addItemListener(r_lis);
		
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JframeTest1();
	}
	
	ItemListener c_lis = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				JCheckBox cb = (JCheckBox)e.getSource();
				
				if(e.getStateChange()==ItemEvent.SELECTED) 
				{
					System.out.println(cb.getText()+"선택");
				}
				else
				{
					System.out.println(cb.getText()+"해제");
				}
				
			}
		};
	ItemListener r_lis = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				JRadioButton rb = (JRadioButton)e.getSource();
				
				if(e.getStateChange()==ItemEvent.SELECTED) 
				{
					System.out.println(rb.getText()+"선택");
				}
				else
				{
					System.out.println(rb.getText()+"해제");
				}
			}
		};
}