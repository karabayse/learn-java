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
class Car extends Vehicle {

		// instance variable
    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    // new method
    public void startEngine() {

        System.out.println("Vroom!");

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007);
				myFastCar.startEngine();
    }
}

// INHERITANCE by use of "extends"
class Vehicle {

    public void checkBatteryStatus() {

        System.out.println("The battery is fully charged and ready to go!");

    }
}




import java.util.*;

public class Olympics {

	public static void main(String[] args) {

		//Some Olympic sports

		ArrayList<String> olympicSports = new ArrayList<String>();
		olympicSports.add("Archery");
		olympicSports.add("Boxing");
		olympicSports.add("Cricket");
		olympicSports.add("Diving");

		System.out.println("There are " + olympicSports.size() + " Olympic sports in this list. They are: ");

		for (String sport: olympicSports) {
			System.out.println(sport);
		}

		//Host cities and the year they hosted the summer Olympics

		HashMap<String, Integer> hostCities = new HashMap<String, Integer>();

		hostCities.put("Beijing", 2008);
		hostCities.put("London", 2012);
		hostCities.put("Rio de Janeiro", 2016);

		for (String city: hostCities.keySet()) {

			if (hostCities.get(city) < 2016) {

				System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");

			} else {

				System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");

			}
		}

	}

}




// FOR LOOP
for (int counter = 0; counter < 5; counter++) {

    System.out.println("The counter value is: " + counter);

}

public class For {
	public static void main(String[] args) {

		for (int waterLevel = 0; waterLevel < 7; waterLevel++) {

			System.out.println("The pool's water level is at " + waterLevel + " feet.");

		}

	}

}


// ARRAYLIST
import java.util.ArrayList;

public class Temperatures {

	public static void main(String[] args) {

    	ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
			// manipulation
			weeklyTemperatures.add(78);
    	weeklyTemperatures.add(67);
    	weeklyTemperatures.add(89);
    	weeklyTemperatures.add(94);

			// insertion
			weeklyTemperatures.add(2, 111);
			// get
			System.out.println(weeklyTemperatures.get(1));
			// iterating --> for loop
			for (int j = 0; j < weeklyTemperatures.size(); j++) {
      System.out.println(weeklyTemperatures.get(j));
    }
			// for each loop
			for (Integer temperature : weeklyTemperatures) {
			System.out.println(temperature);
		}

	}
}


// HASHMAP
import java.util.HashMap;

public class Restaurant {
	public static void main(String[] args) {

	HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

	// manipulation
	restaurantMenu.put("Turkey Burger", 13);
 	restaurantMenu.put("Naan Pizza", 11);
 	restaurantMenu.put("Cranberry Kale Salad", 10);
	// access
	System.out.println(restaurantMenu.get("Naan Pizza"));

	System.out.println(restaurantMenu.size());
	// iterating over a HashMap
	for (String item : restaurantMenu.keySet()) {

	System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");


	}
}
