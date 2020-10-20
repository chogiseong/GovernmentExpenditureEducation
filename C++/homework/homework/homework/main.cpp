#include<iostream>
#include<string>
#include<iomanip>
#include "util_manage.h"

using namespace std;

typedef struct {
	char menu;
	void(*fptr)();

}MenuFunc;

MenuFunc funcMap[] = {
	{'1', func_menu_1},
	{'2', func_menu_6},
	{'3', func_menu_7},
	{'4', func_menu_8},
	{'5', func_menu_9},
	{'6', func_menu_10}
};

void showMenus(){
	cout << "1.  �л� ���� ����" << endl;
	cout << "2.  ��ü �л��� ��� ��� �� ����" << endl;
	cout << "3.  ������ ���" << endl;
	cout << "4.  ����" << endl;
	cout << "5.  �� �л��� ���� ���" << endl;
	cout << "6. ��ü �л��� ���� ���" << endl;
	cout << "q.  ����" << endl;
}

int excuteMenu(char menu) {

	int result = 1;

	if (menu < '1' || menu > '6') {
		cout << "�߸��� �Է��Դϴ�." << endl;
		return 0;
	}

	for (int i = 0; i < sizeof(funcMap) / sizeof(MenuFunc); i++) {
		if (funcMap[i].menu == menu) {
			funcMap[i].fptr();
			result = true;
			break;
		}
	}

	return result;
}



int main() {
	showMenus();

	while (1) {
		char menu = NULL;

		cout << "\r\n������ �޴��� �����ϼ���: " << endl;
		cin >> menu;

		if (menu == 'q') {
			cout << "���α׷��� �����մϴ�" << endl;
			break;
		}
		
		if (!excuteMenu(menu)) {
			cout << "�߸��� ����Դϴ�. �ٽ� �޴��� �����ϼ��� \n" << endl;
		}

	}

}