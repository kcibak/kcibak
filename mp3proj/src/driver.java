import java.util.Scanner;
public class driver {

	public static void main(String[] args) {
		String[] arr1=new String[4];
		String[] arr2=new String[4];
		for(int a=0;a<arr1.length;a++)
		{
			int random=(int)(Math.random()*6+1);
			if(random==1)
			{
				arr1[a]="red";
			}
			if(random==2)
			{
				arr1[a]="blue";
			}
			if(random==3)
			{
				arr1[a]="green";
			}
			if(random==4)
			{
				arr1[a]="yellow";
			}
			if(random==5)
			{
				arr1[a]="orange";
			}
			if(random==6)
			{
				arr1[a]="brown";
			}
		}
		Scanner scanS=new Scanner(System.in);
		for(int e=0;e<8;e++)
		{
			System.out.println("Guess: ");
			for(int b=0;b<arr2.length;b++)
			{
			String thing=scanS.next();
			arr2[b]=thing;
			}
			int X=CheckResult.getNumX(arr1, arr2);
			int O=CheckResult.getNumO(arr1,arr2);
			System.out.print("Result: ");
			for(int p=0;p<X;p++)
			{
				System.out.print("X");
			}
			for(int z=0;z<O;z++)
			{
				System.out.print("O");
			}
			System.out.println();
			if(X==4)
			{
				System.out.println("Correct!");
				e=8;
			}
			if(e==7)
			{
				System.out.println("You lose");
			}
		}
	}

}
