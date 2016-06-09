// Nancy McCoy 2242343

package mccoy3;

import java.util.Scanner;

public class Chap_04_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompts the user to input a three word phrase.
		System.out.print("Enter a three word phrase as one string.");
		String inputS = input.nextLine();
		
		//Outputs the number of characters.
		System.out.println("The number of characters including spaces are: " + inputS.length() );
		
		//Outputs the number of characters in the middle word.
		String[] parts = inputS.split(" ");
		System.out.println("The number of characters in the middle word is: " + parts[1].length() );
		
		//Outputs the final word in all caps.
		System.out.println("The final word in all upper case: " + parts[2].toUpperCase() );
	}

}
