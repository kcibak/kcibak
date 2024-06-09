
public class financialapp {

	public static void main(String[] args) {
		double tuition=10000;
		for(int i=0;i<10;i++)
		{
			tuition=tuition+(tuition*0.05);
		}
		System.out.println("Tuition on tenth year: $"+tuition);
		double t1=tuition+(tuition*0.05);
		double t2=t1+(t1*0.05);
		double t3=t2+(t2*0.05);
		double t4=t3+(t3*0.05);
		double x=t1+t2+t3+t4;
		System.out.println("4-year tuition after tenth year: $"+x);

	}

}
