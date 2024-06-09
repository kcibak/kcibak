import java.util.Scanner;
public class TestAverage {

	public static void main(String[] args) {
		Scanner scanS=new Scanner(System.in);
		System.out.print("# of grades you wish to enter: ");
		int numGrades=scanS.nextInt();
		double[] grades=new double[numGrades];
		System.out.println();
		System.out.println("Enter grades here: ");
		for(int num=0;num<numGrades;num++)
		{
			
			grades[num]=scanS.nextInt();
		}
		int sum=0;
		double average=0;

		for(int num2=0;num2<numGrades;num2++)
		{
			
			sum+=grades[num2];
			average=sum/(double)numGrades;
		}
		System.out.println("Average: "+average);
		double min=999;
		double max=0;
		for(int num3=0;num3<numGrades;num3++)
		{
			if(grades[num3]>max)
			{
				max=grades[num3];
			}
			else if(grades[num3]<min&&grades[num3]<max)
			{
				min=grades[num3];			}
			else
			{
				int non=0;
			}
			
		}
		System.out.println("Lowest grade: "+min);
		System.out.println("Highest grade: "+max);
		double sum2=sum-min;
		double av2=sum2/(numGrades-1.0);
		System.out.println("Average (with lowest grade dropped): "+av2);
	}
	
	

}
