import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this prog
		Scanner sc = new Scanner(System.in);
		int point = 25;
		System.out.println("What is your name?");
		String name = new String(sc.nextLine());
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = new String(sc.nextLine());
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String a = sc.nextLine();
		if(a.equals("Wizard")){System.out.println("You are very smart");}
		else if(a.equals("wizard")){System.out.println("You are very smart");}
		else if(a.equals("Warrior")){System.out.println("You are very strong");}
		else if(a.equals("warrior")){System.out.println("You are very strong");}
		else if(a.equals("Rogue")){System.out.println("You are very brave");}
		else if(a.equals("Rogue")){System.out.println("You are very brave");}
		else {System.out.println("You did not input a role");}
		
		System.out.println("You have 25 points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and charisma spend them as you like");
	
	
	    System.out.println("Strength(1-10):");
	    int b = sc.nextInt();
	    sc.nextLine();
	    if(b>10){System.out.println("number invalid, Strength was set to 0"); b=0;}
	    point-=b;
	    System.out.println("You have " +point+ " points left to spend.");
	    
	    System.out.println("Dexterity(1-10):");
	    int c = sc.nextInt();
	    sc.nextLine();
	    if(c>10){System.out.println("number invalid, Dexterity was set to 0"); c=0;}
	    point-=c;
	    System.out.println("You have " +point+ " points left to spend.");
	    
	    System.out.println("Intelligence(1-10):");
	    int d = sc.nextInt();
	    sc.nextLine();
	    if(d>10){System.out.println("number invalid, Intelligence was set to 0"); d=0;}
	    point-=d;
	    System.out.println("You have " +point+ " points left to spend.");
	    
	    System.out.println("Constitution(1-10):");
	    int e = sc.nextInt();
	    sc.nextLine();
	    if(e>10){System.out.println("number invalid, Constitution was set to 0"); e=0;}
	    point-=e;
	    System.out.println("You have " +point+ " points left to spend."); 
	    
	    System.out.println("Charisma(1-10):");
	    int f = sc.nextInt();
	    sc.nextLine();
	    if(f>10){System.out.println("number invalid, Charisma was set to 0"); f=0;}
	    point-=f;
	    System.out.println("You have " +point+ " points left to spend for later.");
	    
	    System.out.println("--------------------------------------------------");
	    
	    System.out.println("You are "  + name + " the " + title + " of CVHS");
	    System.out.println("You are " + a + " with the following stats");
	    System.out.println("Strength- " + b); 
	    System.out.println("Dexterity- " + c); 
	    System.out.println("Intelligence- " + d);
	    System.out.println("Constitution- " + e);
	    System.out.println("Charisma- " + f); 
	    
	}
}
