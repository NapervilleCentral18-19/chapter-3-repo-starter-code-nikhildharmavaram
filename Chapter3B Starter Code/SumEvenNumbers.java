
/**
 * Write a description of class SumEvenNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumEvenNumbers
{
   public static void main(String args[])
   {
       int sum = 0;
      // The sum of all even numbers between 2 and 100
      for (int i = 2; i < 101; i += 2)
      {
        sum += i;
      }

      // Output the result
      System.out.println(sum);
      
      int j = 0;
      sum = 0;
      while (j < 101)
      {
         sum += j;
         j += 2;
      }
      System.out.println(sum);
   }
}
