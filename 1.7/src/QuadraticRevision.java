
public class QuadraticRevision {

	public static void main(String[] args) {
		int numA= 1;
		int numB= 6;
		int numC= 10;
		System.out.println("A= "+numA);
		System.out.println("B= "+numB);
		System.out.println("C= "+numC);
		System.out.println();
		double result1= ((-numB+Math.sqrt(numB*numB-(4*numA*numC))))/(2*numA);
		double result2= ((-numB-Math.sqrt(numB*numB-(4*numA*numC))))/(2*numA);
		double discrim= ((numB*numB-(4*numA*numC)));
		boolean statement1= discrim>0;
		boolean statement2=discrim==0;
		boolean statement3=discrim<0;
		if(statement1)
		{
			System.out.print("Zeroes: ");
			System.out.print("x= "+result1);
			System.out.print("   x= "+result2);
		}
		if(statement2)
		{
			System.out.print("Zeroes: ");
			System.out.print("x= "+result1);
		}
		if(statement3)
		{
			System.out.println("No real roots");
		}
	
	}

}
