
public class Quadratic {

	public static void main(String[] args) {
		int numA= 1;
		int numB= -8;
		int numC=12;
		double result1= ((-numB+Math.sqrt(numB*numB-(4*numA*numC))))/(2*numA);
		double result2= ((-numB-Math.sqrt(numB*numB-(4*numA*numC))))/(2*numA);
		System.out.println("A= "+numA);
		System.out.println("B= "+numB);
		System.out.println("C= "+numC);
		System.out.print("Zeros: ");
		System.out.print("x= "+result1);
		System.out.print("   x= "+result2);
		System.out.println();
	}

}
