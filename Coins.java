public class Coins {
	public static void main(String[] args) {

		//inserting dollar amount in cents from user input into num
		int num = Integer.parseInt(args[0]);

		//calculating how many quarters can be used
		int quarters_count = num/25;

		//calculating how many cents are left after using max amount of quarters
		int cents_count = num%25;
		
		System.out.println("Use " + quarters_count + " quarters and " + cents_count + " cents");
	}
}