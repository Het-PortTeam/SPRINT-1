import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class VOConS5 here.
 * 
 * @author (Oscar Veldman, Johan Bos, Kevin Verweij) 
 * @version (a version number or a date)
 */
public class VOConS1 extends VOConS
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
        
        //grab
        if (Greenfoot.isKeyDown("q") && !getObjectsInRange(25, VOGrijper.class).isEmpty() && !VrachtOverslaan.grijper.grab){
                 VrachtOverslaan.grijper.grab = true;
                 Xspeed = 3;
            }
           
               if (Greenfoot.isKeyDown("e") && VrachtOverslaan.grijper.grab  && !getObjectsInRange(60, VOTrain.class).isEmpty()){
                 VrachtOverslaan.grijper.grab = false;
                 Xspeed = 0;
                } 
                
                
                //train
                if (!getObjectsInRange(60, VOTrain.class).isEmpty()){
                 if (Greenfoot.isKeyDown("t") && getX() < 1260){
                        tClicked = true;           
                    } 
                    if(tClicked == true){
                        setLocation(getX() + 3, getY());
                    }
                }
                   
                if (getWorld().getObjects(VOLocomotief.class).isEmpty() && getWorld().getObjects(VOTrain.class).isEmpty() && getY() >= 600 && getY() <= 694){
                        counter.add(1);
                        myWorld.removeObject(this);
                    }
                    
                
      //besturing w,s,a,d       
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
    
    //pijl bestuuring
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
