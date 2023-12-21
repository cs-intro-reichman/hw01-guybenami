//computing the sum of two integers given by user

public class AddTwo {
	public static void main(String[] args) {
		//inserting 2 integers input from user into variables num1 and num2
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		//calculating sum of the 2 integers
		int sum = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
}