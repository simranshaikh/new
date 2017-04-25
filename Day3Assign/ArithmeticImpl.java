package Day3Assign;

public class ArithmeticImpl extends Arithmatic2 {

	@Override
	public int subtraction(int a, int b) {
		int result =a-b;
		System.out.println(result);
		return result;
	}

	@Override
	public int subtraction(int a, int b, int c) {
		int result=a-b-c;
		System.out.println(result);
		return result;
	}

	@Override
	public double subtraction(double a, double b) {
		double result=a-b;
		System.out.println(result);
		return result;
	}

	@Override
	public double subtraction(int a, double b) {
		double result=a-b;
		System.out.println(result);
		return result;
	}

	@Override
	public float subtraction(float a, float b, float c) {
		float result=a-b-c;
		System.out.println(result);
		return result;
	}

}
