// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char symbol;
	cout <<"Please enter a symbol"<<endl;
	cin >> symbol;
	
	int length = 0; 
	cout << "Please enter the line length"<<endl;
	cin >> length;
	
	int xcord = 0;
	cout << "Please enter the x coordinate"<<endl;
	cin >> xcord;
	
	int ycord = 0;
	cout << "Please enter the y coordinate"<<endl;
	cin >> ycord;
	
    for(int x=0 ; x <= length; x++){
    gotoxy(xcord + x ,ycord);
    cout << symbol;
    }
    

}
