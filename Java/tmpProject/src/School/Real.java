package School;
 
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class JPanel1 extends JPanel {
    JButton btn1 = new JButton("�Է�");
    JButton btn2 = new JButton("����");
    
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JTextField tf3 = new JTextField(10);
    JTextField tf4 = new JTextField(10);
    JTextField tf5 = new JTextField(10);
    JTextField tf6 = new JTextField(10);
    JTextField tf7 = new JTextField(10);
    
    JLabel jl1 = new JLabel("�̸�");
    JLabel jl2 = new JLabel("�й�");
    JLabel jl3 = new JLabel("����");
    JLabel jl4 = new JLabel("����");
    JLabel jl5 = new JLabel("����");
    JLabel jl6 = new JLabel("��ȸ");
    JLabel jl7 = new JLabel("����");
    
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
   JButton btn1 = new JButton("����");
    
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JTextField tf3 = new JTextField(10);
    JTextField tf4 = new JTextField(10);
    JTextField tf5 = new JTextField(10);
    JTextField tf6 = new JTextField(10);
    JTextField tf7 = new JTextField(10);
    
    JLabel jl1 = new JLabel("��� �̸�");
    JLabel jl2 = new JLabel("���� �й�");
    JLabel jl3 = new JLabel("���� ����");
    JLabel jl4 = new JLabel("���� ����");
    JLabel jl5 = new JLabel("���� ����");
    JLabel jl6 = new JLabel("���� ��ȸ");
    JLabel jl7 = new JLabel("���� ����");
    
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
   JButton btn1 = new JButton("����");
    
    JTextField tf1 = new JTextField(10);
    
    JLabel jl1 = new JLabel("������ �̸�");
    
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
      
      jtab.addTab("�Է�", win.jpanel1);
      jtab.addTab("����", win.jpanel2);
      jtab.addTab("����", win.jpanel3);
      
      win.add(jtab);
      
      win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      win.setSize(1800, 800);
      win.setVisible(true);
   }
}