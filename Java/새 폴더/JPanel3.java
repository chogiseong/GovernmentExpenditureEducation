/////////////////////////////////////////////////////////////삭제기능의 판넬
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
   JButton btn1 = new JButton("삭제");
   JButton btn2 = new JButton("갱신");
   JButton btn3 = new JButton("저장");
   JButton btn4 = new JButton("종료");

   JTextField tf1 = new JTextField(10);
   JTextField tf2 = new JTextField(10);
   
   JLabel jl1 = new JLabel("삭제할 이름");
   JLabel jl2 = new JLabel("삭제할 학번");
   
   JPanel p1=new JPanel();
   JPanel p2=new JPanel();
   
   JTextArea ta = new JTextArea(15, 15);
   
   Font font_jl = new Font("맑은 고딕", Font.BOLD, 13);
   Font font_ta = new Font("맑은 고딕", Font.BOLD, 15);
   Font font_btn = new Font("맑은 고딕", Font.BOLD, 30);
   
   public JPanel3() {
	   image = new ImageIcon("C:\\Users\\tjsdk\\Desktop\\드루와\\공부\\모블-인공지능\\삭제2.jpg").getImage();

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
         ta.setText("정보가 없습니다! 정보를 입력해주세요.\n");
      }
      else {
         Descend des = new Descend();
         Collections.sort(SG.AL, des);
         for(Student stu : SG.AL) {
            rank += 1;
            ta.append(rank + " 등 " + stu.toString()+"\n");
         }
      }
   }
	public void paint(Graphics g){
         g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
         setOpaque(false);//투명하게
         super.paint(g);   
        }

	   public void actionPerformed(ActionEvent e) {
	      String str=e.getActionCommand();
	      
	      if(str.equals("삭제")) { //삭제기능
	         int count = 0;
	         
	         if(SG.AL.size() < 1) {
	            ta.setText("정보가 없습니다! 정보를 입력해주세요.\n");
	         }
	         else {
	            for(Student stu : SG.AL) {
	               if(stu.getName().equals(tf1.getText()) && stu.getNum().equals(tf2.getText())) { //입력한 이름과 같은 사람이 AL에 있다면
	                  SG.AL.remove(stu);  //AL에서 해당 학생정보 지움
	                  ta.setText("성공적으로 삭제되었습니다! 갱신을 눌러주세요.\n");
	                  count++;
	                  break;
	               }
	            }
	            int rank = 0;
	            ta.setText("");
	            if(SG.AL.size()<1) {
	               ta.setText("정보가 없습니다! 정보를 입력해주세요.\n");
	            }
	            else {
	               Descend des = new Descend();
	               Collections.sort(SG.AL, des);
	               for(Student stu : SG.AL) {
	                  rank += 1;
	                  ta.append(rank + " 등 " + stu.toString()+"\n");
	               }
	            }
	            if(count == 0) {
	               ta.setText("일치하는 정보가 없습니다! 갱신을 눌러주세요.\n");
	            }
	         }
	      }
	      else if(str.equals("갱신")) {
	         int rank = 0;
	         ta.setText("");
	         if(SG.AL.size()<1) {
	            ta.setText("정보가 없습니다! 정보를 입력해주세요.\n");
	         }
	         else {
	            Descend des = new Descend();
	            Collections.sort(SG.AL, des);
	            for(Student stu : SG.AL) {
	               rank += 1;
	               ta.append(rank + " 등 " + stu.toString()+"\n");
	            }
	         }
	      }
	      else if (str.equals("저장")) {
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
	      else if(str.equals("종료")) {
	         System.exit(0);
	      }
	   }
	}