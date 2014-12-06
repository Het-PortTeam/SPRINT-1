import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CCSchip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CCSchip extends Actor
{
    /**
     * Act - do whatever the CCSchip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int Speed = 1;
        int X = getX();
        int Y = getY();
        if(Greenfoot.isKeyDown("w")) setLocation(X, Y - Speed);
        if(Greenfoot.isKeyDown("a")) setLocation(X - Speed, Y);
        if(Greenfoot.isKeyDown("s")) setLocation(X, Y + Speed);
        if(Greenfoot.isKeyDown("d")) setLocation(X + Speed, Y);
        
        if(Greenfoot.isKeyDown("s")) setRotation(270);
        if(Greenfoot.isKeyDown("w")) setRotation(90);
        if(Greenfoot.isKeyDown("d")) setRotation(180);
        if(Greenfoot.isKeyDown("a")) setRotation(0);
    }    
}
