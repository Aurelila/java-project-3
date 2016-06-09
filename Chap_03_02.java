//Nancy McCoy p2242343

package mccoy3;

import java.util.Scanner;

public class Chap_03_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to ask for an odd number.
		System.out.print("Enter an odd number that is a multiple of 17 and under 200. ");
		int oddNum = input.nextInt();
		
		System.out.println((oddNum % 17 == 0 && oddNum < 200) ? "Acceptable" : "Not Acceptable");
		
		}
}

	