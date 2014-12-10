import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOCrane2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOCrane2 extends Actor
{
    /**
     * Act - do whatever the VOCrane2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        while (getX() < 800) {
            setLocation(getX() -3, getY());
        }
    }    
    
    public void ai()
    {

    }
    
}
