import java.util.Scanner;
public class ClassStudentTest {
	
	public static void main(String[] args) {
		
		Student[] arr1=new Student[5];
		Scanner scanS=new Scanner(System.in);
		Scanner scanI=new Scanner(System.in);
		Scanner scanD=new Scanner(System.in);
		for(int a=0;a<5;a++)
		{
			System.out.println("Name: ");
			String name=scanS.nextLine();
			System.out.println("Age: ");
			int age=scanI.nextInt();
			System.out.println("Grade average: ");
			double grade=scanD.nextDouble();
			arr1[a]=new Student(name,age,grade);
		}
		for(int b=0;b<5;b++)
		{
			String out=arr1[b].toString();
			System.out.println(out);
		}
		String[] arr2=ClassStudent.classRoster(arr1);
		for(int c=0;c<arr2.length;c++)
		{
			System.out.print(arr2[c]+" ");
		}
		System.out.println();
		double av=ClassStudent.averageAge(arr1);
		System.out.println("Average Age: "+av);
		String[] arr3=ClassStudent.letterGrade(arr1);
		for(int d=0;d<arr3.length;d++)
		{
			System.out.print(arr3[d]+" ");
		}
	}

}
