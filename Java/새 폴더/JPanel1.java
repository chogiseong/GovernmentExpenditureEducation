/////////////////////////////////////////////////////////////�Է°� �˻������ �ǳ�
package Donkey;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Collections;

import javax.swing.*;

public class JPanel1 extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	Image image;
	
	StudentGroup SG = new StudentGroup(); //�л��������� �����ϱ� ���� ��ü
	Student stu = new Student(); //�л� �������� ������ ���� ��ü
	JButton btn1 = new JButton("�Է�"); //��ư ����
	JButton btn2 = new JButton("����");
	JButton btn3 = new JButton("����");
	JButton btn4 = new JButton("�˻�");
	JButton btn5 = new JButton("����");
	
	JTextField tf1 = new JTextField(10); //�ؽ�Ʈ�ʵ� ����
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);
	JTextField tf4 = new JTextField(10);
	JTextField tf5 = new JTextField(10);
	JTextField tf6 = new JTextField(10);
	JTextField tf7 = new JTextField(10);
	
	JLabel jl1 = new JLabel("�̸�"); //�ؽ�Ʈ�ʵ� ���� ���ִ� �� ����
	JLabel jl2 = new JLabel("�й�");
	JLabel jl3 = new JLabel(stu.getSubjectName1());
	JLabel jl4 = new JLabel(stu.getSubjectName2());
	JLabel jl5 = new JLabel(stu.getSubjectName3());
	JLabel jl6 = new JLabel(stu.getSubjectName4());
	JLabel jl7 = new JLabel(stu.getSubjectName5());
	
	JPanel p1=new JPanel(); //�ǳ� ����
	JPanel p2=new JPanel();
	
	JTextArea ta = new JTextArea(15,15); //textArea����
	
	Font font_jl = new Font("���� ���", Font.BOLD,13); //�츮�� �Ʒ��� �� ��Ʈ�� �̸� �����Ͽ� �Ʒ����� ���ϴ� ��Ʈ�� ���⼭ �̸��� ������ �� �� ����
	Font font_ta = new Font("���� ���", Font.BOLD, 15);
	Font font_btn = new Font("���� ���", Font.BOLD, 30);
	
	public JPanel1() {
		image = new ImageIcon("C:\\Users\\tjsdk\\Desktop\\����\\����\\���-�ΰ�����\\�Է�2.jpg").getImage();

		p1.add(jl1); //�󺧰� �ؽ�Ʈ�ʵ� �߰�
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
		p1.setOpaque(false);//����
		ta.setOpaque(false);
		p2.setOpaque(false);
		tf1.setOpaque(false);
		tf2.setOpaque(false);
		tf3.setOpaque(false);
		tf4.setOpaque(false);
		tf5.setOpaque(false);
		tf6.setOpaque(false);
		tf7.setOpaque(false);
	    jl1.setOpaque(false);
	    jl2.setOpaque(false);
	    jl3.setOpaque(false);
	    jl4.setOpaque(false);
	    jl5.setOpaque(false);
	    jl6.setOpaque(false);
	    tf1.setOpaque(false);
		btn1.setOpaque(false);
		btn2.setOpaque(false);
		btn3.setOpaque(false);
		btn4.setOpaque(false);
		btn5.setOpaque(false);
		
		tf1.setPreferredSize(new Dimension(0, 25)); //�ؽ�Ʈ�ʵ��� ���� ����
        tf2.setPreferredSize(new Dimension(0, 25));
        tf3.setPreferredSize(new Dimension(0, 25));
        tf4.setPreferredSize(new Dimension(0, 25));
        tf5.setPreferredSize(new Dimension(0, 25));
        tf6.setPreferredSize(new Dimension(0, 25));
        tf7.setPreferredSize(new Dimension(0, 25));
        
        jl1.setFont(font_jl); //���� ��Ʈ ����
        jl2.setFont(font_jl);
        jl3.setFont(font_jl);
        jl4.setFont(font_jl);
        jl5.setFont(font_jl);
        jl6.setFont(font_jl);
        jl7.setFont(font_jl);
        
        p1.setPreferredSize(new Dimension(0,50)); //p1�� ���� ����
        
		p2.add(btn1);                 //��ư�� �߰��ϰ� �̺�Ʈ�� �޵��� ����
		btn1.addActionListener(this);
		p2.add(btn2);
		btn2.addActionListener(this);
		p2.add(btn3);
		btn3.addActionListener(this);
		p2.add(btn4);
		btn4.addActionListener(this);
		p2.add(btn5);
		btn5.addActionListener(this);
		
		btn1.setBorderPainted(false); //��ư�� ��Ʈ, ��, Ŀ�� ����
		btn1.setFont(font_btn);
		btn1.setForeground(new Color(0,0,0,0)); //���ڻ�
		btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn1.setBackground(new Color(153, 204,255));
		
		btn2.setBorderPainted(false);
		btn2.setFont(font_btn);
		btn2.setForeground(new Color(0,0,0,0));
		btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn2.setBackground(new Color(153, 204,255));
		btn3.setBorderPainted(false);
		btn3.setFont(font_btn);
		btn3.setForeground(new Color(0,0,0,0));
		btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn3.setBackground(new Color(000, 051, 102));
		btn4.setBorderPainted(false);
		btn4.setFont(font_btn);
		btn4.setForeground(new Color(0,0,0,0));
		btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn4.setBackground(new Color(000, 051, 102));
		btn5.setBorderPainted(false);
		btn5.setFont(font_btn);
		btn5.setForeground(new Color(0,0,0,0));
		btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btn5.setBackground(new Color(000, 051, 102));
		
		setLayout(new BorderLayout()); //�̰� �� �𸣰���
		add(ta); //textarea�߰�
		ta.setLayout(null);
		ta.setFont(font_ta); //textarea��Ʈ ����
		
		add(p1,"North"); //�� �ǳ��� ��, �Ʒ��� ����
		add(p2,"South");
		
		int rank = 0; //����� ���� ����
		ta.setText(""); //�̸� textarea�� ���� ��������
		if(SG.AL.size()<1) { //���� AL�� �ƹ� ������ ������
			ta.setText("������ �����ϴ�! ������ �Է����ּ���.\n");
		}
		else {               //AL�� ������ ������
			Descend des = new Descend(); //�����Լ��� �ִ� Ŭ������ �ҷ���
			Collections.sort(SG.AL, des); //������ �ϴ� ����ε� �̰� �˾� �� �ʿ䰡 ����
			for(Student tmpStu : SG.AL) { //AL�� �ִ� ������ ���ʷ� �ӽ��� tmpStu�� ����
				rank += 1; //����� �ϳ� �ø�
				ta.append(rank + " �� " + tmpStu.toString()+"\n"); //���� ���
			}
		}
	}
	
	 public void paint(Graphics g){
         g.drawImage(image, 0, 0, getWidth(), getHeight(), this);//���� �̹����� �гο� �� ������ �׸��� /(0,0) : ��ġ, (getWidth(),getHeight()) : ��������
         setOpaque(false);//�����ϰ�
         super.paint(g);   
         }
	 
	 public void actionPerformed(ActionEvent e) {
			
			//��ư�� ��� ����
			String str=e.getActionCommand();
			Image img = new ImageIcon("C:\\\\Users\\\\moble\\\\Desktop\\\\donkey.jpg").getImage();

			
			
			if(str.equals("�Է�")) { //�Է±��
				ta.setText(""); //�̸� ���� �����
				Student stu = new Student(); //�л������� ���� �� ��ü
				if(tf1.getText().equals("")||tf2.getText().equals("")||tf3.getText().equals("")||tf4.getText().equals("")||   //���� �ؽ�Ʈ�ʵ忡 �ϳ��� ���� ������
						tf5.getText().equals("")||tf6.getText().equals("")||tf7.getText().equals("")) {
					new newWindow(); //���â ����
				}
				
				if(tf1.getText().equals("")) { //����ִ� ĭ�� �� Ȯ���Ͽ� ������ ����� textarea�� ���
					ta.append("�̸��� �Է��ϼ���!\n");
				}
				if(tf2.getText().equals("")) {
					ta.append("�й��� �Է��ϼ���!\n");
				}
				if(tf3.getText().equals("")) {
					ta.append(stu.getSubjectName1()+"�� �Է��ϼ���!\n");
				}
				if(tf4.getText().equals("")) {
					ta.append(stu.getSubjectName2()+"�� �Է��ϼ���!\n");
				}
				if(tf5.getText().equals("")) {
					ta.append(stu.getSubjectName3()+"�� �Է��ϼ���!\n");
				}
				if(tf6.getText().equals("")) {
					ta.append(stu.getSubjectName4()+"�� �Է��ϼ���!\n");
				}
				if(tf7.getText().equals("")) {
					ta.append(stu.getSubjectName5()+"�� �Է��ϼ���!\n");
				}
				else { //�ؽ�Ʈ�ʵ尡 �� ä����������
					
					for(Student numStu : SG.AL) {
			            if(tf2.getText().equals(numStu.getNum())) {
			            	ta.append("������ �й��� �л��� �ֽ��ϴ�. �й��� �������ּ���.\n");
			            	return;
			            }
					}
				
					
					stu.setName(tf1.getText()); //�� �ؽ�Ʈ�ʵ��� ������ ������ �л���ü�� ����
					stu.setNum(tf2.getText());
					stu.setSubject1(Integer.parseInt(tf3.getText()));
					stu.setSubject2(Integer.parseInt(tf4.getText()));
					stu.setSubject3(Integer.parseInt(tf5.getText()));
					stu.setSubject4(Integer.parseInt(tf6.getText()));
					stu.setSubject5(Integer.parseInt(tf7.getText()));
					stu.getTotal();
					stu.getAvg();
		
					SG.AL.add(stu); //AL�� �л����� �߰�
				
					tf1.setText(""); //�� �ؽ�Ʈ�ʵ��� �� ������
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText("");
					tf7.setText("");
					
					int rank = 0;
					ta.setText("");
					Descend des = new Descend();
					Collections.sort(SG.AL, des);
					for(Student tmpstu : SG.AL) {
						rank += 1;
						ta.append(rank + " �� " + tmpstu.toString()+"\n");
					}
					
					
				}
			}
			else if(str.equals("����")) { //���ű��
				int rank = 0;            //AL�� ������ �����Ͽ� textarea�� ���
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
			else if (str.equals("����")) { //score.txt������ �����ϴ� �κ�
				try {                     //�� try catch�� �������� �� ��. �Ƹ� ���ܻ��� �����ΰ� ���� ��.
					FileWriter fileWriter = new FileWriter("score.txt", false); //score.txt��� ������ ������� �ҷ����� false�� ���� ������ �� ����� ���� ���ٴ� ����.
					String info; //�� �� �з��� ������ ���� �� ����
					for(Student stu : SG.AL) { //AL�� �ִ� ������ ���ʷ� �л���ü�� ����
						info = stu.getName()+" " +stu.getNum()+" "
								+stu.getSubject1()+" "+stu.getSubject2()+" "+stu.getSubject3()+" "+stu.getSubject4()+" "+stu.getSubject5()+"\n"; //info������ �л��Ѹ� ����
						fileWriter.write(info);                                                                                                  //������ �ְ� ���Ͽ� �Է�
					}
					fileWriter.close(); //�ҷ��� ���� �ݾ���
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		    }
			else if(str.equals("�˻�")) { //�˻����, ����� �� ��ȭ�� �ʿ䰡 �־��, tf3�����ۿ� ���� �� ���Ƽ� �׷�.
	            ta.setText("");
	            int count = 0; //���� ���� �ϳ� �ҷ��Դٸ� ��ġ�ϴ� ������ �ϳ��� �ִ� ���̹Ƿ� �̸� �Ǻ��ϱ����� ����
	            int i;
	            if(SG.AL.size() < 1) {
	                ta.setText("������ �����ϴ�! ������ �Է����ּ���.\n");
	            }
	            else if(!tf1.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) { //AL�� �����ŭ �ݺ�
	                	Student stu = SG.AL.get(i);
	                    if(stu.getName().equals(tf1.getText())) { //���� �ҷ��� �л��� ������ ��ġ�Ѵٸ� �ش� ���� textarea�� ���
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;    //���� ���� �ϳ� �ҷ��Դٸ� ��ġ�ϴ� ������ �ϳ��� �ִ� ���̹Ƿ� �̸� �Ǻ��ϱ����� ����
	                    }
	                }
	            }
	            else if(!tf2.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) {
	                    Student stu = SG.AL.get(i);
	                    if(stu.getNum().equals(tf2.getText())) {
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;
	                        tf2.setText("");
	                    }
	                }
	            }
	            else if(!tf3.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) {
	                    Student stu = SG.AL.get(i);
	                    if(stu.getSubject1()==Integer.parseInt(tf3.getText())) {
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;
	                        
	                    }
	                }
	            }
	            else if(!tf4.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) {
	                    Student stu = SG.AL.get(i);
	                    if(stu.getSubject2()==Integer.parseInt(tf4.getText())) {
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;
	                        
	                    }
	                }   
	            }
	            else if(!tf5.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) {
	                    Student stu = SG.AL.get(i);
	                    if(stu.getSubject3()==Integer.parseInt(tf5.getText())) {
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;
	                        
	                    }
	                }   
	            }
	            else if(!tf6.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) {
	                    Student stu = SG.AL.get(i);
	                    if(stu.getSubject4()==Integer.parseInt(tf6.getText())) {
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;
	                        
	                    }
	                }   
	            }
	            else if(!tf7.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) {
	                    Student stu = SG.AL.get(i);
	                    if(stu.getSubject5()==Integer.parseInt(tf7.getText())) {
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;
	                        
	                    }
	                }   
	            }
	            if(count == 0) {  //���� ��ġ�ϴ� ������ ���ٸ�
	                ta.setText("��ġ�ϴ� ������ �����ϴ�!\n");
	            }
	        }
			else if(str.equals("����")) { //���α׷��� ������ѹ���, X�� ������ ���
				System.exit(0);
			}
			
		}
	}

	class newWindow extends JFrame implements ActionListener{ // ��ư�� �������� ��������� �� â�� ������ Ŭ����, �����ϰ� ȿ���̰� �������ָ� ���� �� ����.
		Button btnclose;
		newWindow() {
			setTitle("error");
			// ����, ���⼭ setDefaultCloseOperation() ���Ǹ� ���� ���ƾ� �Ѵ�
	        // �����ϰ� �Ǹ� �� â�� ������ ��� â�� ���α׷��� ���ÿ� ������
			
			JPanel Windowpanel1 = new JPanel();
			setLayout(new FlowLayout());
			btnclose = new Button ("�ݱ�");
	        
	        setContentPane(Windowpanel1);
	        
	        JLabel NewLabel = new JLabel("�Էµ��� ���� ���� �ֽ��ϴ�.");
	        NewLabel.setFont(new Font("���� ���", Font.BOLD,20));
	        NewLabel.setForeground(Color.black);
	        Windowpanel1.add(NewLabel);
	        Windowpanel1.add(btnclose);
	        btnclose.addActionListener(this);
	        Windowpanel1.setBackground(new Color(230, 230, 230));
	        
	        setSize(300,100);
	        setResizable(false);
	        setVisible(true);
	        setLocationRelativeTo(null);
		}

		public void actionPerformed(ActionEvent e) {
			String str=e.getActionCommand();
			if(str.equals("�ݱ�")) {
				dispose();
			}
		}
	}
		       

	       
