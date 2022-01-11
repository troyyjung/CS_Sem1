import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String a = sc.nextLine();
		if(a.equals("Wizard")){System.out.println("You are very smart");}
		else if(a.equals("wizard")){System.out.println("You are very smart");}
		else if(a.equals("Warrior")){System.out.println("You are very strong");}
		else if(a.equals("warrior")){System.out.println("You are very strong");}
		else if(a.equals("Rogue")){System.out.println("You are very brave");}
		else if(a.equals("Rogue")){System.out.println("You are very brave");}
		else {System.out.println("You did not input a role");}
		
	}
}
