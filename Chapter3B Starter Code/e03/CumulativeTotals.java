package e03;

import java.util.Scanner;

public class CumulativeTotals
{
   public static void main(String[] args)
   {
      double sum = 0.0;
      double input;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of numbers, then press Q to exit");
      while(in.hasNextDouble())
      {
          input = in.nextDouble();
          sum += input;
      }
      System.out.println("Sum: " + sum);
   }
}
