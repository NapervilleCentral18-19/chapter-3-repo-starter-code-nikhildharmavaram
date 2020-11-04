
/**
 * Write a description of class PowerOf2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PowerOf2
{
    public static void main(String[] args)
   {
      // The powers of 2 from 2^0 to 2^20
      for (int i = 0; i < 21; i++)
      {
          System.out.println("2 to the power of " + i + " is " + Math.pow(2, i));
      }
      
      int j = 0;
      while (j < 21)
      {
          System.out.println("2 to the power of " + j + " is " + Math.pow(2, j));
          j++;
      }
      
   }
}
