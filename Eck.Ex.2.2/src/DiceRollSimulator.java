/** Eck Chapter 2 Exercise 2.2
 * Program to simulate dice roll.
 * @author Joel
 *
 */
public class DiceRollSimulator {
	public static void main(String[] args) {
		int diceRoll1; 
		int diceRoll2;
		diceRoll1 = (int)(Math.random()*6 + 1);
		diceRoll2 = (int)(Math.random()*6 + 1);
		System.out.print("The first die comes up ");
		System.out.println(diceRoll1);
		System.out.print("The second die comes up ");
		System.out.println(diceRoll2);
		System.out.print("The total roll is ");
		System.out.println(diceRoll1 + diceRoll2);
	}
}
