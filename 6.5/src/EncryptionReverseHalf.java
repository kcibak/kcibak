
public class EncryptionReverseHalf implements Password {

	private String input;
	public EncryptionReverseHalf(String i)
	{
		input=i;
	}
	public void encrypt(String i)
	{
		String firstHalf="";
		String secHalf="";
		if(i.length()%2==0)
		{
			firstHalf=i.substring(0,i.length()/2);
			secHalf=i.substring(i.length()/2);
		}
		if(i.length()%2!=0)
		{
			firstHalf=i.substring(0,i.length()/2+1);
			secHalf=i.substring(i.length()/2+1);
		}
		System.out.println(secHalf+firstHalf);
	}
}
