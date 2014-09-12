import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Game
	{

	public static void main(String[] args)
		{
		Player.getsGenerated();
		Instructor.explainsJob();
		while(true)
			{
			Player.beginsJob();
			}
		}
	public static void delayOneSec()
		{
		try
			{
			TimeUnit.SECONDS.sleep(1);	
			}
		catch (InterruptedException e)
			{
			
			}
		}
	public static void delayTwoSec()
		{
		try
			{
			TimeUnit.SECONDS.sleep(2);	
			}
		catch (InterruptedException e)
			{
			
			}
		}
	public static void delayThreeSec()
		{
		try
			{
			TimeUnit.SECONDS.sleep(3);	
			}
		catch (InterruptedException e)
			{
			
			}
		}
	}
