
/**
 * Write a description of class TwoPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TwoPair
{
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter 4 numbers: ");
       int a, b, c, d;
       a = in.nextInt();
       b = in.nextInt();
       c = in.nextInt();
       d = in.nextInt();
       
       if ((a == d) && (b == c))
       { System.out.println("Two pair");
        }
       else if ((a == c) && (b == d))
       { System.out.println("Two pair");
        }
       else if ((a == b) && (c == d))
       { System.out.println("Two pair");
        }
       else
       { System.out.println("Not two pair");
        }
   }
}
