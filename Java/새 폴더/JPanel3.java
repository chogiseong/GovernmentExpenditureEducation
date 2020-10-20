/////////////////////////////////////////////////////////////��������� �ǳ�
package Donkey;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Collections;

import javax.swing.*;

public class JPanel3 extends JPanel implements ActionListener {
   private static final long serialVersionUID = 1L;
   
   Image image;
	
   StudentGroup SG = new StudentGroup();
   JButton btn1 = new JButton("����");
   JButton btn2 = new JButton("����");
   JButton btn3 = new JButton("����");
   JButton btn4 = new JButton("����");

   JTextField tf1 = new JTextField(10);
   JTextField tf2 = new JTextField(10);
   
   JLabel jl1 = new JLabel("������ �̸�");
   JLabel jl2 = new JLabel("������ �й�");
   
   JPanel p1=new JPanel();
   JPanel p2=new JPanel();
   
   JTextArea ta = new JTextArea(15, 15);
   
   Font font_jl = new Font("���� ���", Font.BOLD, 13);
   Font font_ta = new Font("���� ���", Font.BOLD, 15);
   Font font_btn = new Font("���� ���", Font.BOLD, 30);
   
   public JPanel3() {
	   image = new ImageIcon("C:\\Users\\tjsdk\\Desktop\\����\\����\\���-�ΰ�����\\����2.jpg").getImage();

      p1.add(jl1);
      p1.add(tf1);
      p1.add(jl2);
      p1.add(tf2);
      
      tf1.setPreferredSize(new Dimension(0, 25));
      tf2.setPreferredSize(new Dimension(0, 25));
      
      jl1.setFont(font_jl);
      jl2.setFont(font_jl);
      
      p1.setPreferredSize(new Dimension(0,50));
      
      p2.add(btn1);
      btn1.addActionListener(this);
      p2.add(btn2);
      btn2.addActionListener(this);
      p2.add(btn3);
      btn3.addActionListener(this);
      p2.add(btn4);
      btn4.addActionListener(this);
        p1.setOpaque(false);
		ta.setOpaque(false);
		p2.setOpaque(false);
		tf1.setOpaque(false);
		tf2.setOpaque(false);
		
	    jl1.setOpaque(false);
	    jl2.setOpaque(false);
	   
	    tf1.setOpaque(false);
		btn1.setOpaque(false);
		btn2.setOpaque(false);
		btn3.setOpaque(false);
		btn4.setOpaque(false);
		
      btn1.setBorderPainted(false);
      btn1.setFont(font_btn);
      btn1.setForeground(new Color(0,0,0,0));
      btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn1.setBackground(new Color(153,204, 255));
      btn2.setBorderPainted(false);
      btn2.setFont(font_btn);
      btn2.setForeground(new Color(0,0,0,0));
      btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn2.setBackground(new Color(102,153, 204));
      btn3.setBorderPainted(false);
      btn3.setFont(font_btn);
      btn3.setForeground(new Color(0,0,0,0));
      btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn3.setBackground(new Color( 000,051, 102));
      btn4.setBorderPainted(false);
      btn4.setFont(font_btn);
      btn4.setForeground(new Color(0,0,0,0));
      btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
      btn4.setBackground(new Color(102,153, 204));
      
      setLayout(new BorderLayout());
      add(ta);
      ta.setLayout(null);
      ta.setFont(font_ta);
      
      add(p1,"North");
      add(p2,"South");
      
      int rank = 0;
      ta.setText("");
      if(SG.AL.size()<1) {
         ta.setText("������ �����ϴ�! ������ �Է����ּ���.\n");
      }
      else {
         Descend des = new Descend();
         Collections.sort(SG.AL, des);
         for(Student stu : SG.AL) {
            rank += 1;
            ta.append(rank + " �� " + stu.toString()+"\n");
         }
      }
   }
	public void paint(Graphics g){
         g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
         setOpaque(false);//�����ϰ�
         super.paint(g);   
        }

	   public void actionPerformed(ActionEvent e) {
	      String str=e.getActionCommand();
	      
	      if(str.equals("����")) { //�������
	         int count = 0;
	         
	         if(SG.AL.size() < 1) {
	            ta.setText("������ �����ϴ�! ������ �Է����ּ���.\n");
	         }
	         else {
	            for(Student stu : SG.AL) {
	               if(stu.getName().equals(tf1.getText()) && stu.getNum().equals(tf2.getText())) { //�Է��� �̸��� ���� ����� AL�� �ִٸ�
	                  SG.AL.remove(stu);  //AL���� �ش� �л����� ����
	                  ta.setText("���������� �����Ǿ����ϴ�! ������ �����ּ���.\n");
	                  count++;
	                  break;
	               }
	            }
	            int rank = 0;
	            ta.setText("");
	            if(SG.AL.size()<1) {
	               ta.setText("������ �����ϴ�! ������ �Է����ּ���.\n");
	            }
	            else {
	               Descend des = new Descend();
	               Collections.sort(SG.AL, des);
	               for(Student stu : SG.AL) {
	                  rank += 1;
	                  ta.append(rank + " �� " + stu.toString()+"\n");
	               }
	            }
	            if(count == 0) {
	               ta.setText("��ġ�ϴ� ������ �����ϴ�! ������ �����ּ���.\n");
	            }
	         }
	      }
	      else if(str.equals("����")) {
	         int rank = 0;
	         ta.setText("");
	         if(SG.AL.size()<1) {
	            ta.setText("������ �����ϴ�! ������ �Է����ּ���.\n");
	         }
	         else {
	            Descend des = new Descend();
	            Collections.sort(SG.AL, des);
	            for(Student stu : SG.AL) {
	               rank += 1;
	               ta.append(rank + " �� " + stu.toString()+"\n");
	            }
	         }
	      }
	      else if (str.equals("����")) {
	         try {
	            FileWriter fileWriter = new FileWriter("score.txt", false);
	            String info;
	            for(Student stu : SG.AL) {
	               info = stu.getName()+" " +stu.getNum()+" "
	                     +stu.getSubject1()+" "+stu.getSubject2()+" "+stu.getSubject3()+" "+stu.getSubject4()+" "+stu.getSubject5()+"\n";
	               fileWriter.write(info);
	            }
	            fileWriter.close();
	         } catch (IOException e1) {
	            e1.printStackTrace();
	         }
	       }
	      else if(str.equals("����")) {
	         System.exit(0);
	      }
	   }
	}