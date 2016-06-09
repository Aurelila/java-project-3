// Nancy McCoy p2242343

package mccoy3;

import java.util.Scanner;

public class Chap_03_01 {
	public static void main(String[] args) {
		
		// Generates random numbers 1 through 12
		int randomNum = (int)(Math.random() * 12);
		System.out.println("Your number is: " + randomNum);
		
		// If the random number is greater than 7.
		if (randomNum > 7) {
			System.out.println("Your number is greater than 7.");
		}
		//If the random number is less than 7.
		else if (randomNum < 7) {
			System.out.println("Your number is less than 7.");
		}	
		//If the random number is equal to 7.
		else if (randomNum == 7){	 
			System.out.println("Your number is equal to 7.");
				}
			
		}
}
	