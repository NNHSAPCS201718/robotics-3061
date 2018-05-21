
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.util.Delay;
import lejos.nxt.*;

/**
 * 
 * @author
 *
 */
public class Tachometer
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        LCD.drawString("Program 2", 0, 0);
        Button.waitForAnyPress();
        Motor.A.setSpeed(720);
        Motor.A.forward();
        LCD.clear();
        Delay.msDelay(2000);
        LCD.drawInt(Motor.A.getTachoCount(),0,0);
        Motor.A.stop();
        LCD.drawInt(Motor.A.getTachoCount(),0,1);
        Motor.A.backward();
        while(Motor.A.getTachoCount()>0 )
        {
            LCD.drawInt(Motor.A.getTachoCount(),0,2);
        
        }
        //LCD.drawInt(Motor.A.getTachoCount(),0,2);
        Motor.A.stop();
        LCD.drawInt(Motor.A.getTachoCount(),0,3);
        Button.waitForAnyPress();
        
      
    }
}

