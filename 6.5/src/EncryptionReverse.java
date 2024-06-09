
public class EncryptionReverse implements Password {

	private String input;
	public  EncryptionReverse(String i)
	{
		input=i;
	}
	public void encrypt(String i)
	{
		String output="";
		for(int a=i.length()-1;a>-1;a--)
		{
			output=output+i.substring(a,a+1);
		}
		System.out.println(output);
	}
  }


