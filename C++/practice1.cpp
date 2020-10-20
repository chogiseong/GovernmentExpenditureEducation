#include <iostream>
#include <stdio.h>
using namespace std;

int input(int &a) {
	a ++;
	cout << a << endl;
	return a;
}

int change(int &a) {
	a = a * -1;
	cout << a << endl;
	return a;
}

int pointer(int* a) {
	
	cout << a << endl;
	return *a;
}

int* ptr1 = new int[10]

int main() {
	int a = 99;
	input(a);
	change(a);
	pointer(&a);
	length(a);
	return 0;
}