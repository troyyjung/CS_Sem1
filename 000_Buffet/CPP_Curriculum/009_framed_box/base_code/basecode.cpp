// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
	char symbol;
	cout <<"Please enter border symbol"<<endl;
	cin >> symbol;
	
	int height;
	cout << "Please enter the box height"<<endl;
	cin >> height;
	
	int width =0;
	cout << "Please enter the box width"<<endl;
	cin >> width;
	
	
	for(int i=1; i < height; i++){
		for(int cond = 1; cond <=width; cond = cond +1){
			cout<<symbol;
		}
	}

}
