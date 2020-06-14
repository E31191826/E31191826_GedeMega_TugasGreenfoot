// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class house extends Actor
{

    /**
     * Act - do whatever the house wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        int speed = world.getspeed();
        move(speed);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
