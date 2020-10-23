
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
    }
}
