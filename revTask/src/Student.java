public class Student
{
private String name;
private int age;
private double gradeAverage;
public Student (String n, int a, double grade)
{
	name=n;
	age=a;
	gradeAverage=grade;
}

public String getName()
{
	return name;
}

public int getAge()
{
	return age;
}

public double getGradeAverage()
{
	return gradeAverage;
}

public String toString()
{
return "Student: " + name + "| Age: " + age + "| Average: "+ gradeAverage;

}
}