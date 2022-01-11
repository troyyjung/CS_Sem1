// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here

	cout << "                                           *                                *                      " << endl;
	cout << "                                          * *                             *   *                     " << endl;
	cout << "                                         * * *                          *       *                   " << endl;
	cout << "                                        * * * *                        + + + + + +                " << endl;
	cout << "                                       * * * * *                       +         +        " << endl;
	cout << "                                      * * * * * *   *                  +   + +   +      " << endl;
	cout << "                                          * *      + +                 +   + +   +       " << endl; 
	cout << "                                          * *      + +                 + + + + + +                " << endl; 
	

	
	char snowflake;
	cout << "Add snowflakes use (*)" <<endl;
	cin >> snowflake;
	
	gotoxy(60,1);                       
    cout << snowflake << endl;
	sleep(1);
	gotoxy(60,1);
	cout << " "<<endl;
	sleep(1);
	
	gotoxy(25,1);
	cout << snowflake << endl;
	sleep (1);
	gotoxy(25,1);
	cout << " " << endl;
	sleep(1);
	
	gotoxy(60,3);
	cout << snowflake<<endl;
	sleep(1);
	gotoxy(60,3);
	cout << " "<<endl;
	sleep(1);
	
	gotoxy(25,3);
	cout << snowflake<<endl;
	sleep(1);
	gotoxy(25,3);
	cout << " "<<endl;
	sleep(1);
    
    gotoxy(60,5);
	cout << snowflake<<endl;
	sleep(1);
	gotoxy(60,5);
	cout << " "<<endl;
	sleep(1);
	
	gotoxy(25,5);
	cout << snowflake<<endl;
	sleep(1);
	gotoxy(25,5);
	cout << " "<<endl;
	sleep(1);
	

		
	
	

    
	
	
	


}
