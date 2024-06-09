import java.util.Scanner;
import java.util.ArrayList;
public class orderedList {

	public static void main(String[] args) {
		System.out.println("Number of words you wish to enter: ");
		Scanner scan1=new Scanner(System.in);
		int i=scan1.nextInt();
		System.out.println("Words you wish to enter: ");
		ArrayList<String> array1=new ArrayList<String> ();
		ArrayList<String> array2=new ArrayList<String> ();
		Scanner scan2=new Scanner(System.in);
		for(int k=0;k<i;k++)
		{
			
			String words=scan2.nextLine();
			array1.add(words);
		}
		String longest="";
		int maxLength=0;
		while(array1.size()>0)
		{
			for(int l=0; l<array1.size();l++)
			{
				if(array1.get(l).length()>maxLength)
				{
					maxLength=array1.get(l).length();
					longest=array1.get(l);
				}
			}
			for(int p=0;p<array1.size();p++)
			{
				if(array1.get(p).length()>=maxLength)
				{
					array2.add(longest);
					array1.remove(p);
				}

			}
			longest = "";
			maxLength = 0;
		}
		System.out.println(array2);
		}
	}

