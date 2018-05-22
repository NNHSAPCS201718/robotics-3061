import lejos.nxt.SoundSensor;
import lejos.nxt.SensorPort;
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
        SoundSensor a = new SoundSensor(new SensorPort(A));
    }
}
