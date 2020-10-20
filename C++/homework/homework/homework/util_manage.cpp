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
	
    
    cout << "��� �Է��Ͻðڽ��ϱ�?";
    cin >> num;
    aa = new Score[num];
    for (int i = 0; i < num; i++) { //���� �Է�  num��ŭ �Է�
        string sn;
        cout << i + 1 << "��° �̸��� �Է��Ͻÿ� : ";
        cin >> sn;
        aa[i].setname(sn);
        for (int j = 0; j < 3; j++) {
            int sco;
            if (j == 0) {
                cout << "������� �Է��Ͻÿ� : ";
                cin >> sco;
                aa[i].setkorsco(sco);
            }
            if (j == 1) {
                cout << "������� �Է��Ͻÿ� : ";
                cin >> sco;
                aa[i].setengsco(sco);
            }
            if (j == 2) {
                cout << "���м����� �Է��Ͻÿ� : ";
                cin >> sco;
                aa[i].setmatsco(sco);
            }
        }
    }
    for (int i = 0; i < num; i++) { //���� ��� num��ŭ ���
        cout << "=   �̸�  ==     ����  ==   ����   ==   ����  ==   ����    == ��� =\n";
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
	//��ü�л� ��� ���, ����
	for (int i = 0; i < num; i++) { //���� ��� num��ŭ ���
		cout << "�л� �� ��� : ";
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
	//���������
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
	//����
    cout << "����� ���� �Ͻðڽ��ϱ�?";
    cin >> num;
    aa = new Score[num];
	delete[] aa;
}
void func_menu_9() {
	cout << "999" << endl;
	//���л�
}
void func_menu_10() {
	for (int i = 0; i < num; i++) { //���� ��� num��ŭ ���
		cout << "=   �̸�  ==     ����  ==   ����   ==   ����  ==   ����    == ��� =\n";
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