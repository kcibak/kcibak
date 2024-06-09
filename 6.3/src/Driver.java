import java.util.Scanner;
public class Driver  {

	public static void main(String[] args) {
	Scanner scan1=new Scanner(System.in);
	System.out.println("Enter word 1");
	String word1=scan1.nextLine();
	System.out.println("Enter word 2");
	String word2=scan1.nextLine();
	System.out.println();
	SwapHalf swapped=new SwapHalf(word1,word2);
	String newWord=swapped.scrambleWord();
	System.out.print("SwapHalf word: ");
	System.out.println(newWord);
	System.out.println();
	PairSwap mixed=new PairSwap(word1,word2);
	String newWord2=mixed.scrambleWord();
	System.out.print("PairSwap word: ");
	System.out.println(newWord2);
	}

}
