
public class TriangleArea
{
	public static void main(String[] args)
	{
		int numA= 2;
		System.out.println("A= "+numA);
		int numB= 5;
		System.out.println("B= "+numB);
		int numC= 7;
		System.out.println("C= "+numC);
		System.out.println();
		double numS=((numA+numB+numC)/2.0);
		boolean statement1= numA+numB>numC&&numA+numC>numB&&numB+numC>numA;
		if (statement1)
		{
			System.out.println("Triangle area: "+Math.sqrt(numS*(numS-numA)*(numS-numB)*(numS-numC)));
				
		}
		else
		{
			System.out.println("Does not form triangle");
		}
	}
}
