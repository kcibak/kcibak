import java.util.Random;
import java.util.Scanner;
public class rockPaperScissors {

	public static void main(String[] args) {
		String rock="rock";
		String paper="paper";
		String scissor="scissor";
		int wins=0;
		int rock1=0;
		int paper1=0;
		int scissor1=0;
		System.out.println("DIRECTIONS: Enter rock, paper, or scissor to try you luck against the ruthless computer!");
		System.out.println();
		for(int turn=1;turn<=5;turn++)
		{	
			Scanner scanS=new Scanner(System.in);
			Random generator=new Random();
			int compNum = generator.nextInt(3);
			String playMove=new String("");
			System.out.println("Your move: ");
			playMove=scanS.nextLine();
			String compMove = new String("");
		if(compNum==0&&playMove.equals("rock"))
		{
			System.out.println("Computer's move: "+rock);
			System.out.println("Tie game");
			rock1++;
		}
		else if(compNum==1&&playMove.equals("paper"))
		{
			System.out.println("Computer's move: "+paper);
			System.out.println("Tie game");
			paper1++;
		}
		else if(compNum==2&&playMove.equals("scissor"))
		{
			System.out.println("Computer's move: "+scissor);
			System.out.println("Tie game");
			scissor1++;
		}
		else if(compNum==0&&playMove.equals("paper"))
		{
			compMove="rock";
			System.out.println("Computer's move: "+compMove);
			System.out.println("You win!");
			wins++;
			paper1++;
		}
		else if(compNum==0&&playMove.equals("scissor"))
		{
			compMove="rock";
			System.out.println("Computer's move: "+compMove);
			System.out.println("Computer wins");
			scissor1++;
		}
		else if(compNum==1&&playMove.equals("rock"))
		{
			compMove="paper";
			System.out.println("Computer's move: "+compMove);
			System.out.println("Computer wins");
			rock1++;
		}
		else if(compNum==1&&playMove.equals("scissor"))
		{
			compMove="paper";
			System.out.println("Computer's move: "+compMove);
			System.out.println("You win!");
			wins++;
			scissor1++;
		}
		else if(compNum==2&&playMove.equals("rock"))
		{
			compMove="scissor";
			System.out.println("Computer's move: "+compMove);
			System.out.println("You win!");
			wins++;
			rock1++;
		}
		else if(compNum==2&&playMove.equals("paper"))
		{
			compMove="scissor";
			System.out.println("Computer's move: "+compMove);
			System.out.println("Computer wins");
			paper1++;
			
		}
		else
		{
			System.out.println("ERROR");
			
		}
		System.out.println();
		
		}
		
		System.out.println("Player's wins: "+wins);
		System.out.print("The player played rock "+rock1+" time(s), ");
		System.out.print("paper "+paper1+" time(s), ");
		System.out.println("and scissor "+scissor1+" time(s).");
		
	}}


