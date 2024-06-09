import java.util.Scanner;
public class ArrayAverager {

	public static void main(String[] args) {
	Scanner scan1=new Scanner(System.in);
	Scanner scan2=new Scanner(System.in);
	System.out.print("# of words you wish to enter: ");
	int numWords=scan1.nextInt();
	System.out.println();
	System.out.println("Enter questions here: ");
	String[] words=new String[numWords];
	for(int num=0;num<numWords;num++)
	{
		words[num]=scan2.nextLine();
	}
	int lon=-1000;
	int small=1000;
	String longWord=new String();
	String shortWord=new String();
	for(int numm=0;numm<numWords;numm++)
	{
		if(words[numm].length()>lon)
		{
			lon=words[numm].length();
			longWord=words[numm];
		}
		else if(words[numm].length()<small)
		{
			small=words[numm].length();
			shortWord=words[numm];
		}
		
	}
	System.out.println();
	System.out.println("Shortest word: "+shortWord);
	System.out.println("Longest word: "+longWord);
	double sum=0;
	for(int nummm=0;nummm<numWords;nummm++)
	{
		sum=words[nummm].length()+sum;
	}
	double average=sum/numWords;
	System.out.println("Average of all word lengths: "+average);
	}
	

}
