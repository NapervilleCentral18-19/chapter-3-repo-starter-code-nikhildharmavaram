package e03;

import java.util.Scanner;

public class LargestInput
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String input;
      String inputs = "";
      System.out.print("Enter a series of numbers, then type Q to process: ");
      char largest, smallest;
      while (in.hasNextInt())
      {
          input = in.nextInt();
      }
      largest = input.maxValue();
      smallest = input.minValue();
      // Loop on input and check for a new min or max

      // Output the results
      System.out.print("Largest: " + largest + "\n" + "Smallest: " + smallest);
   }
}
