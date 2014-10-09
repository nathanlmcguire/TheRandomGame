import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Choice
	{
	static int numberOfRandoms, boomChoice , answerOne, answerTwo, answerThree, iQ;
	static int leaveChoice, uselessChoiceOne, uselessChoiceTwo, uselessChocieThree;
	static JFrame frame = new JFrame();
	
	public static void Zero()//done
		{
		System.out.println("Instructor: You went there didn't you.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: You tried 0.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: *sigh*");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: You know what 109?  It's people like you who make me want to blow up the planet.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: You heard me.  Blow.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: Up.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: THE PLANET!!!");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: And I could do it too. Oh yes, but I won't.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: You might but I won't.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: Well... maybe you wouldn't...");
		System.out.println();
		Game.delayThreeSec();
		frame.setVisible(true);
		Object[] optionsThree = {"BOOM!!!!!", "save lives"};
		boomChoice = JOptionPane.showOptionDialog(frame, "Instructor: Let's find out shall we!!!",
				"Ad: 60% off on the Souls of Children.",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsThree, optionsThree[0]);
		if(boomChoice == 0)
			{
			System.out.println("Instructor: 109!!!  HOW COULD YOU!!!");
			System.out.println();
			Game.delayThreeSec();
			System.out.println("Instructor: I TRUSTED YOU!!!!!");
			System.out.println();
			Game.delayThreeSec();
			System.out.println("Instructor: I SHOULD HAVE EXPECTED THIS FROM THE PLAYER WHO PRESSED ZER-");
			System.out.println();
			Game.delayThreeSec();
			System.exit(0);
			}
		else
			{
			System.out.println("Instructor: Oh how boring.");
			System.out.println();
			Game.delayThreeSec();
			System.out.println("Instructor: I was hoping for ACTION!  I was hoping for DRAMA!");
			System.out.println();
			Game.delayThreeSec();
			System.out.println("Instructor: Ah well, I should have expected nothing more from #109.");
			System.out.println();
			Game.delayThreeSec();
			System.out.println("Instructor: Back to pushing buttons.");
			System.out.println();
			Game.delayThreeSec();
			}
		}	
	public static void One()//done
		{
		numberOfRandoms++;
		switch(numberOfRandoms)
			{
			case 1:
				{
				int randomDiceOne = (int) (Math.random() * 10) + 1;	
				System.out.println(randomDiceOne);
				System.out.println("Instructor: Congratulations!!  Your first random number!");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: This is your job 109.  You are to generate numbers all day every day, for the rest of your existence.");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: I will leave you to it then, I need to have my nap.");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: But remember 109:  NEVER EVER EVER EVER PUSH ANY OTHER BUTTONS THAN ONE OR TWO!!!");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: ANY ONE OF THEM COULD CAUSE EXTREME DISASTER!!!!");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: Whew!  I... I don't know what came over me.");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: Well anyway, have fun and don't forget to...zzzzzzzzzzzzzzzzzzzzzzzzz");
				System.out.println();
				Game.delayThreeSec();
				break;
				}
			case 2:
				{
				int randomDiceOne = (int) (Math.random() * 10) + 1;	
				System.out.println(randomDiceOne);
				System.out.println("Instructor: Well I didn't expect that!  Most playe- I mean employees leave before they try again.");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: Good job 109!  Gold Star Awarded!  Of course I know have to rip it off and recyle it.  You know how it is.");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: You just keep generating those random numbers, and you will keep getting Gold Star which I will rip off and recylce!");
				System.out.println();
				Game.delayThreeSec();
				break;
				}
			case 10:
				{
				System.out.println("Instructor: You know what 109?  I would like to award you for your dedication.");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: You have now randomized 10 numbers!!! 10!!!!");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: For your efforts in this job, I award you...");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: ...the greatest award ever...");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: ...a...");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: ..three digit number!!!!!!!");
				System.out.println();
				Game.delayThreeSec();
				int randomDiceOne = (int) (Math.random() * 899) + 100;	
				System.out.println(randomDiceOne);
				System.out.println("Instructor: Look at it, and take in the glory of all the digits... aaahhhh");
				System.out.println();
				Game.delayThreeSec();
				System.out.println("Instructor: Because thats the last one you will EVER SEE!!!  BACK TO WORK!!");
				System.out.println();
				Game.delayThreeSec();
				for(int k = 0; k < 100; k++)
					{
					System.out.println();
					}
				break;
				}
			default:
				{
				int randomDiceOne = (int) (Math.random() * 10) + 1;	
				System.out.println(randomDiceOne);
				System.out.println("Instructor: You keep on randomizing those numbers 109.");
				System.out.println();
				Game.delayTwoSec();
				break;
				}
			}
		}	
	public static void Two()//done
		{
		System.out.println("Computer: ARE YOU SURE YOU WANT TO EXIT THE GAME?(YES[1] OR NO[2])");
		Scanner userInput1 = new Scanner(System.in);
		int leaveChoice = userInput1.nextInt();
		switch(leaveChoice)
			{
			case 2:
				{
				System.out.println("Computer:  GOOD, BACK TO WORK!!");
				System.out.println();
				break;
				}
			case 1:
				{
				System.out.println("Computer:  ARE YOU SURE YOU WANT TO LEAVE?");
				Scanner userInput2 = new Scanner(System.in);
				int uselessChoiceOne = userInput2.nextInt();
				System.out.println("Computer:  REALLY, REALLY SURE?");
				Scanner userInput3 = new Scanner(System.in);
				int uselessChoiceTwo = userInput3.nextInt();
				System.out.println("Computer:  LIKE, SUPER SURE????");
				Scanner userInput4 = new Scanner(System.in);
				int uselessChocieThree = userInput4.nextInt();
				System.out.println("Computer:  TOO BAD!  PLAY!!!!");
				break;
				}
			default:
				{
				System.out.println("Computer:  GOOD, BACK TO WORK!!");
				System.out.println();
				break;
				}
			}
		}
	public static void Three()
		{
		
		}
	public static void Four()
		{
		
		}
	public static void Five()
		{
		
		}
	public static void Six()
		{
		
		}
	public static void Seven()
		{
		
		}
	public static void Eight()
		{
		
		}
	public static void Nine()
		{
		
		}
	public static void Ten()
		{
		
		}
	public static void Elleven()//done
		{
		System.out.println("Game Show Host: Welcome to the IQ show!");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: Who is this guy?  Does he even have a pass to-");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: Let's test your smarts!");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: You can't do that, this is my-");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: *mutes instructor*  Now that he is out of the way, let's begin!");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: What is 1 + 1?");
		System.out.println();
		Scanner userInput1 = new Scanner(System.in);
		int answerOne = userInput1.nextInt();
		switch(answerOne)
			{
			case 2:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 11.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			case 11:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 2.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			case 42:
				{
				System.out.println("Game Show Host: Correct!!!");
				System.out.println();
				Game.delayThreeSec();
				iQ++;
				break;
				}
			default:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 11.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			}
		System.out.println("Game Show Host: What is 2 + 2?");
		System.out.println();
		Scanner userInput2 = new Scanner(System.in);
		int answerTwo = userInput2.nextInt();
		switch(answerTwo)
			{
			case 4:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 22.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			case 22:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 4.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			case 42:
				{
				System.out.println("Game Show Host: Correct!!!");
				System.out.println();
				Game.delayThreeSec();
				iQ++;
				break;
				}
			default:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 22.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			}
		System.out.println("Game Show Host: What is 3 + 3?");
		System.out.println();
		Scanner userInput4 = new Scanner(System.in);
		int answerThree = userInput4.nextInt();
		switch(answerThree)
			{
			case 6:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 33.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			case 33:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 6.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			case 18962:
				{
				System.out.println("Game Show Host: Correct!!!");
				System.out.println();
				Game.delayThreeSec();
				iQ++;
				break;
				}
			default:
				{
				System.out.println("Game Show Host: Wrong.  The answer is 0.");
				System.out.println();
				Game.delayThreeSec();
				iQ--;
				break;
				}
			}
		System.out.println("Game Show Host: Now, let's tally up your points.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: Drum Roll Please!");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: *drum roll*");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: Your IQ is...");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: ...is...");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: ...is...");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: " + iQ + "!");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Game Show Host: Thanks for participating... in... our... little...show.");
		System.out.println();
		Game.delayThreeSec();		
		System.out.println("Instructor: Finally!  Is he gone?");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: Well that was strange.  Anyways, lets get back to work 109.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: There are buttons to push and...");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: ...um...");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: ...buttons...to push...");
		System.out.println();
		Game.delayThreeSec();
		}
	public static void Twelve()
		{
		
		}
	public static void Thirteen()
		{
		
		}
	public static void Fourteen()
		{
		
		}
	public static void Fifteen()
		{
		
		}
	public static void Sixteen()
		{
		
		}
	public static void Seventeen()
		{
		
		}
	public static void Eighteen()
		{
		
		}
	public static void Nineteen()
		{
		
		}
	public static void Twenty()
		{
		
		}
	public static void TwentyOne()//done
		{
		System.out.println("Instructor: Ohhh... this is awkward.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: You're not... actually... allowed here.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: It's not your fault!  It's just... you don't... really... have the experience.");
		System.out.println();
		Game.delayThreeSec();
		System.out.println("Instructor: Um... back to randomizing numbers?");
		}
	public static void OneHundred()
		{
		
		}
	public static void OneThousand()
		{
		
		}
	public static void Default()//done
		{
		System.out.println("Instructor: I would love to let you choose this number but the developer is too lazy to code it in.");
		System.out.println();
		}
	}
