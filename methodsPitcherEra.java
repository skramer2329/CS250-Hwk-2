import java.util.Scanner;

public class methodsPitcherEra {
	public static void main(String[] args) {

		Scanner stdId = new Scanner(System.in);

		String name = name(stdId); // Returns full name
		double pitcherEra = pitcherEra(stdId, name); // returns ERA

		System.out.println(name + "'s era is: " + pitcherEra); // Prints full name and ERA

	}

	// Gets pitcher's first and last name
	public static String name(Scanner stdId) {

		System.out.println("What is the pitcher's first name: ");
		String firstName = stdId.nextLine();

		System.out.println("What is the pitcher's last name: ");
		String lastName = stdId.nextLine();

		String fullName = firstName + " " + lastName;

		return fullName;
	}

	// Calculates ERA
	public static double pitcherEra(Scanner stdId, String name) {
		System.out.println("How many earned runs did " + name + " have?");
		int runs = stdId.nextInt();

		System.out.println("How many innings did " + name + " pitch?");
		int pitch = stdId.nextInt();

		double era = ((runs * 9.0) / pitch);

		return era;

	}

}
