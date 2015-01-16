import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOCrane extends Actor
{
    /**
     * Act - do whatever the crane wants to do. This method is called whenever
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
    if(Greenfoot.isKeyDown("left")){
        setLocation(getX() -Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("right")){
        setLocation(getX() +Xspeed, getY());
    }
    
    if(!getObjectsInRange(25, VOGrijper.class).isEmpty()){}
    }    
}
