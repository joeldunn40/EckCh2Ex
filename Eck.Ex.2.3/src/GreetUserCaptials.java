/** Eck Chapte 2 Exercise 2.3
 * Program to ask the user for a name
 * then print a greeting to the user
 * with the user name in upper case
 * @author Joel
 *
 */

// import textio.TextIO; 
import java.util.Scanner;

public class GreetUserCaptials {
	public static void main(String[] args) {
		String userInput; // string containing user entered name
		String userUpper; // name converted to upper case

		Scanner stdin = new Scanner( System.in);
		
		System.out.println("What is your name?"); // ask for username
		//userInput = TextIO.getln(); // get name using TextIO module
		userInput = stdin.nextLine(); // get name using Scanner module
		userUpper = userInput.toUpperCase(); // convert to upper case
		
		System.out.println("Greetings, " + userUpper + ", pleased to meet you!");
		
	}
}
