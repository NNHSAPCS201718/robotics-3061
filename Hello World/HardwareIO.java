import lejos.nxt.UltrasonicSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
/**
 * Write a description of class HardwareIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardwareIO
{
    public static void main(String[] args)
    {
        UltrasonicSensor a = new UltrasonicSensor(SensorPort.S1);
        LCD.drawString("Sound Sensor", 0, 0);
        LCD.drawString("" + a.getDistance(), 0, 1);
        while(a.getDistance() > 10)
        {
            Motor.A.forward();
            Motor.B.forward();
            LCD.drawString("" + a.getDistance(), 0, 2);
        }
    }
}
