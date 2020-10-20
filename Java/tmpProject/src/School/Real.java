package School;
 
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class JPanel1 extends JPanel {
    JButton btn1 = new JButton("입력");
    JButton btn2 = new JButton("종료");
    
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JTextField tf3 = new JTextField(10);
    JTextField tf4 = new JTextField(10);
    JTextField tf5 = new JTextField(10);
    JTextField tf6 = new JTextField(10);
    JTextField tf7 = new JTextField(10);
    
    JLabel jl1 = new JLabel("이름");
    JLabel jl2 = new JLabel("학번");
    JLabel jl3 = new JLabel("국어");
    JLabel jl4 = new JLabel("영어");
    JLabel jl5 = new JLabel("수학");
    JLabel jl6 = new JLabel("사회");
    JLabel jl7 = new JLabel("과학");
    
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    
    JTextArea ta = new JTextArea(30, 30);
    
    FlowLayout flow = new FlowLayout();
    public JPanel1() {
    	
       p1.add(jl1);
       p1.add(tf1);
       p1.add(jl2);
       p1.add(tf2);
       p1.add(jl3);
       p1.add(tf3);
       p1.add(jl4);
       p1.add(tf4);
       p1.add(jl5);
       p1.add(tf5);
       p1.add(jl6);
       p1.add(tf6);
       p1.add(jl7);
       p1.add(tf7);
       
       p2.add(btn1);
       p2.add(btn2);
       
       add(ta);
       add(p1,"North");
       add(p2,"South");
    }
}

class JPanel2 extends JPanel {
   JButton btn1 = new JButton("수정");
    
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JTextField tf3 = new JTextField(10);
    JTextField tf4 = new JTextField(10);
    JTextField tf5 = new JTextField(10);
    JTextField tf6 = new JTextField(10);
    JTextField tf7 = new JTextField(10);
    
    JLabel jl1 = new JLabel("대상 이름");
    JLabel jl2 = new JLabel("수정 학번");
    JLabel jl3 = new JLabel("수정 국어");
    JLabel jl4 = new JLabel("수정 영어");
    JLabel jl5 = new JLabel("수정 수학");
    JLabel jl6 = new JLabel("수정 사회");
    JLabel jl7 = new JLabel("수정 과학");
    
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    
    JTextArea ta = new JTextArea(15, 15);
    
    public JPanel2() {
       p1.add(jl1);
       p1.add(tf1);
       p1.add(jl2);
       p1.add(tf2);
       p1.add(jl3);
       p1.add(tf3);
       p1.add(jl4);
       p1.add(tf4);
       p1.add(jl5);
       p1.add(tf5);
       p1.add(jl6);
       p1.add(tf6);
       p1.add(jl7);
       p1.add(tf7);
       
       p2.add(btn1);
       
       add(ta);
       add(p1,BorderLayout.NORTH);
       add(p2,"South");
    }
}

class JPanel3 extends JPanel {
   JButton btn1 = new JButton("삭제");
    
    JTextField tf1 = new JTextField(10);
    
    JLabel jl1 = new JLabel("삭제할 이름");
    
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    
    JTextArea ta = new JTextArea(15, 15);
    
    public JPanel3() {
       p1.add(jl1);
       p1.add(tf1);
       
       p2.add(btn1);
       
       add(ta);
       add(p1,BorderLayout.NORTH);
       add(p2,"South");
    }
}

public class Real extends JFrame {
   public JPanel1 jpanel1 = null;
   public JPanel2 jpanel2 = null;
   public JPanel3 jpanel3 = null;
   
   public static void main(String[] args) {
      Real win = new Real();
      win.setTitle("Tab Test");
      win.jpanel1 = new JPanel1();
      win.jpanel2 = new JPanel2();
      win.jpanel3 = new JPanel3();
      
      JTabbedPane jtab = new JTabbedPane();
      
      jtab.addTab("입력", win.jpanel1);
      jtab.addTab("수정", win.jpanel2);
      jtab.addTab("삭제", win.jpanel3);
      
      win.add(jtab);
      
      win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      win.setSize(1800, 800);
      win.setVisible(true);
   }
}