
/**
 * Tells you where a year is a leap year or not a leap year
 *
 * Nikhil Dharmavaram
 * 10/19/20
 */
import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
       int year;
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Year: ");
       year = keyboard.nextInt();
       if (year < 1582) //error message
        System.out.println("Sorry, cannot enter years before 1582");
       else
       {
          if ((year % 100 == 0) && (year % 400 == 0)) //checks if year is divisible by 100 and 400
            System.out.println(year + " is a leap year.");
          else if ((year % 4 == 0) && (year % 100 != 0)) //checks for leap year if year is not divisible by 400
          {
              System.out.println(year + " is a leap year.");
          }
          else 
            System.out.println(year + " is not a leap year.");
            
       }
         
         
    }
}
/* Test 1: Year: 1580
Sorry, cannot enter years before 1582
Test 2: Year: 1900
1900 is not a leap year. 
Test 3: Year: 1984
1984 is a leap year.
Test 4: Year: 2000
2000 is a leap year.*/