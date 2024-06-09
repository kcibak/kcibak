import java.util.Scanner;
public class sumDigits{
	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		Scanner scan1=new Scanner(System.in);
		long num=scan1.nextLong();
		System.out.println("The sum of the digits is: "+sumDigitss(num));
		
	}

		public static int sumDigitss(long num) {
			int sum=0;
			int temp=(int)Math.abs(num);
			int length=String.valueOf(num).length();
			for(int i=0;i<length;i++)
			{
				sum+=temp%10;
				temp=temp/10;
			}
			return sum;
			

		}

	}


