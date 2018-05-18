
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.*;

/**
 * 
 * @author
 *
 */
public class MotorRun
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        LCD.drawString("Program 1", 0, 0);
        Button.waitForAnyPress();
        LCD.clear();
        
        Motor.A.forward();
        LCD.drawString("FORWARD",10,9);
        Button.waitForAnyPress();
        LCD.drawString("BACKWARD",10,9);
        Motor.A.backward();
        Button.waitForAnyPress();
        Motor.A.stop();     
    }
}

