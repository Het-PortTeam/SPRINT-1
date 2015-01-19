import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConEB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConEB extends Actor
{
    World myWorld = getWorld();
    VrachtOverslaan vrachtOverslaan = (VrachtOverslaan)myWorld;
    private int xSpeed = 2;
    private int vSpeed = 2;
    
    /**
     * Act - do whatever the VOConEB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected void addedToWorld(World w)
    {
        
        myWorld = w;
        vrachtOverslaan = (VrachtOverslaan)w;
        super.addedToWorld(w);
    }
    
    public void act() 
    {
         if(!getObjectsInRange(25, VOgrijper20.class).isEmpty() && !vrachtOverslaan.Grijper.grab){
            vrachtOverslaan.Grijper.grab = true;
            setLocation(getX() +xSpeed, getY() +vSpeed);
        
       if (getX() == 2){
          xSpeed = -xSpeed;
        } 
        
        if(getX() == 1000)
        {
         xSpeed = -xSpeed; 
        }
        
        if (getY() == 3){
            vSpeed = -vSpeed;
        }
        
        if (getY() == 1000){
            vSpeed = -vSpeed;
        }
        }
        
        if(isAtEdge() && vrachtOverslaan.Grijper.grab){
            vrachtOverslaan.Grijper.grab = false;
            myWorld.removeObject(this);
        }
    }    
}
