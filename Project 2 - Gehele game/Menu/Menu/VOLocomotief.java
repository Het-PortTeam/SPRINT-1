import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOLocomotief here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOLocomotief extends Actor
{
    /**
     * Act - do whatever the VOLocomotief wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public static int x;
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("t") && getX() < 1200){
            setLocation(getX() + 3, getY());
        }
        if (getX() >= 1200) {
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(VOLocomotief.class));
        }
    }    
}
