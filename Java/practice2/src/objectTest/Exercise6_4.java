package objectTest;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	int no;
	int kor;
	int eng;
	int math;
	
	Student2(){ 
		
	}
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	return (kor+eng+math)/3;
	}
}