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
    public boolean tClicked;
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("t") && getX() < 1280){
            tClicked = true;           
        } 
        if (isAtEdge()){
            tClicked = false;
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(VOLocomotief.class));
        }
        if(tClicked == true){
           setLocation(getX() + 3, getY());
        }
    }    
}
