/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;

import java.io.*;       //for File IO

public class ch3notes
{
    Integer one = 1;
    enum Classes  {CalculusAB, English, SpanishIII, Gym, Lunch, APCS, APush, Photo}
    enum Grades {A,B,C,D,F}
    enum Week {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}

      public static void main (String [] args) throws IOException // required for File IO
   {
       /*final double TOLERANCE = .001;
       double num, num1, num2;
       num1 = .01*1 + .05*2 + .1*3 + .25*4; //bit off
       num2 = 500.0/900;
       System.out.println("num1 " + num1);
       System.out.println("num2 " + num2);
       if (Math.abs(num1 - num2) < TOLERANCE)
       { System.out.println("equal");
        }
        else
        { System.out.println("not equal");
        }
       /*DecimalFormat fmt = new DecimalFormat ("0.###");
       Scanner keyboard = new Scanner(System.in);
       Integer two = 2;
       Grades mygrade = Grades.A;
       Grades yourgrade = Grades.B;
       System.out.println(yourgrade.compareTo( mygrade) );
       String[] people = {"Deepa", "Trevor", "Murugan", "Emy",
                          "Thomas", "Charlie",
                          "heinz doofenshmirtz", "Michael",
                          "NoOne", "Bueller","Justin","David"};

       String word = new String("apple");
       String word1 = "cat";
       String word2 = "dog";
       String word3 = new String("apple");
       
       System.out.println("Enter 3 numbers");
       int x = keyboard.nextInt();
       int y = keyboard.nextInt();
       int z = keyboard.nextInt();
       
       /*if (x > y)
       { if (x > z)
           { System.out.println(x + " is the maximum number ");
            }
         else
         { System.out.println(x + " is not the maximum number ");
            }
        }
       else if (y > z)
       { if (y > x)
           { System.out.println(y + " is the maximum number ");
            }
         else
         {  System.out.println(y + " is not the maximum number ");
            }
        }
       else if (z > y)
       { if (z > x)
           { System.out.println(z + " is the maximum number ");
            }
         else
         { System.out.println(z + " is not the maximum number ");
            }
        }
       //logical OR is ||, logical and is &&
       /*if (x > y && x > z)
       { System.out.println(x + " is the maximum");
        }
       else if (y > x && y > z)
       { System.out.println(y + " is the maximum");}
       else if (z > x && z > y)
       { System.out.println(z + " is the maximum");
        }
        
       
       
       /*
       
       if (word1.compareTo(word2) < 0)
       {
        System.out.println(word1+ " is before "+ word2);
        }
       else if (word1.compareTo(word2) > 0)
       {
        System.out.println(word1 + " is after "+ word2);
       }
       else
       {
           System.out.println(word1 + " is equal " + word2);
       }
       /*
       //if (x == 5)
       // {
        //do something if true
       //}
       
       //if (word == word1)//test is the same object thus the same address in memory
       if (word.equals(word1))//boolean
       {
           System.out.println("Hey we are the same!!");
       }
       else
       {
           System.out.println("Hey we are different!!");
       }
       
       if (word.compareTo(word1) == 0)
        System.out.println("Hey we are the same!!");//one statement linked to the if
        System.out.println(word +"--"+word1);
        
       

   /*    int wordCount = 0, characterCount = 0;
             String line, word;
             StringTokenizer tokenizer;

             System.out.println ("Please enter text");

             line = Keyboard.readString();

                tokenizer = new StringTokenizer (line,"/");


        x = Integer.parseInt(input);
        System.out.print(x);





/* WHAT WILL OUTPUT?
    int k =0, j=0;

    System.out.println("k \tj");

    for(j=0; j<20; j+=k)
    {
        k++;
        System.out.println(k + "\t" + j);
    }

    System.out.println("After the loop \n k= " +k +"\tj= " +j);


/*
    Scanner scanFile = new Scanner(new File("people.txt"));
    String name, address, phone;

    while(scanFile.hasNext())
    {

    }



/**/


    Scanner scanFile = new Scanner(new File ("state of the union 2011.txt"));

    //Scanner scanFile = new Scanner
     //(new File ("data\\obamatakebackamerica.txt"));
    //Scanner scanFile = new Scanner
    //(new File ("data\\Debate12016.txt"));
    //Scanner scanFile = new Scanner(new File ("jimmy carter a crisis of confidence.txt"));

/**/
    String word;
    int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0;

    while (scanFile.hasNext()) //until EOF
    {
        scanFile.next();//moves the iterator through the file

        count_words ++;

        System.out.println(word  );



    }//end of while
    System.out.println("The total number of words is" + count_words);
    if (word.equals("we") || word.equals("us"))
    {
        count_p++;
    }
    /**/
    /*Scanner in = new Scanner(System.in);
    while (in.hasNextInt())
    {
        int input = in.nextInt();
        System.out.println("eco-" + input);
    }
    System.out.println("loop over");
    
    


//_______________________basic for and scope of i________________________
/**/
        //ini#1A once only
        //middle#1 boolean test - exec if true
        //body#2 execute the body of the loop
        //last # counter
        //can declare multiple variables of same type, cannot different types
        //ini        test     inc
/**/  for(int i = 0 ; i < 20 ; i++ )
    {
        System.out.print("Hi" + i + "\n");
    }

    //System.out.print("After the Loop" + i + "\n"); //scope of i is in the loop




//--- While loop and sentinel value

/*

    int test;
    System.out.println("Guess my favorite number \n" +
                            "it is between 1-20");
    test = Keyboard.nextInt();

    while (test != -9999)
    {
        if (test == 12)
            System.out.println
                ("it the age of my sons"+
                " Thomas and Charlie");
        else
            System.out.println("Guess again, or -9999 to end the program");

        test = Keyboard.nextInt();

    }



/**/  int i =0;//#1 //ini

        while (i<10)//#2 boolean test
        {
            System.out.print( "i =" + i +"\n");
            i++;//#3 increment
        }


i = 10;
do //will always execute once, post test loop
{
    System.out.print( "i =" + i +"\n");
}
while (i < 10);

/*  */

   }// end of main

}// end of class









