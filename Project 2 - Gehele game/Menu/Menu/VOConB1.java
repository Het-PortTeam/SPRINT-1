import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class VOConB1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConB1 extends VOConB
{ int x;
  int Xspeed = 0;
    /**
     * Act - do whatever the VOConB1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("q") && !getObjectsInRange(5, VOGrijper.class).isEmpty()){
             Xspeed = 3;   
             
             if (getObjectsInRange(5, VOGrijper.class).isEmpty()){
                 Xspeed = 4;
                }
             
             
       if(Greenfoot.isKeyDown("a")){
            setLocation(getX() -Xspeed, getY());
    } 
     if(Greenfoot.isKeyDown("d")){
            setLocation(getX() +Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("w")){
        if(getY() <= 245){} else {
        setLocation(getX(), getY() -Xspeed);
    }
    }
    if(Greenfoot.isKeyDown("s")){
        if(getY() >= 575){}  else {
        setLocation(getX(), getY() +Xspeed);
    }
    }
    if(Greenfoot.isKeyDown("left")){
        setLocation(getX() -Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("right")){
        setLocation(getX() +Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("up")){
        if(getY() <= 245){} else {
        setLocation(getX(), getY() -Xspeed);
    }
    }
    if(Greenfoot.isKeyDown("down")){
        if(getY() >= 575){}  else {
        setLocation(getX(), getY() +Xspeed);
    }
}
        }
    }    
}
