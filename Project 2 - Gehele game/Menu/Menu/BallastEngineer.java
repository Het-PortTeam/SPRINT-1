import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallastEngineer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallastEngineer extends World
{

    /**
     * Constructor for objects of class BallastEngineer.
     * 
     */
    public BallastEngineer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        //einde
        addObject(new BackButton(), 75, 50);
    }
}
