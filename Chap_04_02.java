// Nancy McCoy 2242343

package mccoy3;

public class Chap_04_02 {

	public static void main(String[] args) {
		
		 int randomNum;
		
		 randomNum= 48 + (int)(Math.random() * 74);
				
		 char ch = (char)randomNum;
		 
		 System.out.println("The integer is " + randomNum);
		 System.out.println("The ASCII character for that number is " + (char)randomNum);
		 if (Character.isUpperCase(randomNum))
			 System.out.println("That is an upper case letter");
		 else if(Character.isLowerCase(randomNum))
			 System.out.println("That is a lower case letter");	 
				
	}

}
