import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Douane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Douane extends World
{

    /**
     * Constructor for objects of class Douane.
     * 
     */
    public Douane()
    {    
        super(1280, 720, 1); 
        addObject(new BackButton(), 75, 50);
        addObject(new DVrachtwagen(), 200, 350);
        addObject(new DDoorgaan(), 300, 600);
        addObject(new DControle(), 600, 600);
    }
}
