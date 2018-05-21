
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.util.Delay;
import lejos.nxt.*;
/**
 * Write a description of class RotationControl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rotation
{
    public static void main(String[] args)
    {
        LCD.drawString("Rotation", 0, 0);
        Motor.A.rotate(1440);
        LCD.drawInt(Motor.A.getTachoCount(),0,1);
        Motor.A.rotateTo(0);
        LCD.drawInt(Motor.A.getTachoCount(),0,2);
        Button.waitForAnyPress();
    }
}
