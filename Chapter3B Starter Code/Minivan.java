
/**
 * Minivan switch control
 *
 * Nikhil Dharmavaram
 * @10/25/20
 */
import java.util.Scanner;
public class Minivan
{
    public static void main(String args[])
    {
        String switches;
        boolean right, left; 
        // when right = true right door is open
        //when left = true left door is open
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your switches: ");
        switches = keyboard.next();
        if (switches.charAt(8) != 'P' || switches.charAt(3) == '0') //gear + master unlock
        {
            right = false;
            left = false;
        }
        else if (switches.charAt(2) == '1') //childlock
        {
           if (switches.charAt(2) == '1' && switches.charAt(4) == '1' && switches.charAt(6) == '0')
           {
               left = false;
           }
           else
           {
               left = true;
           }
           if (switches.charAt(2) == '1' && switches.charAt(5) == '1' && switches.charAt(6) == '0')
           {
              right = false; 
           }
           else
           {
              right = true; 
           }
        }
        else if ((switches.charAt(0) == '1' || switches.charAt(6) == '1' || switches.charAt(4) == '1') && (switches.charAt(1) == '1' || switches.charAt(7) == '1' || switches.charAt(5) == '1'))
        {
            right = true;
            left = true;
        }
        else
        {
            if (switches.charAt(0) == '1' || switches.charAt(4) == '1' || switches.charAt(6) == '1')
            {
                left = true;
            }
            else
            {
                left = false;
            }
            if (switches.charAt(1) == '1' || switches.charAt(5) == '1' || switches.charAt(7) == '1')
            {
                right = true;
            }
            else
            {
                right = false;
            }
        } // tests each door
        
        if (right == false && left == false)
            System.out.println("Neither door opens");
        else if (right == true && left == false)
            System.out.println("Right door opens");
        else if (right == false && left == true)
            System.out.println("Left door opens");
        else
            System.out.println("Both doors open");
        //prints based on flag outputs
        
    }
}
