import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);// the command window when you compile and run this program.
		System.out.println("Input a random number 1-1000.");
		int a = sc.nextInt();
		
		Random rand = new Random();
		int b = rand.nextInt(999)+ 1;
		
		System.out.print(b); 
		System.out.println(" was the correct answer");
		
		if(a==b)
		{System.out.println("Great job that is the correct answer!");}
		else if(a>b){System.out.println("That is greater than the correct answer!");}
		else if (a<b){System.out.println("That is less than the correct answer!");}
		
	}
}
