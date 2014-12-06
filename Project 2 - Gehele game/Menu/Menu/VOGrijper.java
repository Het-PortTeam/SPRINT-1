import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOGrijper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOGrijper extends Actor
{
    /**
     * Act - do whatever the VOGrijper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int Xspeed = 3;   
       if(Greenfoot.isKeyDown("a")){
            setLocation(getX() -Xspeed, getY());
    } 
     if(Greenfoot.isKeyDown("d")){
            setLocation(getX() +Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("w")){
        setLocation(getX(), getY() -Xspeed);
    }
    if(Greenfoot.isKeyDown("s")){
        setLocation(getX(), getY() +Xspeed);
    }
    if(Greenfoot.isKeyDown("left")){
        setLocation(getX() -Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("right")){
        setLocation(getX() +Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY() -Xspeed);
    }
    if(Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY() +Xspeed);
    }
    }    
}
