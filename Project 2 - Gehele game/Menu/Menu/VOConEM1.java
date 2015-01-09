import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConEM1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConEM1 extends VOConEM
{
    World myWorld = getWorld();
    VrachtOverslaan VrachtOverslaan = (VrachtOverslaan)myWorld;
    private int xSpeed = 2;
    private int vSpeed = 2;
    
    /**
     * Act - do whatever the VOConEM1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!getObjectsInRange(25, VOgrijper20.class).isEmpty() && !VrachtOverslaan.grijper.grab){
            VrachtOverslaan.grijper.grab = true;
            setLocation(getX() +xSpeed, getY() +vSpeed);
        }
        
        if(isAtEdge()){
            VrachtOverslaan.grijper.grab = false;
            myWorld.removeObject(this);
        }
    }    
}
