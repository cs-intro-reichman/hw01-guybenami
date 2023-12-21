// tests if three given integers form a triangle.

public class Triangle {
	public static void main(String[] args) {

		//inserting lengths into variables a, b and c
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		// first, print the asked pattern including the lengths
		// then, print the answer: true or false, whether the given lengths can form a triangle or not
		System.out.println(a + ", " + b + ", " + c + " : " + (a < (b+c) && b < (a+c) && c < (a+b)));
	}
}
