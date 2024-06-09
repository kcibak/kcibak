public abstract class WordMixer
{
private String word1;
private String word2;
// Sets word1 to w2 and word2 to w2.
public WordMixer(String w1, String w2)
	{
		word1=w1;
		word2=w2;
	}
public String getWord1()
	{
		return word1;
	}
public String getWord2()
	{
		return word2;
	}
abstract String scrambleWord();
}