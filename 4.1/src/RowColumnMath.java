import java.util.Scanner;
public class RowColumnMath {

	public static void main(String[] args) {
	System.out.println("Enter numbers here: ");
	int [][] array1=new int[4][3];
	Scanner scan1=new Scanner(System.in);
	for(int k=0; k<array1.length; k++)
	{
		for(int j=0; j<array1[0].length;j++)
		{
			int arrayNums=scan1.nextInt();
			array1[k][j]=arrayNums;
		}
			
	}
	for (int j = 0; j<array1.length; j++)
	{
		for (int k = 0; k< array1[0].length; k++)
		{
			System.out.print(array1[j][k]+" ");
		}
		System.out.println();
	}
	System.out.println();
	int[] array2=new int[4];
	int sum=0;
	for(int num=0;num<array2.length;num++)
	{
		for(int num2=0;num2<array1[0].length;num2++)
		{
			sum=array1[num][num2]+sum;
		}
		array2[num]=sum;
		sum=0;
	}
	System.out.println("Sum of all rows: ");
	for (int l = 0; l<array2.length; l++)
	{
	System.out.print(array2[l]+" ");	
	}
	System.out.println();
	System.out.println();
	int[] array3=new int[3];
	int sum2=0;
	for(int numm=0;numm<array1[0].length;numm++)
	{
		for(int num3=0;num3<array1.length;num3++)
		{
			sum2=array1[num3][numm]+sum2;
		}
		array3[numm]=sum2;
		sum2=0;
	}
	System.out.println("Sum of all columns: ");
	for (int m = 0; m<array3.length; m++)
	{
	System.out.print(array3[m]+" ");	
	}
	System.out.println();
	int numBig=0;
	if(array1[0][0]>array1[0][2]&&array1[1][1]>array1[3][0]&&array1[0][0]>array1[3][2])
	{
		numBig=array1[0][0];
	}
	else if(array1[0][2]>array1[0][0]&&array1[0][2]>array1[3][0]&&array1[0][2]>array1[3][2])
	{
		numBig=array1[0][2];
	}
	else if(array1[3][0]>array1[0][0]&&array1[3][0]>array1[0][2]&&array1[3][0]>array1[3][2])
	{
		numBig=array1[3][0];
	}
	else if(array1[3][2]>array1[0][0]&&array1[3][2]>array1[0][2]&&array1[3][2]>array1[3][0])
	{
		numBig=array1[3][2];
	}
	else
	{
		numBig=numBig;
	}
	System.out.println();
	System.out.println("Greatest of the 4 corners: "+numBig);
	}

}
