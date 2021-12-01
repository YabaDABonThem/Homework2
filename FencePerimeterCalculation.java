// Allen Bao
// 10/24/21
// A program that takes user input for a rectangular and circular fence and tells you the perimeter/circumference of each
// to help you save wood. 

/*
   radius = input
   length = input
   width = input
   
   print 2 * PI * radius (circumference formula)
   print length * 2 + width * 2 (perimeter formula)
*/

import java.util.Scanner;

public class FencePerimeterCalculation {
   public static void main(String[] args) {
      // Create varibles to store user input
      double radius, length, width;
      
      // Get the user's input
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is the radius of the circle? ");
      radius = keyboard.nextDouble();
      
      System.out.print("What is the length of the rectangle? ");
      length = keyboard.nextDouble();

      System.out.print("What is the width of the rectangle? ");
      width = keyboard.nextDouble();
      
      // Calculate the circumference and Perimeter and print it out
      System.out.println("The circle circumference is " + (2 * radius * Math.PI));
      System.out.println("The perimeter of the rectangle is " + (length * 2 + width * 2));
      
   }
}