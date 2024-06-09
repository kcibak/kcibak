import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		int[] array1 = new int[8];
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter numbers here");
		for(int a=0;a<8;a++)
		{
			array1[a]=scan1.nextInt();
		}
		for(int c=0;c<array1.length-1;c++)
		{
			for(int d=c+1;d<array1.length;d++)
			{
				if(array1[c]>array1[d])
				{
					int temp=array1[c];
					array1[c]=array1[d];
					array1[d]=temp;
				}
			}
		}
		System.out.println("least to greatest: ");
		for(int f=0;f<array1.length;f++)
		{
			System.out.print((" | "+array1[f])+" | ");
		}
		System.out.println();
		System.out.println("greatest to least: ");
		for(int e=7;e>-1;e--)
		{
			System.out.print((" | "+array1[e])+ " | ");
		}
	}

}