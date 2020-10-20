//토크나이저, 넥스트토큰 김학진
//정렬 김상호, 안덕우
//패널 취합 김학진, 김효진, 임세이
package Donkey;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class MainProgram extends JFrame {
	private static final long serialVersionUID = 1L; //이걸 선언해줘야 경고가 안생김. 아직 이유는 모름
	public JPanel1 jpanel1 = null; //각 판넬의 기능을 담는 객체를 선언
	public JPanel2 jpanel2 = null;
	public JPanel3 jpanel3 = null;


	public static void main(String[] args) throws IOException { //메인메소드
		MainProgram win = new MainProgram(); //메인메소드 객체로 선언
		StudentGroup SG = new StudentGroup(); //파일에 있는 정보를 받아오기 위해 StudentGroup객체 생성
        
        File file = new File("score.txt"); //score.txt라는 이름의 텍스트파일을 불러옴
		if(file.exists()) { //만약 파일이 존재한다면
			FileReader filereader = new FileReader(file); //파일을 읽는 모드로 불러옴
			BufferedReader br = new BufferedReader(filereader);//파일을 읽는 형태로 가져옴
	        
	        String line = null; //파일에 있는 정보중 한 줄 분량의 정보를 저장 할 변수
	        
	        while ((line=br.readLine()) != null) { //line변수에 한 줄 분량의 정보를 받아온다. 더 이상 읽어올 줄이 없으면 반복문 종료
				StringTokenizer st = new StringTokenizer(line); //line변수를 공백을 기준으로 나눠 읽는다.
				Student stu = new Student(); //학생정보를 임시적으로 담을 객체
				stu.setName(st.nextToken()); //nextToken()은 공백이 있기 전까지의 정보를 가져옴. 쓸떄마다 공백 다음으로 넘어가 그 다음의 공백전까지의 정보를 가져옴.
				stu.setNum(st.nextToken());  //그래서 이 아래의 코드를 보면 계속 nextToken()을 쓰는데 쓸때마다 공백기준으로 계속 그 다음 단어를 불러오기 때문에 계속 쓰는거임.
				stu.setSubject1(Integer.parseInt(st.nextToken()));
				stu.setSubject2(Integer.parseInt(st.nextToken()));
				stu.setSubject3(Integer.parseInt(st.nextToken()));
				stu.setSubject4(Integer.parseInt(st.nextToken()));
				stu.setSubject5(Integer.parseInt(st.nextToken()));
				stu.getTotal();
				stu.getAvg();
				SG.AL.add(stu); //stu에 임시적으로 담긴 데이터를 AL에 저장.
			}
	        br.close(); //불러온 파일 닫음. 안 닫으면 안됨. 자세한건 구글 ㄱㄱ.
        }
		else { //만약 파일이 존재하지 않는다면
            file.createNewFile(); //파일을 생성해줌
        }
		
		win.setTitle("당나귀 성적관리 프로그램"); //창의 제목
		win.jpanel1 = new JPanel1(); //각 판넬 객체를 처음 불러왔는데 이제 여기에 실질적인 판넬을 넣어줌.
		win.jpanel2 = new JPanel2();
		win.jpanel3 = new JPanel3();
		
		JTabbedPane jtab = new JTabbedPane(); //탭을 위한 객체
		jtab.setUI(new UI()); //탭의 모양을 정하기 위한 클래스
		
		jtab.setFont(new Font("맑은 고딕", Font.BOLD, 17)); //탭의 글자 모양
		jtab.addTab("입력", win.jpanel1); //각 탭의 이름과 어떤 판넬을 쓸지 결정하고 이름을 지정하여 탭에 추가
		jtab.addTab("수정", win.jpanel2);
		jtab.addTab("삭제", win.jpanel3);
		
		win.add(jtab); //추가된 탭을 메인객체에 추가
		
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //X를 누르면 바로 종료
		win.setSize(1800, 800); //창 사이즈
		win.setVisible(true); //창을 실체화
	}
}

//////////////////////////////////////////////////////////정렬을 위한 클래스
class Descend implements Comparator<Student> { //설명은 기성이가 좀 부탁해. 아니면 구글 검색도 좋고.
	public int compare(Student o1, Student o2) {
		return o2.compareTo(o1);
	}
}