import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = new String(sc.nextLine());
		System.out.println("what is your age?");
		int age = sc.nextInt();
		System.out.println("what month is your birthday?");
		int month = sc.nextInt();
		System.out.println("What Year is your birthday?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double amount = sc.nextDouble();
		
	}
}
