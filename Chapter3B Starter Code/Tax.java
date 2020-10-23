
/**
 * Write a description of class Tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Tax
{
    public static void main(String args[])
    {
        int income;
        double tax;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Income: ");
        income = keyboard.nextInt();
        if (income < 50000)
        {
            tax = income * 0.01;
        }
        else if (income >= 50000 && income < 75000)
        {
            double tax1 = 50000 * 0.01;
            double tax2 = (income - 50000) * 0.02;
            tax = tax1 + tax2;
        }
        else if (income >= 75000 && income < 100000)
        {
            double tax1 = 50000 * 0.01;
            double tax2 = 25000 * 0.02;
            double tax3 = (income - 75000) * 0.03;
        }
    }
}
