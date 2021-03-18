
/**
 * To demonstrate some methods found in the Math class.
 * 
  */
import java.util.*;

public class MathDemo {

	public double squareRoot(double rootIn) {
		return Math.sqrt(rootIn);
	}

	public void rollDice() {
		int score;
		score = (int) (Math.random() * 6) + 1;
		System.out.println("You rolled a " + score);
	}

	public void findThePower() {
		double base, exponent;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you wish to raise to the power");
		base = sc.nextDouble();
		System.out.println("Enter the power you wish to raise the number to");
		exponent = sc.nextDouble();
		System.out.print("The number " + base + " raised to the power " + exponent + " = ");
		System.out.println(Math.pow(base, exponent));
	}

	public void generateLottoNumber() {
		// generates 7 random numbers from 1 to 59 and returns them as a lotto number
		int[] lottoNumber;
		int luckyDip;
		int i;
		for (i = 1; i <= 7; i++) {
			luckyDip = (int) (Math.random() * 59) + 1;
			System.out.println(luckyDip);
		}

	}

}
