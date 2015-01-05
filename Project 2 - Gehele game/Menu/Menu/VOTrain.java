import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOTrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOTrain extends Actor
{
    /**
     * Act - do whatever the VOTrain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int x;
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("t") && getX() < 1100){
            setLocation(getX() + 3, getY());
        } 
        if (getX() >= 1100){
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(VOTrain.class));
        }
    }    
}
