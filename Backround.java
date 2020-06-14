// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Backround extends Actor
{
    private int time = 0;
    private int speed = -5;

    /**
     * Act - do whatever the Backround wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getX() < -600) {
            setLocation(getX() + 2400, 401);
        }
        else {
        }
        move(speed);
        
        time = time + 1;
        if (time == 150) {
            speed = speed - 1;
            time = 0;
        }
    }

    /**
     * return speed
     */
    public int getspeed()
    {
        return speed;
    }
}
