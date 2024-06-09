public class ClassStudent
{

public static String[] classRoster(Student[] classList)
{
	String[] arr=new String[classList.length];
	for(int a=0;a<classList.length;a++)
	{
		arr[a]=classList[a].getName();
	}
	return arr;
}

public static double averageAge(Student[] classList)
{
	double av=0;
	for(int a=0;a<classList.length;a++)
	{
		av+=(double)classList[a].getAge();
	}
	av=av/classList.length;
	return av;
}

public static String[] letterGrade(Student[] classList)
{
	String[] arr=new String[classList.length];
	for(int a=0;a<classList.length;a++)
	{
		if(classList[a].getGradeAverage()<60)
		{
			arr[a]="F";
		}
		if((classList[a].getGradeAverage())<=69&&classList[a].getGradeAverage()>=60)
		{
			arr[a]="D";
		}
		if(classList[a].getGradeAverage()<=79&&classList[a].getGradeAverage()>=70)
		{
			arr[a]="C";
		}
		if(classList[a].getGradeAverage()<=89&&classList[a].getGradeAverage()>=80)
		{
			arr[a]="B";
		}
		if(classList[a].getGradeAverage()>=90)
		{
			arr[a]="A";
		}
	}
	return arr;
}
}