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
    public boolean tClicked;
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("t") && getX() < 1280){
            tClicked = true;           
        } 
        if (getWorld().getObjects(VOLocomotief.class).isEmpty()){
            tClicked = false;
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(VOTrain.class));
        }
        if(tClicked == true){
           setLocation(getX() + 3, getY());
        }
    }    
}
