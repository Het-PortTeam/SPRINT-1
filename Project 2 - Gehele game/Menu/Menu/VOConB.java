import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConB extends Actor
{
    /**
     * Act - do whatever the VOConB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int x;
    int Xspeed = 0;
    private Counter counter;
    public void act() 
    {
        if (Greenfoot.isKeyDown("q") && !getObjectsInRange(25, VOGrijper.class).isEmpty()){
             Xspeed = 3;  }
             
             if ((Greenfoot.isKeyDown("e"))){
                 Xspeed = 0;
                }
        
        if (!getObjectsInRange(25, VOTrain.class).isEmpty()){
                 if (Greenfoot.isKeyDown("t") && getX() < 1100){
                     setLocation(getX() + 3, getY());
                    }
                    if (getX() >= 1100){
                        World world;
                        world = getWorld();
                        world.removeObjects(world.getObjects(VOConB1.class));
                    }
                }
    }    
}
