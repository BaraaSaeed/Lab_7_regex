
/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */
import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String promptName = "Please enter a valid name: ";
		if (getStringMatchingRegex(scnr, promptName, "[A-Z]{1}[a-z]{0,29}")) {
			System.out.println("Name is valid");
		} else {
			System.out.println("Sorry, name is not valid!");
		}

		String promptEmail = "Please enter a valid email: ";
		if (getStringMatchingRegex(scnr, promptEmail,
				"[a-zA-Z\\d]{5,30}[@]{1}[a-zA-Z\\d]{5,10}[.]{1}[a-zA-Z\\\\d]{2,3}")) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Sorry, email is not valid!");
		}

		String promptPhone = "Enter a valid phone number: ";
		if (getStringMatchingRegex(scnr, promptPhone, "[\\d]{3}[-]\\d{3}[-]\\d{4}")) {
			System.out.println("Phone number is valid");
		} else {
			System.out.println("Sorry, phone number is not valid!");
		}

		String promptDate = "Please enter a valid date: ";
		if (getStringMatchingRegex(scnr, promptDate, "[\\d]{2}[//][\\d]{2}[//]{1}\\d{4}")) {
			System.out.println("Date is valid");
		} else {
			System.out.println("Sorry, date is not valid!");
		}

		String promptHTML = "Please enter a valid HTML element: ";
		if (getStringMatchingRegex(scnr, promptHTML, "[<]{1}[a-z]{1}[>]{1}\\s*\\d*\\w*\\D*[<]{1}[/]{1}[a-z][>]{1}")) {
			System.out.println("HTML element is valid");
		} else {
			System.out.println("Sorry, HTML element is not valid!");
		}

		scnr.close();

	}

	public static boolean getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		input = getString(scnr, prompt);

		if (input.matches(regex)) {
			isValid = true;
		} else {
			isValid = false;
		}
		return isValid;
	}

	/**
	 * Get any string.
	 */
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}

}