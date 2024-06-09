import java.util.Scanner;
public class gratuity {

	public static void main(String[] args) {
		System.out.println("Enter your subtotal: ");
		Scanner scan1=new Scanner(System.in);
		double subt=scan1.nextDouble();
		System.out.println("Enter your gratuity rate: ");
		Scanner scan2=new Scanner(System.in);
		double grate=scan2.nextDouble();
		double tip;
		double total;
		tip=subt*(grate*0.01);
		total=tip+subt;
		System.out.println("The gratuity is $"+tip+" and the total is $"+total);
		
		// TODO Auto-generated method stub

	}

}
