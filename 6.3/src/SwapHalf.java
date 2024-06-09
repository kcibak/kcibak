
public class SwapHalf extends WordMixer {
	public SwapHalf(String w1, String w2)
	{
		super(w1,w2);
	}
	
	public String scrambleWord()
	{
		String firstHalf1=new String("");
		String firstHalf2=new String("");
		String secHalf1=new String("");
		String secHalf2=new String("");
		if(getWord1().length()%2==0)
		{
		 firstHalf1=getWord1().substring(0,(getWord1().length()/2));
		 secHalf1=getWord1().substring(getWord1().length()/2);
		}
		if(getWord1().length()%2!=0)
		{
			firstHalf1=getWord1().substring(0,(getWord1().length()/2+1));
			secHalf1=getWord1().substring(getWord1().length()/2+1);
		}
		if(getWord2().length()%2==0)
		{
			firstHalf2=getWord2().substring(0,getWord2().length()/2);
			secHalf2=getWord2().substring(getWord2().length()/2);
		}
		if(getWord2().length()%2!=0)
		{
			firstHalf2=getWord2().substring(0,(getWord2().length()/2+1));
			secHalf2=getWord2().substring(getWord2().length()/2+1);
		}
		
		return secHalf2+firstHalf2+secHalf1+firstHalf1;
		
		
	}
}
