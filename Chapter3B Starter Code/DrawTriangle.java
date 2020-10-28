
/**
 * Write a description of class DrawTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;
public class DrawTriangle
{
    public static void main(String args[])
    {
    Random gen = new Random();
    StandardPen pen = new StandardPen();
    pen.home();
    pen.move(30);
    pen.turn(90);
    pen.move(30);
    pen.turn(135);
    pen.move(30 * Math.sqrt(2));

    }
}
