import java.util.Scanner;

public class Player
	{
	static String playerName;
	static int nameConfirmation;
	static int buttonChoice;

	public static void getsGenerated()
		{
		System.out.println("Instructor: Hello and welcome to your first day at BOARD Inc.");
		System.out.println();
		Game.delayTwoSec();
		System.out.println("Instructor: What is your name? I would like to get to know you.");
		Scanner userInput1 = new Scanner(System.in);
		String playerName = userInput1.nextLine();
		System.out.println("Instructor: What a nice name!");
		System.out.println();
		Game.delayTwoSec();
		System.out.println("Instructor: Unfortunately names are not allowed in BOARD.");
		System.out.println();
		Game.delayTwoSec();
		System.out.println("Instructor: You will be knon as Employee 1093839583938593859382919817439093701236234723472");
		System.out.println();
		Game.delayTwoSec();
		System.out.println("Instructor: Or 109 for short.");
		System.out.println();
		Game.delayTwoSec();
		System.out.println("Instructor: Is that okay for you?(1 for yes, 2 for no)");
		Scanner userInput2 = new Scanner(System.in);
		nameConfirmation = userInput2.nextInt();
		System.out.println("Instructor: I am glad you like it!  109 it is.");
		System.out.println();
		Game.delayTwoSec();
		System.out.println("Instructor: Well let's get started shall we!");
		System.out.println();
		Game.delayTwoSec();

		}

	public static void beginsJob()
		{
		Scanner userInput3 = new Scanner(System.in);
		buttonChoice = userInput3.nextInt();
		switch(buttonChoice)
			{
			case 0:
				{
				Choice.Zero();
				break;
				}
			case 1:
				{
				Choice.One();
				break;
				}
			case 2:
				{
				Choice.Two();
				break;
				}
			case 3:
				{
				Choice.Three();
				break;
				}
			case 4:
				{
				Choice.Four();
				break;
				}
			case 5:
				{
				Choice.Five();
				break;
				}
			case 6:
				{
				Choice.Six();
				break;
				}
			case 7:
				{
				Choice.Seven();
				break;
				}
			case 8:
				{
				Choice.Eight();
				break;
				}
			case 9:
				{
				Choice.Nine();
				break;
				}
			case 10:
				{
				Choice.Ten();
				break;
				}
			case 11:
				{
				Choice.Elleven();
				break;
				}
			case 12:
				{
				Choice.Twelve();
				break;
				}
			case 13:
				{
				Choice.Thirteen();
				break;
				}
			case 14:
				{
				Choice.Fourteen();
				break;
				}
			case 15:
				{
				Choice.Fifteen();
				break;
				}
			case 16:
				{
				Choice.Sixteen();
				break;
				}
			case 17:
				{
				Choice.Seventeen();
				break;
				}
			case 18:
				{
				Choice.Eighteen();
				break;
				}
			case 19:
				{
				Choice.Nineteen();
				break;
				}
			case 20:
				{
				Choice.Twenty();
				break;
				}
			case 21:
				{
				Choice.TwentyOne();
				break;
				}
			case 100:
				{
				Choice.OneHundred();
				break;
				}
			case 1000:
				{
				Choice.OneThousand();
				break;
				}
			default:
				{
				Choice.Default();
				break;
				}
			}
		}
		
	}

