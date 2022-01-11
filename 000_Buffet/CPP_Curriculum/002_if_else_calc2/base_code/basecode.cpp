// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int a = 0;
	int b = 0;
	

	
    cout<<"Please enter your first number"<<endl;
    cin>>a;
    cout <<"Please enter your second number"<<endl;
    cin>>b;
    cout <<"Please enter your operation"<<endl;
    char c;
    cin >> c;
    if(c=='+'){cout<<"Your number is:"<<a+b;}
    else if(c== '-'){cout<<"Your number is:"<<a-b;}
    else if(c=='*'){cout<<"Your number is:"<<a*b;}
    else if(c=='/'){cout<<"Your number is:"<<a/b;}
    else{cout<<"Operation invalid"<<endl;}
    
    
    
     
    
    
}
