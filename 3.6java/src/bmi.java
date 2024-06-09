import java.util.Scanner;
public class bmi {

	public static void main(String[] args) {
		System.out.println("Enter weight in pounds: ");
		Scanner scan1=new Scanner(System.in);
		double wLB= scan1.nextDouble();
		System.out.println("Enter feet: ");
		Scanner scan2=new Scanner(System.in);
		double hFT=scan2.nextDouble();
		System.out.println("Enter inches: ");
		Scanner scan3=new Scanner(System.in);
		double hIN=scan3.nextDouble();
		double hMeters=((12*hFT+hIN)/39.37);
		double wKG=wLB/2.205;
		double bmi=wKG/(hMeters*hMeters);
		System.out.println("BMI: "+bmi);
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		if(18.5<=bmi && 24.9>bmi)
		{
			System.out.println("Normal");
		}
		if(25<=bmi && 29.9>bmi)
		{
			System.out.println("Overweight");
		}
		if(30<=bmi && 34.9>bmi)
		{
			System.out.println("Obese");
		}
		if(bmi>35)
		{
			System.out.println("Extremely Obese");
		}
	
		
		// TODO Auto-generated method stub

	}

}
