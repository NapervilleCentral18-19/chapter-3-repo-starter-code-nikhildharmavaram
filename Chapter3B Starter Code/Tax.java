
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
        double income;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Income: ");
        income = keyboard.nextInt();
        if (income < 50000)
        {
            double tax = income * 0.01;
            System.out.printf("Income: %.2f Tax: %.2f\n", income, tax);
        }
        else if (income >= 50000 && income < 75000)
        {
            double tax1 = 50000 * 0.01;
            double tax2 = (income - 50000) * 0.02;
            double tax = tax1 + tax2;
            System.out.printf("Income: %.2f Tax: %.2f\n", income, tax);
        }
        else if (income >= 75000 && income < 100000)
        {
            double tax1 = 50000 * 0.01;
            double tax2 = 25000 * 0.02;
            double tax3 = (income - 75000) * 0.03;
            double tax = tax1 + tax2 + tax3;
            System.out.printf("Income: %.2f Tax: %.2f\n", income, tax);
        }
        else if (income >= 100000 && income < 250000)
        {
            double tax1 = 50000 * 0.01;
            double tax2 = 25000 * 0.02;
            double tax3 = 25000 * 0.03;
            double tax4 = (income - 100000) * 0.04;
            double tax = tax1 + tax2 + tax3 + tax4;
            System.out.printf("Income: %.2f Tax: %.2f\n", income, tax);
        }
        else if (income >= 250000 && income < 500000)
        {
            double tax1 = 50000 * 0.01;
            double tax2 = 25000 * 0.02;
            double tax3 = 25000 * 0.03;
            double tax4 = 150000 * 0.04;
            double tax5 = (income - 250000) * 0.05;
            double tax = tax1 + tax2 + tax3 + tax4 + tax5;
            System.out.printf("Income: %.2f Tax: %.2f\n", income, tax);
        }
        else
        {
            double tax1 = 50000 * 0.01;
            double tax2 = 25000 * 0.02;
            double tax3 = 25000 * 0.03;
            double tax4 = 150000 * 0.04;
            double tax5 = 250000 * 0.05;
            double tax6 = (income - 500000) * 0.06;
            double tax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6;
            System.out.printf("Income: %.2f Tax: %.2f\n", income, tax);
        }
        
        
    }
}
