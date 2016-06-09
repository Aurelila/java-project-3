//Nancy McCoy 2242343

package mccoy3;

import java.util.Scanner;

public class Chap_03_04 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//Prompts the user to enter the number of shirts they are buying.
		System.out.print("How many shirts would you like to buy? ");
		int customerOrder = input.nextInt(); 
		
		double shirts = 19.95;
		double discount = 0;
		
		// Calculates the discount based on users choice of shirts.
		if (customerOrder == 3 || customerOrder == 4){
			discount = .10;
		}
		else if (customerOrder == 5 || customerOrder == 6 || customerOrder == 7){
			discount = .20;
		}
		else if (customerOrder == 8 || customerOrder == 9 || customerOrder == 10 || customerOrder == 11){
			discount = .30;
		}
		else if (customerOrder >= 12) {
			discount = .40;
		}
		
		//Calculates the grand total.
		double custTotal = Math.round(shirts * customerOrder) * (1.0 - discount);
				
		//Outputs the totals and discounts.
		System.out.println("Your discount is " + discount);
		System.out.println("Your total is " + custTotal);
	}
}