/////////////////////////////////////////////////////////////입력과 검색기능의 판넬
package Donkey;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Collections;

import javax.swing.*;

public class JPanel1 extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	Image image;
	
	StudentGroup SG = new StudentGroup(); //학생정보들을 저장하기 위한 객체
	Student stu = new Student(); //학생 개개인의 정보를 담을 객체
	JButton btn1 = new JButton("입력"); //버튼 생성
	JButton btn2 = new JButton("갱신");
	JButton btn3 = new JButton("저장");
	JButton btn4 = new JButton("검색");
	JButton btn5 = new JButton("종료");
	
	JTextField tf1 = new JTextField(10); //텍스트필드 생성
	JTextField tf2 = new JTextField(10);
	JTextField tf3 = new JTextField(10);
	JTextField tf4 = new JTextField(10);
	JTextField tf5 = new JTextField(10);
	JTextField tf6 = new JTextField(10);
	JTextField tf7 = new JTextField(10);
	
	JLabel jl1 = new JLabel("이름"); //텍스트필드 옆에 써있는 라벨 생성
	JLabel jl2 = new JLabel("학번");
	JLabel jl3 = new JLabel(stu.getSubjectName1());
	JLabel jl4 = new JLabel(stu.getSubjectName2());
	JLabel jl5 = new JLabel(stu.getSubjectName3());
	JLabel jl6 = new JLabel(stu.getSubjectName4());
	JLabel jl7 = new JLabel(stu.getSubjectName5());
	
	JPanel p1=new JPanel(); //판넬 생성
	JPanel p2=new JPanel();
	
	JTextArea ta = new JTextArea(15,15); //textArea생성
	
	Font font_jl = new Font("맑은 고딕", Font.BOLD,13); //우리가 아래서 쓸 폰트를 미리 선언하여 아래에서 원하는 폰트를 여기서 이름만 가져와 쓸 수 있음
	Font font_ta = new Font("맑은 고딕", Font.BOLD, 15);
	Font font_btn = new Font("맑은 고딕", Font.BOLD, 30);
	
	public JPanel1() {
		image = new ImageIcon("C:\\Users\\tjsdk\\Desktop\\드루와\\공부\\모블-인공지능\\입력2.jpg").getImage();

		p1.add(jl1); //라벨과 텍스트필드 추가
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
		p1.setOpaque(false);//투명
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
		
		tf1.setPreferredSize(new Dimension(0, 25)); //텍스트필드의 높이 설정
        tf2.setPreferredSize(new Dimension(0, 25));
        tf3.setPreferredSize(new Dimension(0, 25));
        tf4.setPreferredSize(new Dimension(0, 25));
        tf5.setPreferredSize(new Dimension(0, 25));
        tf6.setPreferredSize(new Dimension(0, 25));
        tf7.setPreferredSize(new Dimension(0, 25));
        
        jl1.setFont(font_jl); //라벨의 폰트 설정
        jl2.setFont(font_jl);
        jl3.setFont(font_jl);
        jl4.setFont(font_jl);
        jl5.setFont(font_jl);
        jl6.setFont(font_jl);
        jl7.setFont(font_jl);
        
        p1.setPreferredSize(new Dimension(0,50)); //p1의 높이 설정
        
		p2.add(btn1);                 //버튼을 추가하고 이벤트를 받도록 설정
		btn1.addActionListener(this);
		p2.add(btn2);
		btn2.addActionListener(this);
		p2.add(btn3);
		btn3.addActionListener(this);
		p2.add(btn4);
		btn4.addActionListener(this);
		p2.add(btn5);
		btn5.addActionListener(this);
		
		btn1.setBorderPainted(false); //버튼의 폰트, 색, 커서 설정
		btn1.setFont(font_btn);
		btn1.setForeground(new Color(0,0,0,0)); //글자색
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
		
		setLayout(new BorderLayout()); //이건 잘 모르겠음
		add(ta); //textarea추가
		ta.setLayout(null);
		ta.setFont(font_ta); //textarea폰트 설정
		
		add(p1,"North"); //각 판넬을 위, 아래로 붙임
		add(p2,"South");
		
		int rank = 0; //등수를 위한 변수
		ta.setText(""); //미리 textarea의 정보 지워놓음
		if(SG.AL.size()<1) { //만약 AL에 아무 정보도 있으면
			ta.setText("정보가 없습니다! 정보를 입력해주세요.\n");
		}
		else {               //AL에 정보가 있으면
			Descend des = new Descend(); //메인함수에 있는 클래스를 불러옴
			Collections.sort(SG.AL, des); //정렬을 하는 방식인데 이건 알아 볼 필요가 있음
			for(Student tmpStu : SG.AL) { //AL에 있는 정보를 차례로 임시의 tmpStu에 넣음
				rank += 1; //등수를 하나 올림
				ta.append(rank + " 등 " + tmpStu.toString()+"\n"); //정보 출력
			}
		}
	}
	
	 public void paint(Graphics g){
         g.drawImage(image, 0, 0, getWidth(), getHeight(), this);//원본 이미지를 패널에 꽉 차도록 그리기 /(0,0) : 위치, (getWidth(),getHeight()) : 꽉차도록
         setOpaque(false);//투명하게
         super.paint(g);   
         }
	 
	 public void actionPerformed(ActionEvent e) {
			
			//버튼의 기능 구현
			String str=e.getActionCommand();
			Image img = new ImageIcon("C:\\\\Users\\\\moble\\\\Desktop\\\\donkey.jpg").getImage();

			
			
			if(str.equals("입력")) { //입력기능
				ta.setText(""); //미리 정보 비워둠
				Student stu = new Student(); //학생정보를 저장 할 객체
				if(tf1.getText().equals("")||tf2.getText().equals("")||tf3.getText().equals("")||tf4.getText().equals("")||   //만약 텍스트필드에 하나라도 값이 없으면
						tf5.getText().equals("")||tf6.getText().equals("")||tf7.getText().equals("")) {
					new newWindow(); //경고창 생성
				}
				
				if(tf1.getText().equals("")) { //비어있는 칸을 다 확인하여 없으면 경고문구 textarea에 출력
					ta.append("이름을 입력하세요!\n");
				}
				if(tf2.getText().equals("")) {
					ta.append("학번을 입력하세요!\n");
				}
				if(tf3.getText().equals("")) {
					ta.append(stu.getSubjectName1()+"을 입력하세요!\n");
				}
				if(tf4.getText().equals("")) {
					ta.append(stu.getSubjectName2()+"을 입력하세요!\n");
				}
				if(tf5.getText().equals("")) {
					ta.append(stu.getSubjectName3()+"을 입력하세요!\n");
				}
				if(tf6.getText().equals("")) {
					ta.append(stu.getSubjectName4()+"을 입력하세요!\n");
				}
				if(tf7.getText().equals("")) {
					ta.append(stu.getSubjectName5()+"을 입력하세요!\n");
				}
				else { //텍스트필드가 다 채워져있으면
					
					for(Student numStu : SG.AL) {
			            if(tf2.getText().equals(numStu.getNum())) {
			            	ta.append("동일한 학번의 학생이 있습니다. 학번을 수정해주세요.\n");
			            	return;
			            }
					}
				
					
					stu.setName(tf1.getText()); //각 텍스트필드의 정보를 가져와 학생객체에 저장
					stu.setNum(tf2.getText());
					stu.setSubject1(Integer.parseInt(tf3.getText()));
					stu.setSubject2(Integer.parseInt(tf4.getText()));
					stu.setSubject3(Integer.parseInt(tf5.getText()));
					stu.setSubject4(Integer.parseInt(tf6.getText()));
					stu.setSubject5(Integer.parseInt(tf7.getText()));
					stu.getTotal();
					stu.getAvg();
		
					SG.AL.add(stu); //AL에 학생정보 추가
				
					tf1.setText(""); //각 텍스트필드의 값 지워줌
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
						ta.append(rank + " 등 " + tmpstu.toString()+"\n");
					}
					
					
				}
			}
			else if(str.equals("갱신")) { //갱신기능
				int rank = 0;            //AL의 정보를 정렬하여 textarea에 출력
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
			else if (str.equals("저장")) { //score.txt파일을 변경하는 부분
				try {                     //왜 try catch를 쓰는지는 잘 모름. 아마 예외사항 때문인거 같긴 함.
					FileWriter fileWriter = new FileWriter("score.txt", false); //score.txt라는 파일을 쓰기모드로 불러오고 false는 안의 정보를 다 지우고 새로 쓴다는 뜻임.
					String info; //한 줄 분량의 정보를 저장 할 변수
					for(Student stu : SG.AL) { //AL에 있는 정보를 차례로 학생객체에 저장
						info = stu.getName()+" " +stu.getNum()+" "
								+stu.getSubject1()+" "+stu.getSubject2()+" "+stu.getSubject3()+" "+stu.getSubject4()+" "+stu.getSubject5()+"\n"; //info변수에 학생한명에 대한
						fileWriter.write(info);                                                                                                  //정보를 넣고 파일에 입력
					}
					fileWriter.close(); //불러온 파일 닫아줌
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		    }
			else if(str.equals("검색")) { //검색기능, 여기는 좀 강화할 필요가 있어보임, tf3까지밖에 없는 것 같아서 그럼.
	            ta.setText("");
	            int count = 0; //만약 뭐라도 하나 불러왔다면 일치하는 정보가 하나라도 있는 것이므로 이를 판별하기위한 변수
	            int i;
	            if(SG.AL.size() < 1) {
	                ta.setText("정보가 없습니다! 정보를 입력해주세요.\n");
	            }
	            else if(!tf1.getText().equals("")) {
	                count = 0;
	                for(i=0; i<SG.AL.size(); i++) { //AL의 사이즈만큼 반복
	                	Student stu = SG.AL.get(i);
	                    if(stu.getName().equals(tf1.getText())) { //만약 불러온 학생의 정보가 일치한다면 해당 정보 textarea에 출력
	                        ta.append(SG.AL.get(i).toString()+"\n");
	                        count ++;    //만약 뭐라도 하나 불러왔다면 일치하는 정보가 하나라도 있는 것이므로 이를 판별하기위한 변수
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
	            if(count == 0) {  //만약 일치하는 정보가 없다면
	                ta.setText("일치하는 정보가 없습니다!\n");
	            }
	        }
			else if(str.equals("종료")) { //프로그램을 종료시켜버림, X와 동일한 기능
				System.exit(0);
			}
			
		}
	}

	class newWindow extends JFrame implements ActionListener{ // 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스, 세이하고 효진이가 설명해주면 좋을 것 같음.
		Button btnclose;
		newWindow() {
			setTitle("error");
			// 주의, 여기서 setDefaultCloseOperation() 정의를 하지 말아야 한다
	        // 정의하게 되면 새 창을 닫으면 모든 창과 프로그램이 동시에 꺼진다
			
			JPanel Windowpanel1 = new JPanel();
			setLayout(new FlowLayout());
			btnclose = new Button ("닫기");
	        
	        setContentPane(Windowpanel1);
	        
	        JLabel NewLabel = new JLabel("입력되지 않은 값이 있습니다.");
	        NewLabel.setFont(new Font("맑은 고딕", Font.BOLD,20));
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
			if(str.equals("닫기")) {
				dispose();
			}
		}
	}
		       

	       
