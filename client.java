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


// CONDITIONAL STATEMENTS
if (9 > 2) {
    System.out.println("Control flow rocks!");
}

public class If {
	public static void main(String[] args) {

		if (4 > 3) {

			System.out.println("Access granted.");

		}

	}
}

if (1 < 3 && 5 < 4) {
    System.out.println("I defy the Boolean laws!")
} else {
    System.out.println("You can thank George Boole!");
}


// TERNARY CONDITIONAL
int pointsScored = 21;

char gameResult = (pointsScored > 20) ? 'W' : 'L';
System.out.println(gameResult);

public class Ternary {
	public static void main(String[] args) {

		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);

	}
}


// SWITCH STATEMENT
int restaurantRating = 3;

switch (restaurantRating) {

    case 1: System.out.println("This restaurant is not my favorite.");
      break;

    case 2: System.out.println("This restaurant is good.");
      break;

    case 3: System.out.println("This restaurant is fantastic!");
      break;

    default: System.out.println("I've never dined at this restaurant.");
      break;
}

public class Switch {
	public static void main(String[] args) {

		char penaltyKick = 'L';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break;
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}


// OBJECT-ORIENTED JAVA
// Incorporates classes, objects, methods
public class Mouse extends Rodentia {

	String name;

	public Mouse(String name) {

		this.name = name;

	}

	public void eat() {

		System.out.println(name + " ate some cheese pizza!");

	}

	public void solveMaze(int minutes) {

		System.out.println(name + " solved the maze in " + minutes + " minutes!");

	}

	public static void main(String[] args) {

		Mouse ratly = new Mouse("Ratly");
		ratly.eat();
		ratly.solveMaze(3);
		ratly.order();

	}

}


// CLASS CONSTRUCTOR
class Car {

    // instance variable
    int modelYear;

    public Car(int year) {

        modelYear = year;
    }
}
