package Alphabetic;
import java.util.Scanner;

public class AlphabeticOrder {

	public static void main(String[] args) {
		// Putting letter in the alphabetical order
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the letters ");
		String s1 = keyboard.nextLine();
		String s2 = keyboard.nextLine();
		String upperS1 = s1.toUpperCase();
		String upperS2 = s2.toUpperCase();
		if (upperS1.compareTo(upperS2) < 0) {
		System.out.println(s1 + " preceded " + s2 + " in ALPHABETIC ordering");
		}
		else if (upperS2.compareTo(upperS1) > 0) {
		System.out.println(s2 + " follows " + s1 + "in ALPHABETIC ordering");
		}
		else	
		System.out.println(s1 + " equals " + s2 + " ignoring case ");
	}

}
