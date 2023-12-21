
public class LinearEq {
	public static void main(String[] args) {

		// inserting double type coefficients into variables a, b and c
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);

		//the given equation is --> a * X + b = c
		//calculating x
		double x = (c-b)/a;
		
		System.out.println(a + " * x + " + b + " = " + c);
		System.out.println("x = " + x);
	}
}