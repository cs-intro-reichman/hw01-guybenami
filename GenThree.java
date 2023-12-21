public class GenThree {
	public static void main(String[] args) {

		//inserting 2 integers given by the user into variables min and max
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);

		// create 3 random numbers which are greater or equal to min and lower then max using the Math.random() function
		int random_num1 = (int)(Math.random()*(max-min)+min);
		int random_num2 = (int)(Math.random()*(max-min)+min);
		int random_num3 = (int)(Math.random()*(max-min)+min);

		// print the 3 random numbers
		System.out.println(random_num1);
		System.out.println(random_num2);
		System.out.println(random_num3);

		// print the smallest number between the 3 using the Math.min() function
		System.out.println("The minimal generated number was " + Math.min(random_num1, Math.min(random_num2, random_num3)));
	}
}