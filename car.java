// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class car extends Actor
{
    private int liv = 8;

    /**
     * Act - do whatever the car wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 5);
        }
        if (isTouching(house.class)) {
            liv = liv - 1;
            removeTouching(house.class);
        }
        getWorld().showText("liv" + liv, 20, 100);
        if (liv == 0) {
            getWorld().showText("GameOver", 600, 400);
            Greenfoot.stop();
        }
    }
}
