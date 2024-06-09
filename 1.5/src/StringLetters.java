
public class StringLetters {

	public static void main(String[] args) {
		String mainString= "horse";
		String sub1= "cow";
		String sub2="mouse";
		System.out.println("First word: "+mainString);
		System.out.println("Second word: "+sub1);
		System.out.println("Third word: "+sub2);
		int mainStringm= mainString.indexOf("m");
		System.out.println(mainStringm);
		int sub1m= sub1.indexOf("m");
		System.out.println(sub1m);
		int sub2m= sub2.indexOf("m");
		System.out.println(sub2m);
		boolean mainStringB= (!(mainStringm==-1));
		System.out.println(mainStringB);
		boolean sub1B= (!(sub1m==-1));
		System.out.println(sub1B);
		boolean sub2B= (!(sub2m==-1));
		System.out.println(sub2B);
		System.out.println(); 
		System.out.println("First word contains 'm': "+mainStringB);
		System.out.println("Second word contains 'm': "+sub1B);
		System.out.println("Third word contains 'm': "+sub2B);
		System.out.println();
		int alpha1=mainString.compareTo(sub1);
		
		boolean alpha1b=((alpha1<0));
		int alpha2=mainString.compareTo(sub2);
		
		boolean alpha2b=((alpha2<0));
		System.out.println("First word comes before second alphabetically: "+alpha1b);
		System.out.println("First word come before third alphabetically: "+alpha2b );

	}

}
