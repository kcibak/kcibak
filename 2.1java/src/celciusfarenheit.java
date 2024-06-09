import java.util.Scanner;
public class celciusfarenheit {

	public static void main(String[] args) {
		System.out.println("Enter degree in Celsius");
		Scanner scanS=new Scanner(System.in);
		double cels=0;
		cels=scanS.nextDouble();
		double out;
		out=(9.0/5)*cels+32;
		System.out.println(cels+" Celsius is "+out+" Farenheit");
		// TODO Auto-generated method stub

	}

}
