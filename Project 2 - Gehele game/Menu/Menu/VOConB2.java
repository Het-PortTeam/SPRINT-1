import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class VOConS5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConB2 extends VOConB
{
    int Xspeed = 0;
    private Counter counter;
    public boolean tClicked;
    World myWorld = getWorld();
    VrachtOverslaan VrachtOverslaan = (VrachtOverslaan)myWorld;
    
    /**
     * Act - do whatever the VOConS5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World myWorld = getWorld();
        VrachtOverslaan VrachtOverslaan = (VrachtOverslaan)myWorld;
        Counter counter = VrachtOverslaan.getCounter();
        
        
        if (Greenfoot.isKeyDown("q") && !getObjectsInRange(25, VOGrijper.class).isEmpty() && !VrachtOverslaan.grijper.grab){
                 VrachtOverslaan.grijper.grab = true;
                 Xspeed = 3;
            }
           
               if ((Greenfoot.isKeyDown("e")) && VrachtOverslaan.grijper.grab && !getObjectsInRange(60, VOTrain.class).isEmpty()){
                 VrachtOverslaan.grijper.grab = false;
                 Xspeed = 0;
                } 
                
                if (!getObjectsInRange(60, VOTrain.class).isEmpty()){
                 if (Greenfoot.isKeyDown("t") && getX() < 1260){
                        tClicked = true;           
                    } 
                    if(tClicked == true){
                        setLocation(getX() + 3, getY());
                    }}
                    if (getWorld().getObjects(VOLocomotief.class).isEmpty() && getWorld().getObjects(VOTrain.class).isEmpty() && getY() >= 600 && getY() <= 694){
                        counter.add(10);
                        myWorld.removeObject(this);
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
