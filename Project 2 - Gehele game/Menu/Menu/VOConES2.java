import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConES2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConES2 extends VOConES
{
    World myWorld = getWorld();
    VrachtOverslaan VrachtOverslaan = (VrachtOverslaan)myWorld;
    private int xSpeed = 2;
    private int vSpeed = 2;
    
    /**
     * Act - do whatever the VOConES2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(!getObjectsInRange(25, VOgrijper20.class).isEmpty() && !VrachtOverslaan.Grijper.grab){
            VrachtOverslaan.Grijper.grab = true;
        }
        
        if(isAtEdge() && VrachtOverslaan.Grijper.grab){
            VrachtOverslaan.Grijper.grab = false;
            myWorld.removeObject(this);
        }
    }    
}
