
/**
 * Write a description of class switch_example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class switch_example
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
	    char choice;


       // switch statement------------------------------


            System.out.print("What would you like to buy?\n");
            System.out.print("f) fries\n");
            System.out.print("c) cheese\n");
            System.out.print("s) small drink\n");

      choice =  Keyboard.next().charAt(0);
      System.out.println(choice);

      switch(choice)
      { case 'f':
		System.out.println(".99");
		break;
        case 'c':
                System.out.println("1.50");
                break;
        case 's':
                System.out.println("1.10");
                break;
        default:
                System.out.println("Error on input");
                break;
      }
    }
    }
