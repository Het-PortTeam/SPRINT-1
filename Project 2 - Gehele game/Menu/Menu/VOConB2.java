import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConB2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConB2 extends VOConB
{
    
    int Xspeed = 0;
    /**
     * Act - do whatever the VOConB2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act() 
    {
        if (Greenfoot.isKeyDown("q") && !getObjectsInRange(25, VOGrijper.class).isEmpty()){
             Xspeed = 3;   
             
             
             
             
          if (getObjectsInRange(5, VOGrijper.class).isEmpty() && (Greenfoot.isKeyDown("e"))){
                 Xspeed = 0;
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
        if(getY() >= 690){}  else {
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
        if(getY() >= 690){}  else {
        setLocation(getX(), getY() +Xspeed);
    }
}
        }
    }    
} 

