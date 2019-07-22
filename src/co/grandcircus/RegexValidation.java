package co.grandcircus;

import java.util.Scanner;

public class RegexValidation {

	public static void main(String[] args) {
		// initial setup
		Scanner scan = new Scanner(System.in);
		String data;
		System.out.println("Time to validate some data!");
		
		/*// old input prompt
		 * validateName(scan); 
		 * System.out.println("Seems legit."); 
		 * validateMail(scan);
		 * System.out.println("Seems legit."); 
		 * validatePhone(scan);
		 * System.out.println("Seems legit.");
		 * validateDate(scan);
		 * System.out.println("Seems legit.");
		 */

		// check a name
		data = "name";
		validation(scan, data);
		System.out.println("Seems legit.");

		// check email
		data = "mail";
		validation(scan, data);
		System.out.println("Seems legit.");

		// check phone number
		data = "phone";
		validation(scan, data);
		System.out.println("Seems legit.");

		// check a date
		data = "date";
		validation(scan, data);
		System.out.println("Seems legit.");

		// check HTML
		data = "html";
		validation(scan, data);
		System.out.println("Seems legit.");

		scan.close();
	}

	// one method to rule them all
	private static void validation(Scanner scan, String data) {
		boolean isValid = false;
		String input;
		do {
			switch (data) {
			case "name":
				System.out.println("Enter a name: ");
				input = scan.nextLine();
				if (input.matches("[A-Z][a-z]{0,30}?(|\\s{0,1}[A-Z][a-z]{0,30}?)")) {
					isValid = true;
					break;
				} else
					break;
			case "mail":
				System.out.println("Enter an email: ");
				input = scan.nextLine();
				if (input.matches("[a-zA-Z\\d]{5,30}?@[a-zA-Z\\d]{5,10}?.[a-zA-Z\\d]{2,3}?")) {
					isValid = true;
					break;
				} else
					break;
			case "phone":
				System.out.println("Enter a phone number: ");
				input = scan.nextLine();
				if (input.matches("\\d{3}-\\d{3}-\\d{4}")) {
					isValid = true;
					break;
				} else
					break;
			case "date":
				System.out.println("Enter a date: ");
				input = scan.nextLine();
				if (input.matches("[0-3]\\d{1}/[0-1]\\d/[1-2]\\d{3}")) {
					isValid = true;
					break;
				} else
					break;
			case "html":
				System.out.println("Enter HTML tags: ");
				input = scan.nextLine();
				if (input.matches("<([a-zA-Z0-9]*)>\\s{0,1}</\\1>")) {
					isValid = true;
					break;
				} else
					break;
			}
			if (!isValid) {
				System.out.println("Invalid format!");
			}
		} while (!isValid);
		return;
	}
	
	// individual methods
/*	private static void validateName(Scanner scan) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("Enter a name: ");
			input = scan.nextLine();
			if (input.matches("[A-Z][a-z]{0,30}?(|\\s{0,1}[A-Z][a-z]{0,30}?)")) {
				isValid = true;
			} else
				System.out.println("Invalid format!");
		} while (!isValid);
		return;
	}
*/

/*	private static void validateMail(Scanner scan) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("Enter an email: ");
			input = scan.nextLine();
			if (input.matches("[a-zA-Z\\d]{5,30}?@[a-zA-Z\\d]{5,10}?.[a-zA-Z\\d]{2,3}?")) {
				isValid = true;
			} else
				System.out.println("Invalid format!");
		} while (!isValid);
		return;
	}
*/

/*		private static void validatePhone(Scanner scan) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("Enter a phone number: ");
			input = scan.nextLine();
			if (input.matches("\\d{3}-\\d{3}-\\d{4}")) {
				isValid = true;
			} else
				System.out.println("Invalid format!");
		} while (!isValid);
		return;
	}
*/

/*	private static void validateDate(Scanner scan) {
		boolean isValid = false;
		String input;
		do {
			System.out.println("Enter a date: ");
			input = scan.nextLine();
			if (input.matches("[0-3]\\d{1}/[0-1]\\d/[1-2]\\d{3}")) {
				isValid = true;
			} else
				System.out.println("Invalid format!");
		} while (!isValid);
		return;
	}
	*/
}
