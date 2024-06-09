
public class StringOrder {

	public static void main(String[] args) {
	String word= "arrogant";
	System.out.println("Word: "+word);
	int indexC= word.indexOf("c");
	int index2=word.length();
	int index3=word.compareTo("rockets");
	if(!(indexC==-1))
	{
		System.out.println("This word contains c");
	}
	else
	{
		System.out.println("This word does not contain c");
	}
	if(index2>=6&&index2<=8)
	{
		System.out.println("This word is between 6 and 8 letters long");
	}
	else
	{
		System.out.println("This word in not between 6 and 8 letters long");
	}
	if(index3<0)
	{
		System.out.println("This word comes before rockets alphabetically");
	}
	else
	{
		System.out.println("This word does not come before rockets alphabetically");
	}
	
	}

}
