#include<iostream>
#include "util_manage.h"

using namespace std;

char const* arrMenuStr[] = {
	"1.  �л� ���� ����",
	"2.  ���� ���� ����",
	"3.  ���� ���� ����",
	"4.  ���� ���� ����",
	"5.  ��� ���� ��� �� ����",
	"6.  ��ü �л��� ��� ��� �� ����",
	"7.  ������ ���",
	"8.  ����",
	"9.  �� �л��� ���� ���",
	"10. ��ü �л��� ���� ���",
	"q.  ����" 
};

typedef struct {
	char menu;
	void(*fptr)();

}MenuFunc;

MenuFunc funcMap[] = {
	{'1', func_menu_1},
	{'2', func_menu_2},
	{'3', func_menu_3},
	{'4', func_menu_4},
	{'5', func_menu_5},
	{'6', func_menu_6},
	{'7', func_menu_7},
	{'8', func_menu_8},
	{'9', func_menu_9},
};

void showMenus() {
	for (int i = 0; i < sizeof(arrMenuStr) / sizeof(char*); i++) {
		cout << arrMenuStr[i] << endl;
	}
}

int excuteMenu(char menu) {

	int result = 1;

	if (menu < '1' || menu > '9') {
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