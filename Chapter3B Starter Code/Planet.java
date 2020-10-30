
/**
 * Calculate weight on different planets
 *
 * Nikhil Dharmavaram
 * 10/30/20
 */
import java.util.Scanner;
public class Planet
{
   public static void main(String args[])
   {
     int choice; 
     double earthweight;
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter 0 for the Moon, 1 for Mercury, 2 for Venus, 3 for Mars, 4 for Jupiter, 5 for Saturn, 6 for Uranus, 7 for Neptune, and 8 for Pluto\nChoice: "); 
     choice = keyboard.nextInt();
     System.out.print("Enter your weight on Earth: ");
     earthweight = keyboard.nextDouble();
     switch (choice)
     {
       case 0:
       double moonweight = 0.166 * earthweight;
       System.out.println("Your weight on the moon is " + moonweight + " lbs");
       break;
       case 1:
       double mercuryweight = 0.378 * earthweight;
       System.out.println("Your weight on Mercury is "+ mercuryweight + " lbs");
       break;
       case 2:
       double venusweight = 0.907 * earthweight;
       System.out.println("You weight on Venus is "+ venusweight + " lbs");
       break;
       case 3:
       double marsweight = 0.377 * earthweight;
       System.out.println("Your weight on Mars is "+ marsweight + " lbs");
       break;
       case 4:
       double jupiterweight = 2.36 * earthweight;
       System.out.println("Your weight on Jupiter is "+ jupiterweight + " lbs");
       break;
       case 5:
       double saturnweight = 0.916 * earthweight;
       System.out.println("Your weight on Saturn is "+ saturnweight + " lbs");
       break;
       case 6:
       double uranusweight = 0.889 * earthweight;
       System.out.println("Your weight on Uranus is "+ uranusweight + " lbs");
       break;
       case 7:
       double neptuneweight = 1.12 * earthweight;
       System.out.println("Your weight on Neptune is "+ neptuneweight + " lbs");
       break;
       case 8:
       double plutoweight = 0.071 * earthweight;
       System.out.println("Your weight on Pluto is "+ plutoweight + " lbs");
       break;
     }
   }
}
