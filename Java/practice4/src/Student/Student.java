package Student;

class Student {
	String name;
	String number;
	int score_kor;
	int score_eng;
	int score_mat;
	int score_avg;
	int score_all;
	
	Student() { //성적 값 전달해주는 메서드
		score_kor = 10;
		score_eng = 20;
		score_mat = 30;
		return;
		}
	
	Student(String name, String number, int score_kor,int score_eng,int score_mat, int score_avg, int score_all){//생성자 초기화 해주는 값을 전달받아 초기화시켜줌
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
	
	
	String get1() {//스트링 전달해주는 메서드
		return "성적은 : "+score_kor+","+score_eng+","+score_mat+" 총점은 : " + score_all + " 평균은 : " + score_avg;
	}
	String get2() {
		return " 총점은 : " + score_all + " 평균은 : " + score_avg;
	}
}

