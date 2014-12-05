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
        super(1280, 720, 1); 
        addObject(new CCLand1(), 50, 495);
        addObject(new CCLand2(), 1220, 565);
        addObject(new CCBoei(), 300, 300);
        addObject(new CCBoei(), 650, 300);
        addObject(new CCBoei(), 1000, 300);
        addObject(new CCKade(), 300, 570); 
        addObject(new CCKade(), 650, 570);
        addObject(new CCKade(), 1000, 570);
        addObject(new CCSchip(), 900, 200);
    }
}
