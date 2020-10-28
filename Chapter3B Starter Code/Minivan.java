
/**
 * Write a description of class Minivan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Minivan
{
    public static void main(String args[])
    {
        String switches;
        boolean right, left;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your switches: ");
        switches = keyboard.next();
        if (switches.charAt(7) != 'P' || switches.charAt(3) == '0')
        {
            right = false;
            left = false;
        }
        else if (switches.charAt(2) == '1' && (switches.charAt(4) == '1' || switches.charAt(5) == '1'))
        {
            right = false;
            left = false;
        }
        else if ((switches.charAt(0) == '1' && switches.charAt(1) == '1') || (switches.charAt(4) == '1' && switches.charAt(5) == '1') || (switches.charAt(6) == '1' && switches.charAt(7) == '1'))
        {
            right = true;
            left = true;
        }
        else if (switches.charAt(0) == '1' || switches.charAt(4) == '1' || switches.charAt(6) == '1')
        {
            right = false;
            left = true;
        }
        else
        {
            right = true;
            left = false;
        }
        
        if (right == false && left == false)
            System.out.println("Neither door opens");
        else if (right == true && left == false)
            System.out.println("Right door opens");
        else if (right == false && left == true)
            System.out.println("Left door opens");
        else
            System.out.println("Both doors open");
            
        
    }
}
