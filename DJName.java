// Allen Bao
// 10/20/21
// A program that takes in a person's first and last name and returns their DJ name

/*
   first name = input
   last name = input
   
   print first name substring (first, middle)
   print last name substring (middle, last, last - 1 if odd)
   print Jayster
*/

import java.util.Scanner;

public class DJName {
   public static void main(String[] args) {
      
      // Create varibables to store first and last name
      String firstName, lastName;
      
      // Create a scanner
      Scanner keyboard = new Scanner(System.in);
      
      // Get user's input and store it firstName and lastName
      System.out.print("What is your first name? ");
      firstName = keyboard.nextLine();
      
      System.out.print("What is your last name? ");
      lastName = keyboard.nextLine();
      
      // Go from start to middle, int division will never round up so it won't have the middle letter
      String firstNameHalf = firstName.substring(0, firstName.length() / 2);
      // Start from the same middle letter as before, don't include last letter if odd so subtract 1 from the end if the length is odd
      String lastNameHalf = lastName.substring(lastName.length() / 2, lastName.length()-(lastName.length())%2);
      
      // Print out the result
      System.out.println(firstNameHalf + lastNameHalf + "Jayster");
   }
}