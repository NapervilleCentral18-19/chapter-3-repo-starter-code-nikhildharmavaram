package e03;

import java.util.Scanner;

public class AdjacentDuplicates
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      
      // Find and print adjacent duplicates 1 2 3 4 4 3 2 1 1
      System.out.print("Enter as many numbers as you want. Press Q to stop.");
      String input;
      String inputs = "";
      while(in.hasNextInt())
      {
         input = String.valueOf(in.nextInt());
         inputs += input;
      }
      for (int i = 0; i < inputs.length(); i++)
      {
        if (inputs.charAt(i) == inputs.charAt(i+1))
        {
            System.out.println(inputs.charAt(i) + " and " + inputs.charAt((i + 1)) + " are adjacent duplicates");
        }
      }
   }
}
