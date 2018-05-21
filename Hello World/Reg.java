import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * Write a description of class RRotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reg

{
    public static void main( String[] args)
    {
        LCD.drawString("Program 4", 0, 0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.setSpeed(720);
        Motor.B.setSpeed(720);
        Motor.A.rotate(720,true);
        Motor.B.rotate(720,true);
        
    }
}