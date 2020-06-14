// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private Backround backround =  new Backround();
    private int time = 0;
    private int score = 0;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(1200, 800, 1, false);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(backround, 600, 401);
        Backround backround2 =  new Backround();
        addObject(backround2, 1800, 401);
        car car =  new car();
        addObject(car, 69, 393);
    }

    /**
     * 
     */
    public void act()
    {
        int antal = Greenfoot.getRandomNumber(30 + getspeed());
        if (antal < 1) {
            int y = Greenfoot.getRandomNumber(800);
            house House =  new house();
            addObject(House, 1200, y);
        }
        if (time == 20) {
            score = score + 1;
            time = 0;
        }
        time = time + 1;
        showText("Score" + score, 40, 150);
    }

    /**
     * 
     */
    public int getspeed()
    {
        return backround.getspeed();
    }
}
