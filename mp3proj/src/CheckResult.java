
public class CheckResult
{
	public static int getNumX(String[] code, String[] guess)
	{
		int x=0;
		for(int c=0;c<code.length;c++)
		{
			if(code[c].equals(guess[c]))
			{
				x++;
			}
		}
		return x;
	}
	public static int getNumO(String[] code, String[] guess)
	{
		String[] a1=new String[4];
		String[] a2=new String[4];
		int o=0;
		for(int z=0;z<4;z++)
		{
			a1[z]=code[z];
		}
		for(int y=0;y<4;y++)
		{
			a2[y]=guess[y];
		}
		for(int z=0;z<4;z++)
		{
			if(a1[z].equals(a2[z]))
			{
				a1[z]="!";
				a1[z]="!";
			}
		}
		if(a1[0].equals(a2[1])&&!a1[0].equals("!")&&!a2[0].equals("!"))
		{
			o++;
		}
		if(a1[0].equals(a2[2])&&!a1[0].equals("!")&&!a2[2].equals("!"))
		{
			o++;
		}
		if(a1[0].equals(a2[3])&&!a1[0].equals("!")&&!a2[3].equals("!"))
		{
			o++;
		}
		if(a1[1].equals(a2[0])&&!a1[1].equals("!")&&!a2[0].equals("!"))
		{
			o++;
		}
		if(a1[1].equals(a2[2])&&!a1[1].equals("!")&&!a2[2].equals("!"))
		{
			o++;
		}
		if(a1[1].equals(a2[3])&&!a1[1].equals("!")&&!a2[3].equals("!"))
		{
			o++;
		}
		if(a1[2].equals(a2[0])&&!a1[2].equals("!")&&!a2[0].equals("!"))
		{
			o++;
		}
		if(a1[2].equals(a2[1])&&!a1[2].equals("!")&&!a2[1].equals("!"))
		{
			o++;
		}
		if(a1[2].equals(a2[3])&&!a1[2].equals("!")&&!a2[3].equals("!"))
		{
			o++;
		}
		if(a1[3].equals(a2[0])&&!a1[3].equals("!")&&!a2[0].equals("!"))
		{
			o++;
		}
		if(a1[3].equals(a2[1])&&!a1[3].equals("!")&&!a2[1].equals("!"))
		{
			o++;
		}
		if(a1[3].equals(a2[2])&&!a1[3].equals("!")&&!a2[2].equals("!"))
		{
			o++;
		}
		return o;
	}
}