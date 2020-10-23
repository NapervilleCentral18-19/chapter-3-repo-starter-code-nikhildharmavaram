
/**
 * Tells whether the triangle is scalene, equilateral, and isoceles
 * Nikhil Dharmaavaram
 * 10/21/20
 */
import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        int a, b, c;
        String answer;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a for angles, s for sides: ");
        answer = keyboard.next().toLowerCase(); //bulletproofs options
        System.out.print("Enter 3 numbers: ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        if (answer.equals("a"))
        {
            if (a == 0 || b == 0 || c == 0)
            {
                System.out.println("Angles in a triangle cannot equal 0 degrees");
            }
            else if (a + b + c == 180)
            {
                if (a == 90 || b == 90 || c == 90)
                {
                    System.out.println("Triangle is right");
                }
                else if (a == b || b == c || a == c)
                {
                    System.out.println("Triangle is isoceles");
                }
                else if (a == b && b == c)
                {
                    System.out.println("Triangle is equilateral");
                }
            }
            
            else
            {
                System.out.println("Angles in a triangle must equal 180 degrees");
            }
        }
        else if (answer.equals("s"))
        {
            if (a + b >= c && b + c >= a && a + c >= b)
            {
                if (a == b && b == c)
                {
                    System.out.println("Triangle is equilateral");
                }
                else if (a == b || b == c || a == c)
                {
                    System.out.println("Triangle is isoceles");
                }
                else
                {
                    System.out.println("Triangle is scalene");
                }
            }
            else
            {
                System.out.println("Triangle is not possible");
            }
        }
}
}
/* Test 1: Enter a for angles, s for sides: s
Enter 3 numbers: 3 3 3
Triangle is equilateral
Test 2: Enter a for angles, s for sides: s
Enter 3 numbers: 3 4 5
Triangle is scalene
Test 3: Enter a for angles, s for sides: a
Enter 3 numbers: 90 90 90
Angles in a triangle must equal 180 degrees
Test 4: Enter a for angles, s for sides: a
Enter 3 numbers: 90 90 0
Angles in a triangle cannot equal 0 degrees */
