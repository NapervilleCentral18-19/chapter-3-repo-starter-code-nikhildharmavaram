
/**
 * Check to see if 3 numbers are in order
 *
 * Nikhil, Sri
 * 10/7/20
 */
import java.util.Scanner;
public class NumOrder
{
    
  public static void main(String[] args){     
      Scanner in = new Scanner(System.in);      
      System.out.print("Enter three numbers: ");           
      double a = in.nextDouble();      
      double b = in.nextDouble();      
      double c = in.nextDouble(); 
      if ((a < b && b < c) || (c < b && b < a))
      { System.out.println("In order");
        }
      else
      { System.out.println("Not in order");
        }
      
      
}
}
