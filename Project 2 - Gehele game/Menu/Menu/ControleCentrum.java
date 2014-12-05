import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControleCentrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControleCentrum extends World
{

    /**
     * Constructor for objects of class ControleCentrum.
     * 
     */
    public ControleCentrum()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(128, 72, 10); 
        addObject(new CCLand1(), 9, 50);
        addObject(new CCLand2(), 120, 58);
        addObject(new CCBoei(), 40, 30);
        addObject(new CCBoei(), 65, 30);
        addObject(new CCBoei(), 90, 30);
        addObject(new CCKade(), 40, 57); 
        addObject(new CCKade(), 65, 57);
        addObject(new CCKade(), 90, 57);
        addObject(new CCSchip(), 90, 20);
    }
}
