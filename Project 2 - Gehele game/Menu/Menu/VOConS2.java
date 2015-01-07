import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConS2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConS2 extends VOConS
{
    int Xspeed = 0;
    private Counter counter;
    public boolean tClicked;
    /**
     * Act - do whatever the VOConS2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("q") && !getObjectsInRange(25, VOGrijper.class).isEmpty()){
             Xspeed = 3;   }

               if ((Greenfoot.isKeyDown("e"))){
                 Xspeed = 0;
                }
                
                if (!getObjectsInRange(25, VOTrain.class).isEmpty()){
                 if (Greenfoot.isKeyDown("t") && getX() < 1280){
                        tClicked = true;           
                    } 
                    if (isAtEdge()){
                        World myWorld = getWorld();
                        VrachtOverslaan VrachtOverslaan = (VrachtOverslaan)myWorld;
                        Counter counter = VrachtOverslaan.getCounter();
                        counter.add(1);
                        myWorld.removeObject(this);
                    }
                    if(tClicked == true){
                        setLocation(getX() + 3, getY());
                    }
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
