#include<iostream>
#include<string>
#include<iomanip>
#include "util_manage.h"

using namespace std; 
class Name {
		string name;
	public:
		void setname(string name) {
			this->name = name;

		}
		string getname() {
			return name;
		}
	};

	class Subject {
		int subsco;
	public:

		void setsubsco(int subsco) {
			this->subsco = subsco;
		}
		int getsubsco() {
			return subsco;
		}
	};

	class Score {
		Name na;
		Subject mat;
		Subject eng;
		Subject kor;

	public:

		void setname(string name) {
			na.setname(name);
		}
		void setmatsco(int sco) {
			mat.setsubsco(sco);
		}
		int getmatsco() {
			return mat.getsubsco();
		}
		void setengsco(int sco) {
			eng.setsubsco(sco);
		}
		int getengsco() {
			return eng.getsubsco();
		}
		void setkorsco(int sco) {
			kor.setsubsco(sco);
		}
		int getkorsco() {
			return kor.getsubsco();
		}
		string getname() {
			return na.getname();
		}

		int getsum() {
			return getmatsco() + getengsco() + getkorsco();
		}
		float getavg() {
			return this->getsum() / 3.f;
		}
		float gettotalavg() {}
	};

	Score* aa;
    int num;

void func_menu_1() {
	
    
    cout << "몇명 입력하시겠습니까?";
    cin >> num;
    aa = new Score[num];
    for (int i = 0; i < num; i++) { //성적 입력  num만큼 입력
        string sn;
        cout << i + 1 << "번째 이름을 입력하시오 : ";
        cin >> sn;
        aa[i].setname(sn);
        for (int j = 0; j < 3; j++) {
            int sco;
            if (j == 0) {
                cout << "국어성적을 입력하시오 : ";
                cin >> sco;
                aa[i].setkorsco(sco);
            }
            if (j == 1) {
                cout << "영어성적을 입력하시오 : ";
                cin >> sco;
                aa[i].setengsco(sco);
            }
            if (j == 2) {
                cout << "수학성적을 입력하시오 : ";
                cin >> sco;
                aa[i].setmatsco(sco);
            }
        }
    }
    for (int i = 0; i < num; i++) { //성적 출력 num만큼 출력
        cout << "=   이름  ==     국어  ==   영어   ==   수학  ==   총점    == 평균 =\n";
        cout << "=  " << setw(3) << aa[i].getname();
        for (int j = 0; j < 3; j++) {
            if (j == 0) {

                cout << setw(11) << aa[i].getkorsco();
            }
            if (j == 1) {

                cout << setw(11) << aa[i].getengsco();
            }
            if (j == 2) {
                cout << setw(12) << aa[i].getmatsco();
            }
        }
        cout << setw(11) << aa[i].getsum();
        cout << setw(11) << aa[i].getavg() << "  =" << "\n";
        cout << "--------------------------------------------------------------------\n";
    }
}
int totallist[100];
void func_menu_6() {
	float total = 0;
	//전체학생 평균 계산, 저장
	for (int i = 0; i < num; i++) { //성적 출력 num만큼 출력
		cout << "학생 총 평균 : ";
		for (int j = 0; j < 3; j++) {
			if (j == 0) {
				aa[i].getkorsco();
			}
			if (j == 1) {
				aa[i].getengsco();
			}
			if (j == 2) {
				aa[i].getmatsco();
			}
		}
		aa[i].getsum();
		aa[i].getavg();
		totallist[i] += aa[i].getavg();
		total += aa[i].getavg();
	}
	cout << setw(11) <<  total/ num << "\n";
	cout << "--------------------------------------------------------------------\n";
};
void func_menu_7() {
	//성적순출력
	int space [10];
	for (int i = 0; i < num+1; i++) {
		if (totallist[i] < totallist[i + 1]) {
			space[i] = totallist[i + 1];
			totallist[i + 1] = totallist[i];
			totallist[i] = space[i];
		}
		else {
			space[i] = totallist[i];
			totallist[i] = totallist[i + 1];
			totallist[i + 1] = space[i];
		}
	}
	for (int i = 0; i < num; i++) {
		cout << totallist[i];
	}
}
void func_menu_8() {
	//삭제
    cout << "몇명을 삭제 하시겠습니까?";
    cin >> num;
    aa = new Score[num];
	delete[] aa;
}
void func_menu_9() {
	cout << "999" << endl;
	//한학생
}
void func_menu_10() {
	for (int i = 0; i < num; i++) { //성적 출력 num만큼 출력
		cout << "=   이름  ==     국어  ==   영어   ==   수학  ==   총점    == 평균 =\n";
		cout << "=  " << setw(3) << aa[i].getname();
		for (int j = 0; j < 3; j++) {
			if (j == 0) {

				cout << setw(11) << aa[i].getkorsco();
			}
			if (j == 1) {

				cout << setw(11) << aa[i].getengsco();
			}
			if (j == 2) {
				cout << setw(12) << aa[i].getmatsco();
			}
		}
		cout << setw(11) << aa[i].getsum();
		cout << setw(11) << aa[i].getavg() << "  =" << "\n";
		cout << "--------------------------------------------------------------------\n";
	}
}