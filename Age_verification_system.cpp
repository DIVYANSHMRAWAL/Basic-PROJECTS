#include <iostream>
using namespace std;
int main() {
	int userinput;
	
	cout<<"Enter your age : ";
	cin>>userinput;
	
	if(userinput>=18){
		cout<<"You are eligible to give vote.";
	}
	
	else{
		cout<<"You are not eligible to give vote.";
	}
	return 0;
}
