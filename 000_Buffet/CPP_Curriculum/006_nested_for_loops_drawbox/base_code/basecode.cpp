// base code file
#include "./hfiles/poole.h"

//////////////////////////////////////////////////////////////////
/////

main(){
	srand(time(NULL));
	// write code here
	
	
   char symbol;
	cout <<"Please enter a symbol"<<endl;
	cin >> symbol;
	
	int length;
	cout << "Please enter the box length"<<endl;
	cin >> length;
	
	int width =0;
	cout << "Please enter the box width"<<endl;
	cin >> width;
	
	for(int i=1; i < length; i++){
		for(int cond = 1; cond <=width; cond = cond +1){
			gotoxy(cond,i +9);
			cout<<symbol;
		}
	}
	

	
	
	
	
	
	
	
	
   
		
	
   

		
	

}
