//��ũ������, �ؽ�Ʈ��ū ������
//���� ���ȣ, �ȴ���
//�г� ���� ������, ��ȿ��, �Ӽ���
package Donkey;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class MainProgram extends JFrame {
	private static final long serialVersionUID = 1L; //�̰� ��������� ��� �Ȼ���. ���� ������ ��
	public JPanel1 jpanel1 = null; //�� �ǳ��� ����� ��� ��ü�� ����
	public JPanel2 jpanel2 = null;
	public JPanel3 jpanel3 = null;


	public static void main(String[] args) throws IOException { //���θ޼ҵ�
		MainProgram win = new MainProgram(); //���θ޼ҵ� ��ü�� ����
		StudentGroup SG = new StudentGroup(); //���Ͽ� �ִ� ������ �޾ƿ��� ���� StudentGroup��ü ����
        
        File file = new File("score.txt"); //score.txt��� �̸��� �ؽ�Ʈ������ �ҷ���
		if(file.exists()) { //���� ������ �����Ѵٸ�
			FileReader filereader = new FileReader(file); //������ �д� ���� �ҷ���
			BufferedReader br = new BufferedReader(filereader);//������ �д� ���·� ������
	        
	        String line = null; //���Ͽ� �ִ� ������ �� �� �з��� ������ ���� �� ����
	        
	        while ((line=br.readLine()) != null) { //line������ �� �� �з��� ������ �޾ƿ´�. �� �̻� �о�� ���� ������ �ݺ��� ����
				StringTokenizer st = new StringTokenizer(line); //line������ ������ �������� ���� �д´�.
				Student stu = new Student(); //�л������� �ӽ������� ���� ��ü
				stu.setName(st.nextToken()); //nextToken()�� ������ �ֱ� �������� ������ ������. �������� ���� �������� �Ѿ �� ������ ������������ ������ ������.
				stu.setNum(st.nextToken());  //�׷��� �� �Ʒ��� �ڵ带 ���� ��� nextToken()�� ���µ� �������� ����������� ��� �� ���� �ܾ �ҷ����� ������ ��� ���°���.
				stu.setSubject1(Integer.parseInt(st.nextToken()));
				stu.setSubject2(Integer.parseInt(st.nextToken()));
				stu.setSubject3(Integer.parseInt(st.nextToken()));
				stu.setSubject4(Integer.parseInt(st.nextToken()));
				stu.setSubject5(Integer.parseInt(st.nextToken()));
				stu.getTotal();
				stu.getAvg();
				SG.AL.add(stu); //stu�� �ӽ������� ��� �����͸� AL�� ����.
			}
	        br.close(); //�ҷ��� ���� ����. �� ������ �ȵ�. �ڼ��Ѱ� ���� ����.
        }
		else { //���� ������ �������� �ʴ´ٸ�
            file.createNewFile(); //������ ��������
        }
		
		win.setTitle("�糪�� �������� ���α׷�"); //â�� ����
		win.jpanel1 = new JPanel1(); //�� �ǳ� ��ü�� ó�� �ҷ��Դµ� ���� ���⿡ �������� �ǳ��� �־���.
		win.jpanel2 = new JPanel2();
		win.jpanel3 = new JPanel3();
		
		JTabbedPane jtab = new JTabbedPane(); //���� ���� ��ü
		jtab.setUI(new UI()); //���� ����� ���ϱ� ���� Ŭ����
		
		jtab.setFont(new Font("���� ���", Font.BOLD, 17)); //���� ���� ���
		jtab.addTab("�Է�", win.jpanel1); //�� ���� �̸��� � �ǳ��� ���� �����ϰ� �̸��� �����Ͽ� �ǿ� �߰�
		jtab.addTab("����", win.jpanel2);
		jtab.addTab("����", win.jpanel3);
		
		win.add(jtab); //�߰��� ���� ���ΰ�ü�� �߰�
		
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //X�� ������ �ٷ� ����
		win.setSize(1800, 800); //â ������
		win.setVisible(true); //â�� ��üȭ
	}
}

//////////////////////////////////////////////////////////������ ���� Ŭ����
class Descend implements Comparator<Student> { //������ �⼺�̰� �� ��Ź��. �ƴϸ� ���� �˻��� ����.
	public int compare(Student o1, Student o2) {
		return o2.compareTo(o1);
	}
}