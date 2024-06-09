
public class PairSwap extends WordMixer{
	public PairSwap(String w1,String w2)
	{
		super(w1,w2);
	}
	public String scrambleWord()
	{
		String mixedWord=getWord2()+getWord1();
		String newWord=new String("");
		for(int a=0;a<mixedWord.length()-1;a+=2)
		{
			newWord=newWord+mixedWord.substring(a+1,a+2)+mixedWord.substring(a,a+1);
		}
		if(mixedWord.length()%2!=0)
		{
			newWord=newWord+mixedWord.substring(mixedWord.length()-1);
		}
		return newWord;
	}

}
