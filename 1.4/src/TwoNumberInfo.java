
public class TwoNumberInfo {

	public static void main(String[] args) {
		int num1=4941;
		int num2=9216;
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println();
		boolean statement1=(num1>=2000&&num1<=3000)||(num2>=2000&&num2<=3000);
		System.out.println("At least one number is 2000-3000: "+statement1);
		System.out.println();
		boolean statement2= (num1%4==0 && num2%4==0);
		System.out.println("Both numbers are multiples of 4: "+statement2);
		System.out.println();
		boolean statement3= ((num1%1000)/100>((num1%100)/10));
		System.out.println("num1's hundreds digit is greater than the tens digit: "+statement3);
		System.out.println();
		boolean statement4= (num2%10+(num2/10%10)+(num2/100%10)+(num2/1000%10))>=17;
		System.out.println("The sum of num2's digits is 17 or higher: "+statement4);
		System.out.println();
		boolean statement5= (num1%10!=1)&&(num1/10%10!=1)&&(num1/100%10!=1)&&(num1/1000%10!=1);
		System.out.println("num1 does not contain any ones as digits: "+statement5);
	}

}
