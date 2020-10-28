


import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare_Student
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();

    // pen jumps to center of the graphics window
    //without drawing and points north
    pen.home();

    //draw with pen
    pen.move(30);
    //pick up pen
    //pen.up();
    // move back home
    //pen.home();
    //turn the pen
    pen.turn(90);
    //pen.setColor(Color.green);
    //pen.down();
    //draw with pen
    pen.move(30);
    pen.turn(90);
    //pen.setColor(Color.orange)
    pen.move(30);
    pen.turn(90);
    pen.move(30);
    
    //pen.move(100, 100);
    //pen.setDirection(0);
    //pen.setColor(Color.black);
    //pen.move(100);

}
}