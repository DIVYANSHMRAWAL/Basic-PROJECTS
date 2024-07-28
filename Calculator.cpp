#include <iostream>

using namespace std;
int main() {
	
	//Variable declaration:--
	double first_num;
	double secound_num;
	char operation;
	//Variable declaration section ends:--
	
	//==========================================================================
	//Accepting 1st , 2nd and operation from user :--
	cout<<"Enter 1st number = ";
	cin>>first_num;
	
	cout<<"Enter Operation = ";
	cin>>operation;
	
	cout<<"Enter 2nd number = ";
	cin>>secound_num;
	//Userinput section ends
	
	//===========================================================================
	
	//Calculating and printing result
	cout<<"Result = ";
	switch(operation){
		
		case '+' :
		cout<<first_num+secound_num;
		break;
			
		case '-' :
		cout<<first_num-secound_num;
		break;
			
		case '*' :
		cout<<first_num*secound_num;
		break;
			
		case '/' :
		cout<<first_num/secound_num;
		break;
				
	}
	return 0;
}
