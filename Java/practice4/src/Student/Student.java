package Student;

class Student {
	String name;
	String number;
	int score_kor;
	int score_eng;
	int score_mat;
	int score_avg;
	int score_all;
	
	Student() { //���� �� �������ִ� �޼���
		score_kor = 10;
		score_eng = 20;
		score_mat = 30;
		return;
		}
	
	Student(String name, String number, int score_kor,int score_eng,int score_mat, int score_avg, int score_all){//������ �ʱ�ȭ ���ִ� ���� ���޹޾� �ʱ�ȭ������
		this.name = name;
		this.number = number;
		this.score_kor = score_kor;
		this.score_eng = score_eng;
		this.score_mat = score_mat;
		this.score_avg = score_avg;
		this.score_all = score_all;
	}
	
	void set(int score_kor,int score_eng,int score_mat, int score_avg, int score_all) {
		this.score_kor = (20);
		this.score_eng = (30);
		this.score_mat = (40);
	}
	
	int TotalAverage(int score_kor,int score_eng,int score_mat) {
		this.score_all = score_kor + score_eng + score_mat;
		this.score_avg = score_all/3;
		return score_all;
	}
	
	void test() {
		this.score_all = score_kor + score_eng + score_mat;
		this.score_avg = score_all/3;
	}
	
	
	String get1() {//��Ʈ�� �������ִ� �޼���
		return "������ : "+score_kor+","+score_eng+","+score_mat+" ������ : " + score_all + " ����� : " + score_avg;
	}
	String get2() {
		return " ������ : " + score_all + " ����� : " + score_avg;
	}
}

