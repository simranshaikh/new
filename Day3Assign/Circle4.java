package Day3Assign;

public class Circle4 implements  GeometryMethod 
		{
	@Override
	public double calArea(double r) {
		double result=PI*r*r;
		System.out.println(result);
		return result;
	}

	@Override
	public double calCircumference(double r) {
		double result=2*PI*r;
		System.out.println(result);
		return result;
	}




}
