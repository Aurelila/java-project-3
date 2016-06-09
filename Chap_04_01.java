// Nancy McCoy 2242343

package mccoy3;

public class Chap_04_01 {
	public static void main(String[] args) {
		
		// Declares the variables.
		double angleC = 90;
		double sideB = 8;
		double sideC= 10;
		double angleA;
		double angleB;
		double sideA;
		
		//Calculates the sides and angles.
		sideA = Math.sqrt((sideC * sideC) - (sideB * sideB));
		angleA = Math.toDegrees(Math.asin(sideA/sideC));
		angleB = angleC - angleA;
		
		// Outputs the information.
		System.out.println("Side A is: " + sideA);
		System.out.println("Angle A is " + angleA);
		System.out.println("Angle B is " + angleB);
		
	}
}
