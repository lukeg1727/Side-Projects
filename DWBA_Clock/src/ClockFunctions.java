import java.util.Scanner;
public class ClockFunctions {

	int gameSeconds;
	int gameMinutes;
	int shotClockSeconds;
	int shortenedClockSeconds;
	
	Scanner gameTime = new Scanner(System.in);
	Scanner shotTime = new Scanner(System.in);
	Scanner shortenedTime = new Scanner(System.in);

	ClockFunctions() {
		
	}
	
	public void SetGameClock() {
		System.out.println("Please input the amount of time for the game clock in seconds: ");
		gameSeconds = gameTime.nextInt();
	}
	public void SetShotClock() {
		System.out.println("Please input the amount of time for the shot clock in seconds: ");
		shotClockSeconds = shotTime.nextInt();
	}
	public void SetShortenedClock() {
		System.out.println("Please input the amount of time for the shortened clock in seconds: ");
		shortenedClockSeconds = shortenedTime.nextInt();
	}
	
}
