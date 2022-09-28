package math.controller;

import java.util.Scanner;

public class Controller
{
	private Scanner keyboardInput;
	
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
	}
	
	/**
	 * Starts the program flow and is called from the Runner
	 */
	public void start()
	{
		needToKnow();
		keyboardInput.nextLine();
		trigonometric();
		keyboardInput.nextLine();
		goodToKnow();
		
	}
	
	/**
	 * Demonstrating explicit casting of int and double values.
	 */
	private void explicitCasting()
	{
		int first = 5;
		int second = 10;
		
		int normalIntDivision = first / second;
		double castDivisionResult = (double) (first / second);
		double castOnlyNumerator = (double) first / second;
		double castOnlyDenominator = first / (double) second;
		
		System.out.println("The results of normal int division: " + normalIntDivision);
		System.out.println("The result of casting the problem as a double: " + castDivisionResult);
		System.out.println("The result of casting only the numerator as a double, then doing division: " + castOnlyNumerator);
		System.out.println("The result of casting only the denominator as a double, then doing division: " + castOnlyDenominator);
		
		
		keyboardInput.nextLine();
		
		double third = 3.1415;
		double fourth = 5.6789;
		
		double doubleDivision = fourth / third;
		int castAsIntDivision = (int) (fourth / third);
//		int castOnlyNumeratorAsInt = (int) fourth / third;
		
		System.out.println("The result of double division: " + doubleDivision);
		System.out.println("Only the *ENTIRE* equation can be cast as an int!!!" + castAsIntDivision);
	}
	
	/**
	 * Demonstrating implicit casting of int and double values.
	 */
	private void implicitCasting()
	{
		int implicitDemoInt = 5;
		
		System.out.println("Original value: " + implicitDemoInt);
		
		implicitDemoInt -= 3.14;
		
		System.out.println("Result after implicit cast using the -= operator: " + implicitDemoInt);
		
		double implicitDoubleDemo = 4.1234;
		
		System.out.println("Original double value: " + implicitDoubleDemo);
		
		implicitDoubleDemo *= implicitDemoInt;
		
		System.out.println("After implicitly casting an int as a double then multiplying via *= " + implicitDoubleDemo);
	}
	
	/**
	 * Demonstrating how to create a pseudo-random value.
	 */
	private void letsGetRandom()
	{
		double random = Math.random();
		
		while (random > 0.000_3)
		{
			System.out.println(random);
			random = Math.random();
		}
		
		keyboardInput.nextLine();
		
		int randomNumber = (int) (Math.random() * 10);
		
		while (randomNumber != 0)
		{
			System.out.println("Random integer: " + randomNumber);
			randomNumber = (int) (Math.random() * 10);
		}
		
		int shiftedRandom = (int) (Math.random() * 10) + 5;
		
		while (shiftedRandom < 13)
		{
			System.out.println("Shifted random integer: " + shiftedRandom);
			shiftedRandom = (int) (Math.random() * 10) + 5;
		}
	}
	
	/**
	 * Demonstrate the basic arithmetic operations of parentheses and +,-,*,/
	 */
	private void basicArithmetic()
	{
		System.out.println("Parens are just for grouping, no implicit multiplication!");
		
		System.out.println("Addition: 234 + 456 = " + (234 + 456));
		System.out.println("Subtraction: 4353 - 876543 = " + (4353 - 876543));
		System.out.println("Multiplication: 743 * 7896 = " + (743 * 7896));
		System.out.println("Division is special!!!");
		System.out.println("int division: 654 / 2134 = " + (654 / 2134));
		System.out.println("double division: 654.0 / 2134 = " + (654.0 / 2134));
	}

	/**
	 * Demonstrate the other M in PEMMDAS and exponentiation
	 */
	private void theRestOfPEMMDAS()
	{
		// The second M in PEMMDAS!
		// Modulo

		System.out.println("Here is a demo of modulo!");
		System.out.println("234 % 5 reads as 234 modulo 5 and the result is: " + (234 % 5));
		System.out.println("123 % 2 is: " + (123 % 2) + ", and 34567 % 200 is: " + (34567 % 200));

		keyboardInput.nextLine();
		System.out.println("Now lets work with exponents");
		double base = 2.0;
		double power = 5.0;

		double answer = Math.pow(base, power);
		System.out.println(base + " raised to the " + power + "th power is: " + answer);

		base = 4.0;
		power = 0.5;

		answer = Math.pow(base, power);
		System.out.println(base + " to the " + power + "th power is: " + answer);
	}

	/**
	 * What happens to really big and/or small numbers
	 */
	private void overflow()
	{
		System.out.println("Testing some weird things in Java!");
		System.out.println("The range of the int data type!");
		
		int big = Integer.MAX_VALUE;
		int small = Integer.MIN_VALUE;

		System.out.println("big contains: " + big);
		System.out.println(big + " + 1 is: " + (big + 1));

		System.out.println("small contains: " + small);
		System.out.println(small + " - 1 is :  " + (small - 1));

		keyboardInput.nextLine();
		System.out.println("The range and special values of the double data type!");

		double bigDouble = Double.MAX_VALUE;
		double smallDouble = Double.MIN_VALUE;

		System.out.println("bigDouble contains: " + bigDouble);
		System.out.println((bigDouble + 1) + " : is bigDouble + 1!");
		System.out.println((bigDouble + bigDouble) + " : is twice bigDouble!");

		System.out.println("smallDouble contains: " + smallDouble);
		System.out.println("smallDouble - 1 is: " + (smallDouble - 1));
		System.out.println("smallDouble + 1 is: " + (smallDouble + 1));
		System.out.println("smallDouble * 2 is: " + (smallDouble * 2.0));
		
		double divideByZero = -5.0 / 0.0;
		System.out.println("The result of -5.0 / 0 is : " + divideByZero);

		System.out.println("Interacting with infinity has a different result" );
		double specialValue = Double.POSITIVE_INFINITY / Double.NEGATIVE_INFINITY;
	
		System.out.println("∞ / -∞ is: " + specialValue);


	}

	/**
	 * Comparing numeric values in Java!
	 */
	private void mathematicalComparisons()
	{
		System.out.println("Comparing int values");
		int first = 7;
		int second = 5;

		System.out.println("first (7) == second (5) : " + (first == second));

		second = 7;
		System.out.println("first (7) == second (7) : " + (first == second));

		keyboardInput.nextLine();
		System.out.println("Comparing double values");
		
		double third = 3.14;
		double fourth = 3.3;
		double fifth = 1.1 + 1.1 + 1.1;

		System.out.println("third (3.14) * fourth (3.3) == third * fifth(1.1 + 1.1 + 1.1) : " + (third * 3.3 == third * (1.1 + 1.1 + 1.1)));
		System.out.println("fourth == fifth: " + (fourth == fifth));

		double closeEnough = 0.000_01;

		System.out.println("The difference of fourth and fifth is close enough: " + (Math.abs(fourth - fifth) < closeEnough));

		closeEnough = 0.000_000_000_000_000_1;

		System.out.println("The difference of fourth and fifth is close enough: " + (Math.abs(fourth - fifth) < closeEnough));
		
		double specialValue = Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;

		System.out.println("NaN == NaN : " + (specialValue == specialValue));
		System.out.println("∞ == ∞ : " + (Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY));
		System.out.println("-∞ == -∞ : " + (Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY));
		System.out.println("∞ == -∞ : " + (Double.POSITIVE_INFINITY == Double.NEGATIVE_INFINITY));
	}

	/**
	 * These Math methods are the ones you really NEED TO KNOW!
	 */
	private void needToKnow()
	{
		System.out.println("These are the *MUST KNOW* methods in the Java Math API");
		System.out.println("All Math methods are static and are called by the class name . method name");
		System.out.println("You cannot make your own instance of a Math object (private constructor!)");
		
		System.out.println("Point your hands at your stomach - what are you pointing to (abs)");
		System.out.println("Look at the shape of the graph - its a V! What has that graph - absolute value!");
		System.out.println("This method is overloaded to support supplying either double or int values.");
		Math.abs(0); 
		
		keyboardInput.nextLine();
		System.out.println("Comparisons are with Math.max and Math.min");
		System.out.println("These are probably the most helpful methods for problem solving in the Math library");
		System.out.println("They accept either a pair of int or double values, and by nesting calls within them you can figure a lot out!");
		
		int guessOne = (int) (Math.random() * 10);
		int guessTwo = (int) (Math.random() * 10);
		
		int biggerNumber = Math.max(guessOne, guessTwo);
		double smallerNumber = Math.min(Math.random(), Math.random());
		
		System.out.println("The bigger number was: " + biggerNumber);
		System.out.println("The smaller number was: " + smallerNumber);
		
		keyboardInput.nextLine();
		
		System.out.println("Exponentiation is handled with two methods Math.pow and Math.sqrt");
		System.out.println("Poor naming conventions leftover from C and a distinct lack of vowels 😾");
		System.out.println("Math.pow can do it all, but sqrt is great for common formula 😺");
		System.out.println("Remember that results are always double type so will need to be down cast if needed as an int");
		
		double exponent = 4;
		double base = 2.1;
		double result = Math.pow(base, exponent);		
		double squareRoot = Math.sqrt(3);
		int integerValueOfSquareRoot = (int) Math.sqrt(4);
		
		System.out.println("The result of 4 raised to the 2.1 power is: " + result);
		System.out.println("The square root of 3 is: " + squareRoot);
		System.out.println("The integer square root of 4 is: " + integerValueOfSquareRoot);
		
		keyboardInput.nextLine();
		
		System.out.println("(Pseudo) Randomness is handled with Math.random");
		System.out.println("This method generates a pseudorandom number in the range 0 ..< 1 AKA [0,1)");
		System.out.println("Most often combined with multiplication and casting the product to an int");
		
		double randomExample = Math.random();
		int randomInt = (int) Math.random() ; // Always 0
		int scalar = 10;
		System.out.println("Random double value: " + randomExample);
		System.out.println("Random int value: " + randomInt + ". Without a scalar and/or proper casting it is always zero! 😿");
		randomInt = (int) (Math.random() * scalar);
		System.out.println("Random int value: " + randomInt + ". With a scalar and proper casting it fits anywhere in the range!!! 😺");
		

	}
	
	/**
	 * Demonstration of the standard trigonometric functions in Java. 
	 */
	private void trigonometric()
	{
		System.out.println("The trigonometric functions are used in all sorts of real world calculations.");
		System.out.println("For some bizarre reason all the values and parameters are double");
		System.out.println("If 3.14 is not good enough, just use Math.PI: " + Math.PI);
		keyboardInput.nextLine();
		
		System.out.println("The standard trig functions of sine, cosine, and tangent all take a single double parameter representing the degree in radians");
		System.out.println("The inverse trig functions of arcsine, arccosine, and arctangent as well");
		System.out.println("All return the associated value in radians");
		System.out.println("For example here are the values for π/6 AKA 30°");
		
		double angle = Math.PI / 6.0;
		System.out.println("sine: " + Math.sin(angle) + ", arcsine: " + Math.asin(angle));
		System.out.println("cosine: " + Math.cos(angle) + ", arccosine: " + Math.acos(angle));
		System.out.println("tangent: " + Math.tan(angle) + ", arctangent: " + Math.tan(angle));
		System.out.println("Two parameter arctangent AKA get some theta (θ) from an (y,x) position: " + Math.atan2(30.2, 432.3));
		
		keyboardInput.nextLine();
		
		System.out.println("You can also convert to/from degrees/radian with 'inexact precision'");
		double degrees = Math.toDegrees(Math.PI / 2);
		double radians = Math.toRadians(degrees);
		System.out.println( "(Math.PI / 2) in degrees is: " + degrees + ". That result to radians is: " + radians);
		System.out.println();
	}
	
	/**
	 * Rounding and logarithms are also useful methods when working with mathematics and/or science problems in CS.
	 */
	private void goodToKnow()
	{
		System.out.println("The following methods in Math are useful, especially when working on problems involving science and math.");
		System.out.println("The round, ceiling, and floor methods all return a long; so casting down to an int is required.");
		System.out.println("Rounding works just like you learned in elementary school.");
		System.out.println("However, ceiling and floor don't care what the decimal value is, they go up/down regardless!");
		
		double smaller = 3.3;
		double bigger = 7.9;
		int roundedValue = (int) Math.round(smaller);
		int upperBound = (int) Math.ceil(smaller);
		int lowerBound = (int) Math.floor(bigger);
		
		System.out.println(smaller + " rounded is: " + roundedValue);
		System.out.println(smaller + " ceiling is: " + upperBound);
		System.out.println(bigger + " floor is: " + lowerBound);
		
		keyboardInput.nextLine();
		
		System.out.println("Logarithms are available in either natural (base ℯ) or base 10");
		double naturalLog = Math.log(2.0);
		double baseTenLog = Math.log10(100_000_000);
		
		System.out.println("The natural log of 2 is: " + naturalLog);
		System.out.println("The log base 10 of 100,000,000 is: " + baseTenLog);
		
	}
}
