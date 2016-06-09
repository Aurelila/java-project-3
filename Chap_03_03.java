//Nancy McCoy 2242343

package mccoy3;

import java.util.Scanner;

public class Chap_03_03 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//Prompts the user to enter the number of shirts they are buying.
		System.out.print("How many shirts would you like to buy? ");
		int customerOrder = input.nextInt(); 
		
		double shirts = 19.95;
		
		double discount;
		
		//Uses the switch with the user input to determine the discount given by the number of shirts ordered.
		switch (customerOrder) {
		case 1: 
		case 2: 
			discount = 0.0; 
		break;
		case 3:  
		case 4: 
			discount = .10; 
		break;
		case 5: 
		case 6:
		case 7: 
			discount = .20;
		break;
		case 8: 
		case 9: 
		case 10: 
		case 11: 
			discount = .30;
		break;
		case 12:
		default: 
			discount = .40;
		break;		
		}
		//Calculates the grand total.
		double custTotal = Math.round(shirts * customerOrder) * (1.0 - discount);
		
		//Outputs the totals and discounts.
		System.out.println("Your discount is " + discount);
		System.out.println("Your total is " + custTotal);
	}
}
