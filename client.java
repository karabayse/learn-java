public class YourName {
	public static void main(String[] args) {

		System.out.println("Kara");

	}
}

public class Variables {
	public static void main(String[] args) {

		int myNumber = 3;
		boolean isFun = true;
		char movieRating = 'A';

	}
}


public class WhiteSpace {
	public static void main(String[] args) {

		boolean isFormatted = false;System.out.println(isFormatted);
		System.out.println(isFormatted);
	}
}


public class Modulo {
	public static void main(String[] args) {

		int myRemainder = 20 % 9;
		System.out.println(myRemainder);

	}
}


public class Conditionals {
	public static void main(String[] args) {


		if (1 < 4 && 0 > 5) {

			System.out.println("You ordered a cup of hot, mint tea.");

		} else if (21 <= 19 || 17 >= 28) {

			System.out.println("You ordered freshly squeezed orange juice!");

		} else if ( !(true == true) ) {

			System.out.println("You ordered hot cocoa!");

		} else {

			System.out.println("You ordered a cup of Java!");

		}

		char answerChoice = 'C';

		switch (answerChoice) {

			case 'A': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			case 'B': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			case 'C': System.out.println("You answered: " + answerChoice + ". That is correct!");
								break;

			case 'D': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			default:
				System.out.println("Please select a valid answer choice.");


// BOOLEAN OPERATORS
System.out.println(true && true); // prints true
System.out.println(false && false); // prints false
System.out.println(false && true); // prints false
System.out.println(true && false); // prints false
System.out.println(2 < 3 && 4 < 5); // prints true

System.out.println(false || false); // prints false
System.out.println(false || true); // prints true
System.out.println(true || false); // prints true
System.out.println(true || true); // prints true
System.out.println(2 > 1 || 3 > 4); // prints true

System.out.println(!false); // prints true
System.out.println(!true); // prints false
System.out.println( !(4 <= 10) ); // prints false
